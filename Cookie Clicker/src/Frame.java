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
	
	
	static itemFrame frame1 = new itemFrame(757, 50, "upgradeFrameOld");
	static itemFrame frame2 = new itemFrame(937, 50, "frameCropped");
	static itemFrame frame3 = new itemFrame(757, 100, "upgradeFrameOld");
	static itemFrame frame4 = new itemFrame(937, 100, "frameCropped");
	static itemFrame frame5 = new itemFrame(937, 143, "frameCropped");
	static itemFrame frame6 = new itemFrame(757, 189, "newRow");
	
	//cookie background objects
	Cookie cookie;
	Milk milk = new Milk(0, 425);
	
	//achievements
	private int numAchievements;
	
	//shop positions
	int buttonWidth = 180;
	int buttonHeight = 50;
	int farmShopY = 250;
	int mineShopY = farmShopY + buttonHeight;
	int factoryShopY = mineShopY + buttonHeight;
	int countryShopY = factoryShopY + buttonHeight;
	int colonyShopY = countryShopY + buttonHeight;
	int galaxyShopY = colonyShopY + buttonHeight;
	
	//shop buttons
	ShopButtons farmShop = new ShopButtons(785, farmShopY, "FarmShop");
	ShopButtons mineShop = new ShopButtons(785, mineShopY, "MineShop");
	ShopButtons factoryShop = new ShopButtons(785, factoryShopY, "FactoryShop");
	ShopButtons countryShop = new ShopButtons(785, countryShopY, "CountryShop");
	ShopButtons colonyShop = new ShopButtons(785, colonyShopY, "ColonyShop");
	ShopButtons galaxyShop = new ShopButtons(785, galaxyShopY, "GalaxyShop");
	ShopButtons cursorUpgrade = new ShopButtons(743, 50, "Cursor_1");
	ShopButtons cursorUpgrade2 = new ShopButtons(788, 50, "Cursor_2");
	ShopButtons farmUpgrade = new ShopButtons(834, 50, "hoe_1");
	ShopButtons farmUpgrade2 = new ShopButtons(877, 50, "hoe_2");
	ShopButtons mineUpgrade = new ShopButtons(922, 50, "pickaxe_1");
	ShopButtons mineUpgrade2 = new ShopButtons(742, 100, "pickaxe_2");
	ShopButtons factoryUpgrade = new ShopButtons(788, 100, "gear_1");
	ShopButtons factoryUpgrade2 = new ShopButtons(833, 100, "gear_2");
	ShopButtons colonyUpgrade = new ShopButtons(743, 145, "robot_1");
	ShopButtons colonyUpgrade2 = new ShopButtons(788, 145, "robot_2");
	
	
	//"upgrade" buttons
	UpgradeButtons countryUpgrade = new UpgradeButtons(892, 96, "Deed_1");
	UpgradeButtons countryUpgrade2 = new UpgradeButtons(937, 96, "Deed_2");
	UpgradeButtons galaxyUpgrade = new UpgradeButtons(844, 145, "planet_1");
	UpgradeButtons galaxyUpgrade2 = new UpgradeButtons(890, 145, "planet_2");
	UpgradeButtons cookieUpgrade1 = new UpgradeButtons(930, 145, "CookieUpgrade_1");
	UpgradeButtons cookieUpgrade2 = new UpgradeButtons(754, 188, "CookieUpgrade_2");
	UpgradeButtons cookieUpgrade3 = new UpgradeButtons(800, 188, "CookieUpgrade_3");
	UpgradeButtons cookieUpgrade4 = new UpgradeButtons(845, 185, "CookieUpgrade_4");
	UpgradeButtons buildingUpgrade = new UpgradeButtons(890, 191, "buildingcps");
	UpgradeButtons cursorUpgrade3 = new UpgradeButtons(930, 190, "10cursor");
	
	//building lists
	ArrayList<Building> farms;
	ArrayList<Building> mines;
	ArrayList<Building> factories;
	ArrayList<Building> countries; 
	ArrayList<Building> colonies;
	ArrayList<Building> galaxies;
	
	//building cps
	private int farmCPS;
	private int mineCPS;
	private int factoryCPS;
	private int countryCPS;
	private int colonyCPS;
	private int galaxyCPS;
	
	//building prices
	private int farmPrice;
	private int minePrice;
	private int factoryPrice;
	private int countryPrice;
	private int colonyPrice;  //rghrahr
	private int galaxyPrice;
	
	//building positions
	int farmXMin, farmXMax, farmYMin, farmYMax;
	int mineXMin, mineXMax, mineYMin, mineYMax;
	int factoryXMin, factoryXMax, factoryYMin, factoryYMax;
	int countryXMin, countryXMax, countryYMin, countryYMax;
	int colonyXMin, colonyXMax, colonyYMin, colonyYMax;
	int galaxyXMin, galaxyXMax, galaxyYMin, galaxyYMax;
	 
	//cookie trackers
	private int numCookies;
	private double cps;
	long startTime = System.currentTimeMillis();



	 

	//secret
	Secret easterEgg = new Secret(500, 350);
	int numSecClicked = 0;
	

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
		frame2.paint(g);
		frame3.paint(g);
		frame4.paint(g);
		frame5.paint(g);
		frame6.paint(g);
		
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
		galaxyShop.paint(g);
		cursorUpgrade.paint(g);
		cursorUpgrade2.paint(g);
		farmUpgrade.paint(g);
		farmUpgrade2.paint(g);
		mineUpgrade.paint(g);
		mineUpgrade2.paint(g);
		factoryUpgrade.paint(g);
		factoryUpgrade2.paint(g);
		colonyUpgrade.paint(g);
		colonyUpgrade2.paint(g);
		galaxyUpgrade.paint(g);
		galaxyUpgrade2.paint(g);
		cookieUpgrade1.paint(g);
		cookieUpgrade2.paint(g);
		cookieUpgrade3.paint(g);
		cookieUpgrade4.paint(g);
		countryUpgrade.paint(g);
		countryUpgrade2.paint(g);
		buildingUpgrade.paint(g);
		cursorUpgrade3.paint(g);
		
		g.drawRect(785, farmShopY, 180, buttonHeight);
		g.drawRect(785, mineShopY, 180, buttonHeight);
		g.drawRect(785, factoryShopY, 180, buttonHeight);
		g.drawRect(785, countryShopY, 180, buttonHeight);
		g.drawRect(785, colonyShopY, 180, buttonHeight);
		g.drawRect(785, galaxyShopY, 180, buttonHeight);
		
		g.drawString("Price: "+farmPrice, 735, farmShopY);
		g.drawString("Price: "+minePrice, 735, mineShopY);
		g.drawString("Price: "+factoryPrice, 735, factoryShopY);
		g.drawString("Price: "+countryPrice, 735, countryShopY);
		g.drawString("Price: "+colonyPrice, 735, colonyShopY);
		g.drawString("Price: "+galaxyPrice, 735, galaxyShopY);
		
		easterEgg.paint(g);
		
		for(int i = 0; i < farms.size(); i++) {
			if(farms.get(i).getX() < 700) {
				farms.get(i).paint(g);
			}
		}
		
		for(int i = 0; i < mines.size(); i++) {
			if(mines.get(i).getX() < 700) {
				mines.get(i).paint(g);
			}
		}
		
		for(int i = 0; i < factories.size(); i++) {
			if(factories.get(i).getX() < 700) {
				factories.get(i).paint(g);
			}
		}
		
		for(int i = 0; i < countries.size(); i++) {
			if(countries.get(i).getX() < 700) {
				countries.get(i).paint(g);
			}
		}
		
		for(int i = 0; i < colonies.size(); i++) {
			if(colonies.get(i).getX() < 700) {
				colonies.get(i).paint(g);
			}
		}
		
		for(int i = 0; i < galaxies.size(); i++) {
			if(galaxies.get(i).getX() < 700) {
				galaxies.get(i).paint(g);
			}
		}
		
		if(numAchievements >= 5) {
			milk.changePicture("imgs/Milk2.gif");
		}
		if(numAchievements >= 10) {
			milk.changePicture("imgs/Milk3.gif");
		}
		if(numAchievements == 20) {
			milk.changePicture("imgs/Milk4.gif");
		}
		
		g.setColor(Color.CYAN);
		g.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		g.drawString("Cookies:" + numCookies, 15, 125);
		g.drawString("CPS:" + (int) cps, 15, 160);
		
		g.setColor(Color.blue);
		g.fillRect(750, 0, 250, 50);
		g.setColor(Color.CYAN);
		g.drawString("SHOP", 825, 35);
		
		long elapsedTime = System.currentTimeMillis() - startTime;
		long elapsedSeconds = elapsedTime / 1000;
		if(elapsedSeconds == 1) {
			numCookies += (int) cps;
			startTime = System.currentTimeMillis();
		}
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
		
		farmCPS = 1;
		mineCPS = 5;
		factoryCPS = 25;
		countryCPS = 50;
		colonyCPS = 100;
		galaxyCPS = 1000;
		
		farmPrice = 15;
		minePrice = 100;
		factoryPrice = 1000;
		countryPrice = 45000;
		colonyPrice = 125000;
		galaxyPrice = 1000000;
		
		numCookies = 0;
		cps = 0;
		
		farmXMin = 200; farmXMax = 240;
		farmYMin = 70; farmYMax = 100;
		mineXMin = 200; mineXMax = 240; 
		mineYMin = 150; mineYMax = 200;
		factoryXMin = 200; factoryXMax = 240;
		factoryYMin = 250; factoryYMax = 275;
		countryXMin = 200; countryXMax = 240;
		countryYMin = 325; countryYMax = 350;
		colonyXMin = 200; colonyXMax = 240;
		colonyYMin = 425; colonyYMax = 455;
		galaxyXMin = 200; galaxyXMax = 240;
		galaxyYMin = 515; galaxyYMax = 550;
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
		if(x > 785 && x < 965 && y > farmShopY+25 && y < mineShopY+25 && numCookies >= farmPrice) {
			int farmX = (int) Math.floor(Math.random() * (farmXMax - farmXMin) + farmXMin);
			int farmY = (int) Math.floor(Math.random() * (farmYMax - farmYMin) + farmYMin);
			Building temp = new Building(farmX, farmY, "Farm");
			farms.add(temp);
			cps += farmCPS;
			farmShop.clicked1();
			farmXMin += 60; farmXMax += 60;
		}
		if(x > 785 && x < 965 && y > mineShopY+25 && y < factoryShopY+25 && numCookies >= minePrice) {
			int mineX = (int) Math.floor(Math.random() * (mineXMax - mineXMin) + mineXMin);
			int mineY = (int) Math.floor(Math.random() * (mineYMax - mineYMin) + mineYMin);
			Building temp = new Building(mineX, mineY, "Mine");
			mines.add(temp);
			cps += mineCPS;
			mineShop.clicked1();
			mineXMin += 60; mineXMax += 60;
		}
		if(x > 785 && x < 965 && y > factoryShopY+25 && y < countryShopY+25 && numCookies >= factoryPrice) {
			int factoryX = (int) Math.floor(Math.random() * (factoryXMax - factoryXMin) + factoryXMin);
			int factoryY = (int) Math.floor(Math.random() * (factoryYMax - factoryYMin) + factoryYMin);
			Building temp = new Building(factoryX, factoryY, "Factory");
			factories.add(temp);
			cps += factoryCPS;
			factoryShop.clicked1();
			factoryXMin += 60; factoryXMax += 60;
		}
		
		if(x > 785 && x < 965 && y > countryShopY+25 && y < colonyShopY+25 && numCookies >= countryPrice) {
			int countryX = (int) Math.floor(Math.random() * (countryXMax - countryXMin) + countryXMin);
			int countryY = (int) Math.floor(Math.random() * (countryYMax - countryYMin) + countryYMin);
			Building temp = new Building(countryX, countryY, "Country");
			countries.add(temp);
			cps += countryCPS;
			countryShop.clicked1();
			countryXMin += 60; countryXMax += 60;
		}
		
		if(x > 785 && x < 965 && y > colonyShopY+25 && y < galaxyShopY+25 && numCookies >= colonyPrice) {
			int colonyX = (int) Math.floor(Math.random() * (colonyXMax - colonyXMin) + colonyXMin);
			int colonyY = (int) Math.floor(Math.random() * (colonyYMax - colonyYMin) + colonyYMin);
			Building temp = new Building(colonyX, colonyY, "Colony");
			colonies.add(temp);
			cps += colonyCPS;
			colonyShop.clicked1();
			colonyXMin += 75; colonyXMax += 75;
		}
		
		if(x > 785 && x < 965 && y > galaxyShopY+25 && y < galaxyShopY+buttonHeight+25 && numCookies >= galaxyPrice) {
			int galaxyX = (int) Math.floor(Math.random() * (galaxyXMax - galaxyXMin) + galaxyXMin);
			int galaxyY = (int) Math.floor(Math.random() * (galaxyYMax - galaxyYMin) + galaxyYMin);
			Building temp = new Building(galaxyX, galaxyY, "Galaxy");
			galaxies.add(temp);
			cps += galaxyCPS;
			galaxyShop.clicked1();
			galaxyXMin += 75; galaxyXMax += 75;
		}
		
		if(x >= easterEgg.getX() && x <= easterEgg.getX()+10) {
			if(y >= easterEgg.getY()+20 && y <= easterEgg.getY()+40) {
				numSecClicked++;
				if(numSecClicked >= 5) {
					numCookies += 100000;
				}
			}
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		System.out.println(x + " " + y);
		if(x > 50 && x < 175 && y > 125 && y < 350) {
			cookie.clicked2();
		}
		if(x > 785 && x < 965 && y > farmShopY+25 && y < mineShopY+25 && numCookies >= farmPrice) {
			farmShop.clicked2();
			numCookies -= farmPrice;
			farmPrice *= 1.35;
		}
		if(x > 785 && x < 965 && y > mineShopY+25 && y < factoryShopY+25 && numCookies >= minePrice) {
			mineShop.clicked2();
			numCookies -= minePrice;
			minePrice *= 1.35;
		}
		if(x > 785 && x < 965 && y > factoryShopY+25 && y < countryShopY+25 && numCookies >= factoryPrice) {
			factoryShop.clicked2();
			numCookies -= factoryPrice;
			factoryPrice *= 1.35;
		}
		if(x > 785 && x < 965 && y > countryShopY+25 && y < colonyShopY+25 && numCookies >= countryPrice) {
			countryShop.clicked2();
			numCookies -= countryPrice;
			countryPrice *= 1.35;
		}
		if(x > 785 && x < 965 && y > colonyShopY+25 && y < galaxyShopY+25 && numCookies >= colonyPrice) {
			colonyShop.clicked2();
			numCookies -= colonyPrice;
			colonyPrice *= 1.35;
		}
		if(x > 785 && x < 965 && y > galaxyShopY+25 && y < galaxyShopY+buttonHeight+25 && numCookies >= galaxyPrice) {
			galaxyShop.clicked2();
			numCookies -= galaxyPrice;
			galaxyPrice *= 1.35;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}
