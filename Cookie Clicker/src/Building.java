import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Building {
	private int x, y;
	private Image img;
	private AffineTransform tx;

	public Building(int x, int y, String i) {
		this.x = x;
		this.y = y;
		img = getImage("/imgs/"+i+".png");
		tx = AffineTransform.getTranslateInstance(x, y);
		init(x, y); 
	

	}
	
	public int getX() {return x;}
	
	public void paint(Graphics g) {
		//these are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;
		
		//call update to update the actual picture location
		update();
		g2.drawImage(img, tx, null);

	}
	/* update the picture variable location */
	private void update() {

		
		
	}
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(1, 1);
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
