import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

public class Cookie{
	
	//add location attributes
	private int x, y;
	private Image img; 	
	private AffineTransform tx; 

	public Cookie(int x, int y) {
		this.x = x;
		this.y = y;
		img = getImage("/imgs/MainCookie.png");
		tx = AffineTransform.getTranslateInstance(x, y);
		init(x, y); 				
	}

	
	public void paint(Graphics g) {
		//these are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;
		
		//call update to update the actualy picture location
		update();
		g2.drawImage(img, tx, null);

	}
	
	public void clicked() {
		tx.scale(0.8, 0.8);
		tx.scale(1.25, 1.25);
		
	}
	/* update the picture variable location */
	private void update() {

		
		
	}
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(3, 3);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Background.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}

}
