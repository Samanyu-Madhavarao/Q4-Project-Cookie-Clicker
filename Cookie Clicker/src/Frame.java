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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
	

	static Background cookieBackground = new Background(0,0,"cookieBackground");;

	static Background farmBackground = new Background(200, 60, "farmBackground");
	static Background mineBackground = new Background(200, 150, "mineBackground");
	static Background factoryBackground = new Background(200, 240, "factoryBackground");
	static Background countryBackground = new Background(200, 330, "countryBackground");
	static Background colonyBackground = new Background(200, 420, "colonyBackground");
	static Background galaxyBackground = new Background(200, 510, "galaxyBackground");
	static Background shopBackground = new Background(750, 100, "shopBackground");
	static Background shopBackground2 = new Background(750, 330, "shopBackground");
	static Background shopBackground3 = new Background(750, 200, "shopBackground");
	static Background shopBackground4 = new Background(750, 460, "shopBackground");
	static Background shopBackground5 = new Background(750, 0, "shopBackground");
	
	Cookie cookie = new Cookie(25, 175);
	Milk milk = new Milk(0, 425);
	private int numCookies;

	
	public void paint(Graphics g) {
		super.paintComponent(g);		
		cookieBackground.paint(g);
		farmBackground.paint(g);
		mineBackground.paint(g);
		factoryBackground.paint(g);
		countryBackground.paint(g);
		colonyBackground.paint(g);
		galaxyBackground.paint(g);
		shopBackground.paint(g);
		shopBackground2.paint(g); 
		shopBackground3.paint(g);
		shopBackground4.paint(g);
		shopBackground5.paint(g);
		
		
		g.drawRect(200, 60, 550, 90);
		g.drawRect(200, 150, 550, 90);
		g.drawRect(200, 240, 550, 90);
		g.drawRect(200, 330, 550, 90);
		g.drawRect(200, 420, 550, 90);
		g.drawRect(200, 510, 550, 90);
		
		
		
		cookie.paint(g);
		milk.paint(g);
		
		if(numCookies > 5) {
			milk.changePicture("imgs/Milk2.gif");
		}
		if(numCookies > 10) {
			milk.changePicture("imgs/Milk3.gif");
		}
		if(numCookies > 15) {
			milk.changePicture("imgs/Milk4.gif");
		}
		
		g.setColor(Color.CYAN);
		g.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		g.drawString("Cookies:" + numCookies, 27, 125);
	}
	
	public Frame() {
		JFrame f = new JFrame("Cookie Clicker");
		f.setSize(new Dimension(995, 629));
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
		
		numCookies = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();

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
		int x = e.getX();
		int y = e.getY();
		if(x > 50 && x < 225 && y > 125 && y < 350) {
			numCookies++;
			cookie.clicked();
		}
		System.out.println(numCookies);
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
