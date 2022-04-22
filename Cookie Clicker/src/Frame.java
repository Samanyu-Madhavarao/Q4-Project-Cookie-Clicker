import java.awt.BasicStroke;
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
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
	
	//cookie objects
	static Background cookieBackground = new Background(0,0,"cookieBackground");;
	static Background farmBackground = new Background(200, 60, "farmBackground");
	static Background mineBackground = new Background(200, 150, "mineBackground");
	static Background factoryBackground = new Background(200, 240, "factoryBackground");
	static Background countryBackground = new Background(200, 330, "countryBackground");
	static Background colonyBackground = new Background(200, 420, "colonyBackground");
	static Background galaxyBackground = new Background(200, 510, "galaxyBackground");
	
  
	//cookie background objects
	Cookie cookie;
	Milk milk = new Milk(0, 425);
	
	//shop buttons
	ShopButtons farmShop = new ShopButtons(751, 200, "FarmShop");
	ShopButtons mineShop = new ShopButtons(751, 300, "MineShop");
	ShopButtons factoryShop = new ShopButtons(751, 400, "FactoryShop");
	ShopButtons countryShop = new ShopButtons(751, 500, "CountryShop");
	
	//building lists
	ArrayList<Building> farms;
	ArrayList<Building> mines;
	ArrayList<Building> factories;
	ArrayList<Building> countries; 
	ArrayList<Building> colonies;
	ArrayList<Building> galaxies;
	
	//cookie trackers
	private int numCookies;
	private int cookiesPerSecond;

	
	public void paint(Graphics g) {
		super.paintComponent(g);		
		cookieBackground.paint(g);
		farmBackground.paint(g);
		mineBackground.paint(g);
		factoryBackground.paint(g);
		countryBackground.paint(g);
		colonyBackground.paint(g);
		galaxyBackground.paint(g);

		
		new BasicStroke(5);
		g.drawRect(200, 60, 550, 90);
		g.drawRect(200, 150, 550, 90);
		g.drawRect(200, 240, 550, 90);
		g.drawRect(200, 330, 550, 90);
		g.drawRect(200, 420, 550, 90);
		g.drawRect(200, 510, 550, 90);
		
		
		cookie.paint(g);
		milk.paint(g);
		
		farmShop.paint(g);
		mineShop.paint(g);
		factoryShop.paint(g);
		countryShop.paint(g);
		
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
		
		g.setColor(Color.blue);
		g.fillRect(750, 0, 250, 50);
		g.setColor(Color.CYAN);
		g.drawString("SHOP", 825, 35);
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
		
		
		
		cookie = new Cookie(25, 175);
		
		farms = new ArrayList<Building>();
		mines = new ArrayList<Building>();
		factories = new ArrayList<Building>();
		countries = new ArrayList<Building>();
		colonies = new ArrayList<Building>();
		galaxies = new ArrayList<Building>();
		
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
		int x = e.getX();
		int y = e.getY();
		if(x > 50 && x < 175 && y > 125 && y < 350) {
			numCookies++;
			cookie.clicked1();
		}
		System.out.println(numCookies);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		if(x > 50 && x < 175 && y > 125 && y < 350) {
			cookie.clicked2();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}
