import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
	
	static Background cookieBackground;
	static Background farmBackground;
	static Background mineBackground;
	static Background factoryBackground;
	static Background countryBackground;
	static Background colonyBackground;
	static Background galaxyBackground;
	
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		cookieBackground.paint(g);
		farmBackground.paint(g);
		mineBackground.paint(g);
		factoryBackground.paint(g);
		countryBackground.paint(g);
		colonyBackground.paint(g);
		galaxyBackground.paint(g);
		g.drawRect(200, 60, 550, 90);
		g.drawRect(200, 150, 550, 90);
		g.drawRect(200, 240, 550, 90);
		g.drawRect(200, 330, 550, 90);
		g.drawRect(200, 420, 550, 90);
		g.drawRect(200, 510, 550, 90);
		
	}
	
	public Frame() {
		JFrame f = new JFrame("Cookie Clicker");
		f.setSize(new Dimension(1000, 629));
		f.setBackground(Color.blue);
		f.add(this);
		f.setResizable(false);
		f.setLayout(new GridLayout(1,2));
		f.addMouseListener(this);
		f.addKeyListener(this);
		Timer t = new Timer(16, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		cookieBackground = new Background(0,0,"cookieBackground");
		farmBackground = new Background(200, 60, "farmBackground");
		mineBackground = new Background(200, 150, "mineBackground");
		factoryBackground = new Background(200, 240, "factoryBackground");
		countryBackground = new Background(200, 330, "countryBackground");
		colonyBackground = new Background(200, 420, "colonyBackground");
		galaxyBackground = new Background(200, 510, "galaxyBackground");
		
		
			
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}
