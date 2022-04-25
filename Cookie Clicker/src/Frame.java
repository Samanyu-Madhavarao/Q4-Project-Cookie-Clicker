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
	static Background shopBackground = new Background(750, 0, "ShopBackground", 1, 1);
	
	
	static itemFrame frame1 = new itemFrame(750, 50);
	

	//cookie background objects
	Cookie cookie;
	Milk milk = new Milk(0, 425);
	
	//shop buttons
	ShopButtons farmShop = new ShopButtons(785, 150, "FarmShop");
	ShopButtons mineShop = new ShopButtons(785, 225, "MineShop");
	ShopButtons factoryShop = new ShopButtons(785, 300, "FactoryShop");
	ShopButtons countryShop = new ShopButtons(785, 375, "CountryShop");
	ShopButtons colonyShop = new ShopButtons(785, 450, "ColonyShop");
	
	//building lists
	ArrayList<Building> farms;
	ArrayList<Building> mines;
	ArrayList<Building> factories;
	ArrayList<Building> countries; 
	ArrayList<Building> colonies;
	ArrayList<Building> galaxies;
	
	//building positions
	int farmXMin, farmXMax, farmYMin, farmYMax;
	int mineXMin, mineXMax, mineYMin, mineYMax;
	int factoryXMin, factoryXMax, factoryYMin, factoryYMax;
	int countryXMin, countryXMax, countryYMin, countryYMax;
	int colonyXMin, colonyXMax, colonyYMin, colonyYMax;
	 
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

		shopBackground.paint(g);
		frame1.paint(g);

		
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
		colonyShop.paint(g);
		
		for(int i = 0; i < farms.size(); i++) {
			farms.get(i).paint(g);
		}
		
		for(int i = 0; i < mines.size(); i++) {
			mines.get(i).paint(g);
		}
		
		for(int i = 0; i < factories.size(); i++) {
			factories.get(i).paint(g);
		}
		
		for(int i = 0; i < countries.size(); i++) {
			countries.get(i).paint(g);
		}
		
		for(int i = 0; i < colonies.size(); i++) {
			colonies.get(i).paint(g);
		}
		
		for(int i = 0; i < galaxies.size(); i++) {
			galaxies.get(i).paint(g);
		}
		
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
		farmXMin = 200; farmXMax = 240;
		farmYMin = 70; farmYMax = 100;
		mineXMin = 200; mineXMax = 240;
		mineYMin = 150; mineYMax = 200;
		factoryXMin = 200; factoryXMax = 240;
		factoryYMin = 250; factoryYMax = 275;
		countryXMin = 200; countryXMax = 240;
		countryYMin = 325; countryYMax = 350;
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
		if(x > 785 && x < 975 && y > 150 && y < 250) {
			if(!(farmXMax >= 675 || farmXMin >= 625)) {
				int farmX = (int) Math.floor(Math.random() * (farmXMax - farmXMin) + farmXMin);
				int farmY = (int) Math.floor(Math.random() * (farmYMax - farmYMin) + farmYMin);
				Building temp = new Building(farmX, farmY, "Farm");
				farms.add(temp);
				farmShop.clicked1();
				farmXMin += 60; farmXMax += 60;
				if(farmXMax >= 675 || farmXMin >= 625) {
					farmShop.clicked2();
				}
			}
		}
		if(x > 785 && x < 975 && y > 250 && y < 350) {
			if(!(mineXMax >= 675 || mineXMin >= 625)) {
				int mineX = (int) Math.floor(Math.random() * (mineXMax - mineXMin) + mineXMin);
				int mineY = (int) Math.floor(Math.random() * (mineYMax - mineYMin) + mineYMin);
				Building temp = new Building(mineX, mineY, "Mine");
				mines.add(temp);
				mineShop.clicked1();
				mineXMin += 60; mineXMax += 60;
				if(mineXMax >= 675 || mineXMin >= 625) {
					mineShop.clicked2();
				}
			}
		}
		if(x > 785 && x < 975 && y > 350 && y < 425) {
			if(!(factoryXMax >= 675 || factoryXMin >= 625)) {
				int factoryX = (int) Math.floor(Math.random() * (factoryXMax - factoryXMin) + factoryXMin);
				int factoryY = (int) Math.floor(Math.random() * (factoryYMax - factoryYMin) + factoryYMin);
				Building temp = new Building(factoryX, factoryY, "Factory");
				factories.add(temp);
				factoryShop.clicked1();
				factoryXMin += 60; factoryXMax += 60;
				if(factoryXMax >= 675 || factoryXMin >= 625) {
					factoryShop.clicked2();
				}
			}
		}
		
		if(x > 785 && x < 975 && y > 450 && y < 550) {
			if(!(countryXMax >= 675 || countryXMin >= 625)) {
				int countryX = (int) Math.floor(Math.random() * (countryXMax - countryXMin) + countryXMin);
				int countryY = (int) Math.floor(Math.random() * (countryYMax - countryYMin) + countryYMin);
				Building temp = new Building(countryX, countryY, "Country");
				countries.add(temp);
				countryShop.clicked1();
				countryXMin += 60; countryXMax += 60;
				if(countryXMax >= 675 || countryXMin >= 625) {
					countryShop.clicked2();
				}
			}
		}
		/*
		if(x > 785 && x < 975 && y > 150 && y < 250) {
			if(!(farmXMax >= 675 || farmXMin >= 625)) {
				int farmX = (int) Math.floor(Math.random() * (farmXMax - farmXMin) + farmXMin);
				int farmY = (int) Math.floor(Math.random() * (farmYMax - farmYMin) + farmYMin);
				Building temp = new Building(farmX, farmY, "Farm");
				farms.add(temp);
				farmShop.clicked1();
				farmXMin += 60; farmXMax += 60;
				if(farmXMax >= 675 || farmXMin >= 625) {
					farmShop.clicked2();
				}
			}
		}
		*/
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		if(x > 50 && x < 175 && y > 125 && y < 350) {
			cookie.clicked2();
		}
		if(x > 785 && x < 975 && y > 150 && y < 250) {
			if(!(farmXMax >= 675 || farmXMin >= 625)) {
				farmShop.clicked2();
			}
		}
		if(x > 785 && x < 975 && y > 250 && y < 350) {
			if(!(mineXMax >= 675 || mineXMin >= 625)) {
				mineShop.clicked2();
			}
		}
		if(x > 785 && x < 975 && y > 350 && y < 425) {
			if(!(factoryXMax >= 675 || factoryXMin >= 625)) {
				factoryShop.clicked2();
			}
		}
		if(x > 785 && x < 975 && y > 450 && y < 550) {
			if(!(countryXMax >= 675 || countryXMin >= 625)) {
				countryShop.clicked2();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}
