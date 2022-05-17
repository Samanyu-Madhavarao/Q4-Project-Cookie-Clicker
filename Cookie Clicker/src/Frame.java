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

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


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
	static Background2 statsBackground = new Background2(195, 0, "StatsBackground");
	
	static itemFrame frame1 = new itemFrame(757, 50, "upgradeFrameOld");
	static itemFrame frame2 = new itemFrame(937, 50, "frameCropped");
	static itemFrame frame3 = new itemFrame(757, 100, "upgradeFrameOld");
	static itemFrame frame4 = new itemFrame(937, 100, "frameCropped");
	static itemFrame frame5 = new itemFrame(937, 143, "frameCropped");
	static itemFrame frame6 = new itemFrame(757, 189, "newRow");
	static itemFrame frame7 = new itemFrame(450, 430, "newRow");
	static itemFrame frame8 = new itemFrame(270, 430, "newRow");
	static itemFrame frame9 = new itemFrame(630, 430, "frameCropped");
	
	//cookie background objects
	Cookie cookie;
	Milk milk = new Milk(0, 425);
	
	//achievements
	private int numAchievements;
	
	 static //arraylist
	 ArrayList<String> test = new ArrayList<String>();
	
	//shop positions
	int buttonWidth = 180;
	int buttonHeight = 60;
	int farmShopY = 235;
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
	
	//"upgrade" buttons
	ShopButtons cursorUpgrade = new ShopButtons(743, 50, "Cursor_1");
	ShopButtons cursorUpgrade2 = new ShopButtons(788, 50, "Cursor_2");
	UpgradeButtons cpsUpgrade = new UpgradeButtons(930, 190, "10cursor");
	
	ShopButtons farmUpgrade = new ShopButtons(834, 50, "hoe_1");
	ShopButtons farmUpgrade2 = new ShopButtons(877, 50, "hoe_2");
	
	ShopButtons mineUpgrade = new ShopButtons(922, 50, "pickaxe_1");
	ShopButtons mineUpgrade2 = new ShopButtons(742, 100, "pickaxe_2");
	 
	ShopButtons factoryUpgrade = new ShopButtons(788, 100, "gear_1");
	ShopButtons factoryUpgrade2 = new ShopButtons(833, 100, "gear_2");
	 
	ShopButtons colonyUpgrade = new ShopButtons(743, 145, "robot_1");
	ShopButtons colonyUpgrade2 = new ShopButtons(788, 145, "robot_2");

	UpgradeButtons countryUpgrade = new UpgradeButtons(892, 96, "Deed_1");
	UpgradeButtons countryUpgrade2 = new UpgradeButtons(937, 96, "Deed_2");
	
	UpgradeButtons galaxyUpgrade = new UpgradeButtons(844, 145, "planet_1");
	UpgradeButtons galaxyUpgrade2 = new UpgradeButtons(890, 145, "planet_2");
	
	UpgradeButtons cookieUpgrade1 = new UpgradeButtons(930, 145, "CookieUpgrade_1");
	UpgradeButtons cookieUpgrade2 = new UpgradeButtons(754, 188, "CookieUpgrade_2");
	UpgradeButtons cookieUpgrade3 = new UpgradeButtons(800, 188, "CookieUpgrade_3");
	UpgradeButtons cookieUpgrade4 = new UpgradeButtons(845, 185, "CookieUpgrade_4");
	
	UpgradeButtons buildingUpgrade = new UpgradeButtons(890, 191, "buildingcps (1)");
	
	boolean cursorUpgradeBool = false;
	boolean cursorUpgrade2Bool = false;
	boolean cpsUpgradeBool = false;
	boolean farmUpgradeBool = false;
	boolean farmUpgrade2Bool = false;
	boolean mineUpgradeBool = false;
	boolean mineUpgrade2Bool = false;
	boolean factoryUpgradeBool = false;
	boolean factoryUpgrade2Bool = false;
	boolean colonyUpgradeBool = false;
	boolean colonyUpgrade2Bool = false;
	boolean countryUpgradeBool = false;
	boolean countryUpgrade2Bool = false;
	boolean galaxyUpgradeBool = false;
	boolean galaxyUpgrade2Bool = false;
	boolean cookieUpgradeBool = false;
	boolean cookieUpgrade2Bool = false;
	boolean cookieUpgrade3Bool = false;
	boolean cookieUpgrade4Bool = false;

	boolean statsPage = false;

	boolean buildingUpgradeBool = false;

	int commonPrice = 10;
	int rarePrice = 100;
	int epicPrice = 5000;
	int legendaryPrice = 10000000;
	
	ArrayList<Building> farms;
	ArrayList<Building> mines;
	ArrayList<Building> factories;
	ArrayList<Building> countries; 
	ArrayList<Building> colonies;
	ArrayList<Building> galaxies;
	
	//achivements
	
	Building tenCPS = new Building(265, 430, "10CPS");
	Building tenkCPS = new Building(310, 430, "10000+CPS");
	Building millionCookies = new Building(360, 430, "1MilCookies");
	Building ChildLabor = new Building(493, 430, "Factory_Blood");
	Building TypeAmogus = new Building(447, 430, "TypeAmogus");
	Building AmogusCookie = new Building(403, 430, "AmogusCookie");
	Building WorldControl = new Building(540, 430, "WorldControl");
	Building AllUpgrades = new Building(583, 430, "AllUpgrades");
	Building CookieGod = new Building(627, 430, "CookieGod");
	Building TrollAchivement = new Building(627, 470, "CursedKing");
	
	
	//building cps
	private int cursorCPS = 0;
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
	private int colonyPrice;  
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
	private int maxCookies;
	long startTime = System.currentTimeMillis();
	
	//tooltips booleans
	boolean cursorUpgradeHover = false;
	boolean cursorUpgrade2Hover = false;
	boolean cpsUpgradeHover = false;
	boolean farmUpgradeHover = false;
	boolean farmUpgrade2Hover = false;
	boolean mineUpgradeHover = false;
	boolean mineUpgrade2Hover = false;
	boolean factoryUpgradeHover = false;
	boolean factoryUpgrade2Hover = false;
	boolean colonyUpgradeHover = false;
	boolean colonyUpgrade2Hover = false;
	boolean countryUpgradeHover = false;
	boolean countryUpgrade2Hover = false;
	boolean galaxyUpgradeHover = false;
	boolean galaxyUpgrade2Hover = false;
	boolean cookieUpgradeHover = false;
	boolean cookieUpgrade2Hover = false;
	boolean cookieUpgrade3Hover = false;
	boolean cookieUpgrade4Hover = false;
	
	boolean farmHover = false;
	boolean mineHover = false;
	boolean factoryHover = false;
	boolean countryHover = false;
	boolean colonyHover = false;
	boolean galaxyHover = false;

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
		statsBackground.paint(g);
		
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
		
		g.setColor(Color.GREEN);
		g.fillRect(762, 55, 36, 36);
		cursorUpgrade.paint(g);
		
		g.setColor(Color.BLUE);
		g.fillRect(807, 55, 36, 36);
		cursorUpgrade2.paint(g);
		
		g.setColor(Color.GREEN);
		g.fillRect(852, 55, 36, 36);
		farmUpgrade.paint(g);
		
		g.setColor(Color.BLUE);
		g.fillRect(897, 55, 36, 36);
		farmUpgrade2.paint(g);
		
		g.setColor(Color.BLUE);
		g.fillRect(942, 55, 36, 36);
		mineUpgrade.paint(g);
		
		g.setColor(new Color(255,100,255));
		g.fillRect(762, 105, 36, 36);
		mineUpgrade2.paint(g);
		
		g.setColor(Color.BLUE);
		g.fillRect(807, 105, 36, 36);
		factoryUpgrade.paint(g);
		
		g.setColor(new Color(255,100,255));
		g.fillRect(852, 105, 36, 36);
		factoryUpgrade2.paint(g);
		
		g.setColor(Color.BLUE);
		g.fillRect(897, 105, 36, 36);
		countryUpgrade.paint(g);
		
		g.setColor(new Color(255,100,255));
		g.fillRect(942, 105, 36, 36);
		countryUpgrade2.paint(g);
		
		g.setColor(Color.BLUE);
		g.fillRect(762, 150, 36, 36);
		colonyUpgrade.paint(g);
		
		g.setColor(new Color(255,100,255));
		g.fillRect(807, 150, 36, 36);
		colonyUpgrade2.paint(g);
		
		g.setColor(new Color(255,100,255));
		g.fillRect(852, 150, 36, 36);
		galaxyUpgrade.paint(g);
		
		g.setColor(Color.YELLOW);
		g.fillRect(897, 150, 36, 36);
		galaxyUpgrade2.paint(g);
		
		g.setColor(Color.GREEN);
		g.fillRect(942, 148, 36, 36);
		cookieUpgrade1.paint(g);
		
		g.setColor(Color.BLUE);
		g.fillRect(762, 194, 36, 36);
		cookieUpgrade2.paint(g);
		
		g.setColor(new Color(255,100,255));
		g.fillRect(807, 194, 36, 36);
		cookieUpgrade3.paint(g);
		
		g.setColor(Color.YELLOW);
		g.fillRect(852, 194, 36, 36);
		cookieUpgrade4.paint(g);
		
		g.fillRect(897, 194, 36, 36);
		buildingUpgrade.paint(g);
		
		g.fillRect(942, 193, 36, 36);
		cpsUpgrade.paint(g);
		
		g.setColor(Color.BLACK);
		g.drawRect(785, farmShopY, 180, buttonHeight);
		g.drawRect(785, mineShopY, 180, buttonHeight);
		g.drawRect(785, factoryShopY, 180, buttonHeight);
		g.drawRect(785, countryShopY, 180, buttonHeight);
		g.drawRect(785, colonyShopY, 180, buttonHeight);
		g.drawRect(785, galaxyShopY, 180, buttonHeight);
		
		g.drawString("Price: "+farmPrice, 790, mineShopY);
		g.drawString("Price: "+minePrice, 790, factoryShopY);
		g.drawString("Price: "+factoryPrice, 790, countryShopY);
		g.drawString("Price: "+countryPrice, 790, colonyShopY);
		g.drawString("Price: "+colonyPrice, 790, galaxyShopY);
		g.drawString("Price: "+galaxyPrice, 790, galaxyShopY+60);
		
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
		int textSize = 23;
		if(numCookies >= 1000000) {
			textSize = 17;
		}else if(numCookies >= 100000000) {
			textSize = 12;
		}
		g.setFont(new Font("Comic Sans MS", Font.BOLD, textSize));
		g.drawString("Cookies:" + numCookies, 15, 125);
		g.drawString("CPS:" + (int) updateCPS(), 15, 160);
		
		
		g.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		g.setColor(Color.blue);
		g.fillRect(750, 0, 250, 50);
		g.setColor(Color.CYAN);
		g.drawString("SHOP", 825, 35);
		
		g.setColor(Color.GRAY);
		if(cursorUpgradeBool) {
			g.fillRect(762, 55, 36, 36);
		}
		if(cursorUpgrade2Bool) {
			g.fillRect(807, 55, 36, 36);
		}
		if(farmUpgradeBool) {
			g.fillRect(852, 55, 36, 36);
		}
		if(farmUpgrade2Bool) {
			g.fillRect(897, 55, 36, 36);
		}
		if(mineUpgradeBool) {
			g.fillRect(942, 55, 36, 36);
		}
		
		if(mineUpgrade2Bool) {
			g.fillRect(762, 105, 36, 36);
		}
		if(factoryUpgradeBool) {
			g.fillRect(807, 105, 36, 36);
		}
		if(factoryUpgrade2Bool) {
			g.fillRect(852, 105, 36, 36);
		}
		if(countryUpgradeBool) {
			g.fillRect(897, 105, 36, 36);
		}
		if(countryUpgrade2Bool) {
			g.fillRect(942, 105, 36, 36);
		}
		
		if(colonyUpgradeBool) {
			g.fillRect(762, 150, 36, 36);
		}
		if(colonyUpgrade2Bool) {
			g.fillRect(807, 150, 36, 36);
		}
		if(galaxyUpgradeBool) {
			g.fillRect(852, 150, 36, 36);
		}
		if(galaxyUpgrade2Bool) {
			g.fillRect(897, 150, 36, 36);
		}
		if(cookieUpgradeBool) {
			g.fillRect(942, 148, 36, 36);
		}
		
		if(cookieUpgrade2Bool) {
			g.fillRect(762, 194, 36, 36);
		}
		if(cookieUpgrade3Bool) {
			g.fillRect(807, 194, 36, 36);
		}
		if(cookieUpgrade4Bool) {
			g.fillRect(852, 194, 36, 36);
		}
		if(buildingUpgradeBool) {
			g.fillRect(897, 194, 36, 36);
		}
		if(cpsUpgradeBool) {
			g.fillRect(942, 194, 36, 36);
		}
		
		
		
		long elapsedTime = System.currentTimeMillis() - startTime;
		long elapsedSeconds = elapsedTime / 1000;
		if(elapsedSeconds == 1) {
			numCookies += (int) updateCPS();
			startTime = System.currentTimeMillis();
		
		}
		

    
    g.setColor(Color.GRAY);
		g.fillRect(210, 12, 85, 40);
		g.setColor(Color.BLACK);
		g.drawString("STATS", 212, 40);
    
		if(statsPage == false){
			g.setColor(Color.white);
			g.drawRect(200,62, 400, 300);
			g.fillRect(200, 62, 550, 500);
			g.setColor(Color.black);
			g.drawString("Farms:" + farms.size(), 210, 100);
			g.drawString("Mines:" + mines.size(), 210, 135);
			g.drawString("Factories:" + factories.size(), 210, 170);
			g.drawString("Countries:" + countries.size(), 210, 205);
			g.drawString("Colonies:" + colonies.size(), 210, 240);
			g.drawString("Galaxies:" + galaxies.size(), 210, 275);
			int totalBuildings = farms.size() + mines.size() + factories.size() + countries.size() + colonies.size() + galaxies.size();
			g.drawString("Total Buildings:" + totalBuildings, 210, 310);
			g.drawString("Max Cookies:" + maxCookies, 210, 345);
			g.drawString("Price Guide", 550, 100);
			g.drawString("= " + commonPrice, 590, 155);
			g.drawString("= " + rarePrice, 590, 220);
			g.drawString("= " + epicPrice, 590, 285);
			g.drawString("= " + legendaryPrice, 590, 350);
			g.setColor(Color.GREEN);
			g.fillRect(530, 130, 35, 35);
			g.setColor(Color.blue);
			g.fillRect(530, 195, 35, 35);
			g.setColor(new Color(255, 100, 255));
			g.fillRect(530, 260, 35, 35);
			g.setColor(Color.YELLOW);
			g.fillRect(530, 325, 35, 35);
			g.setColor(Color.red);
			g.drawLine(725, 70, 745, 90);
			g.drawLine(745, 70, 725, 90);
			frame7.paint(g);
			frame8.paint(g);
			frame9.paint(g);
			TypeAmogus.paint(g);
			ChildLabor.paint(g);
			WorldControl.paint(g);
			CookieGod.paint(g);
			AmogusCookie.paint(g);
			AllUpgrades.paint(g);
			tenCPS.paint(g);
			tenkCPS.paint(g);
			millionCookies.paint(g);
			TrollAchivement.paint(g);
			
		}
		
		
		if(numCookies > maxCookies) {
			maxCookies = numCookies;
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
		
		cursorCPS = 1;    
		farmPrice = 15;
		minePrice = 100; 
		factoryPrice = 1000;
		countryPrice = 45000;
		colonyPrice = 125000;
		galaxyPrice = 1000000; 
		
		numCookies = 0;
		
		
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
	
	public int updateCPS() {
		int cps = 0;
		for(int i = 0; i < farms.size(); i++) {
			cps += (farmCPS*farms.size());
		}
		for(int i = 0; i < mines.size(); i++) {
			cps += (mineCPS*mines.size());
		}
		for(int i = 0; i < factories.size(); i++) {
			cps += (factoryCPS*factories.size());
		}
		for(int i = 0; i < countries.size(); i++) {
			cps += (countryCPS*countries.size());
		}
		for(int i = 0; i < colonies.size(); i++) {
			cps += (colonyCPS*colonies.size());
		}
		for(int i = 0; i < galaxies.size(); i++) {
			cps += (galaxyCPS*galaxies.size());
		}
		if(cookieUpgradeBool) {cps *= 1.1;}
		if(cookieUpgrade2Bool) {cps *= 1.15;}
		if(cookieUpgrade3Bool) {cps *= 1.25;}
		if(cookieUpgrade4Bool) {cps *= 1.1;}
		if(cpsUpgradeBool) {cps *= 1.1;}
		return cps;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();

		
			   
			    try {
			      File myObj = new File("quotes.txt");
			      Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        test.add(data);
			        System.out.print(data);
			      }
			      myReader.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			  
			
	
		
		
		
		
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
		if(x >= 210 && x <= 300 && y >= 40 && y <= 78 && statsPage == false) {
			statsPage = true;
		}
		
		if(x >= 725 && x <= 745 && y >= 100 && y <= 120 && statsPage) {
			statsPage = false;
		}
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
			numCookies += cursorCPS;
			cookie.clicked1();
		}
		if(x > 785 && x < 965 && y > farmShopY+25 && y < mineShopY+25 && numCookies >= farmPrice) {
			int farmX = (int) Math.floor(Math.random() * (farmXMax - farmXMin) + farmXMin);
			int farmY = (int) Math.floor(Math.random() * (farmYMax - farmYMin) + farmYMin);
			Building temp = new Building(farmX, farmY, "Farm");
			farms.add(temp);
			farmShop.clicked1();
			farmXMin += 60; farmXMax += 60;
		}
		if(x > 785 && x < 965 && y > mineShopY+25 && y < factoryShopY+25 && numCookies >= minePrice) {
			int mineX = (int) Math.floor(Math.random() * (mineXMax - mineXMin) + mineXMin);
			int mineY = (int) Math.floor(Math.random() * (mineYMax - mineYMin) + mineYMin);
			Building temp = new Building(mineX, mineY, "Mine");
			mines.add(temp);
			mineShop.clicked1();
			mineXMin += 60; mineXMax += 60;
		}
		if(x > 785 && x < 965 && y > factoryShopY+25 && y < countryShopY+25 && numCookies >= factoryPrice) {
			int factoryX = (int) Math.floor(Math.random() * (factoryXMax - factoryXMin) + factoryXMin);
			int factoryY = (int) Math.floor(Math.random() * (factoryYMax - factoryYMin) + factoryYMin);
			Building temp = new Building(factoryX, factoryY, "Factory");
			factories.add(temp);
			factoryShop.clicked1();
			factoryXMin += 60; factoryXMax += 60;
		}
		
		if(x > 785 && x < 965 && y > countryShopY+25 && y < colonyShopY+25 && numCookies >= countryPrice) {
			int countryX = (int) Math.floor(Math.random() * (countryXMax - countryXMin) + countryXMin);
			int countryY = (int) Math.floor(Math.random() * (countryYMax - countryYMin) + countryYMin);
			Building temp = new Building(countryX, countryY, "Country");
			countries.add(temp);
			countryShop.clicked1();
			countryXMin += 60; countryXMax += 60;
		}
		
		if(x > 785 && x < 965 && y > colonyShopY+25 && y < galaxyShopY+25 && numCookies >= colonyPrice) {
			int colonyX = (int) Math.floor(Math.random() * (colonyXMax - colonyXMin) + colonyXMin);
			int colonyY = (int) Math.floor(Math.random() * (colonyYMax - colonyYMin) + colonyYMin);
			Building temp = new Building(colonyX, colonyY, "Colony");
			colonies.add(temp);
			colonyShop.clicked1();
			colonyXMin += 75; colonyXMax += 75;
		}
		
		if(x > 785 && x < 965 && y > galaxyShopY+25 && y < galaxyShopY+buttonHeight+25 && numCookies >= galaxyPrice) {
			int galaxyX = (int) Math.floor(Math.random() * (galaxyXMax - galaxyXMin) + galaxyXMin);
			int galaxyY = (int) Math.floor(Math.random() * (galaxyYMax - galaxyYMin) + galaxyYMin);
			Building temp = new Building(galaxyX, galaxyY, "Galaxy");
			galaxies.add(temp);
			galaxyShop.clicked1();
			galaxyXMin += 75; galaxyXMax += 75;
		}
		
		if(x >= 765 && x <= 801 && y >= 80 && y <= 115 && !cursorUpgradeBool && numCookies >= commonPrice) {
			cursorUpgradeBool = true;
			numCookies -= commonPrice;
			cursorCPS *= 2;
		}
		
		if(x >= 810 && x <= 845 && y >= 80 && y <= 115 && !cursorUpgrade2Bool && numCookies >= rarePrice) {
			cursorUpgrade2Bool = true;
			numCookies -= rarePrice;
			cursorCPS *= 5;
		}
		
		if(x >= 855 && x <= 890 && y >= 80 && y <= 115 && !farmUpgradeBool && numCookies >= commonPrice) {
			farmUpgradeBool = true;
			numCookies -= commonPrice;
			farmCPS *= 2;
		}
		
		if(x >= 900 && x <= 935 && y >= 80 && y <= 115 && !farmUpgrade2Bool && numCookies >= rarePrice) {
			farmUpgrade2Bool = true;
			numCookies -= rarePrice;
			farmCPS *= 5;
		}
		
		if(x >= 945 && x <= 980 && y >= 80 && y <= 115 && !mineUpgradeBool && numCookies >= rarePrice) {
			mineUpgradeBool = true;
			numCookies -= rarePrice;
			mineCPS *= 2;
		}
		
		if(x >= 765 && x <= 800 && y >= 130 && y <= 165 && !mineUpgrade2Bool && numCookies >= epicPrice) {
			mineUpgrade2Bool = true;
			numCookies -= epicPrice;
			mineCPS *= 5;
		}
		
		if(x >= 810 && x <= 845 && y >= 130 && y <= 165 && !factoryUpgradeBool && numCookies >= rarePrice) {
			factoryUpgradeBool = true;
			numCookies -= rarePrice;
			factoryCPS *= 2;
		}
		
		if(x >= 855 && x <= 890 && y >= 130 && y <= 165 && !factoryUpgrade2Bool && numCookies >= epicPrice) {
			factoryUpgrade2Bool = true;
			numCookies -= epicPrice;
			factoryCPS *= 5;
		}
		
		if(x >= 900 && x <= 935 && y >= 130 && y <= 165 && !countryUpgradeBool && numCookies >= rarePrice) {
			countryUpgradeBool = true;
			numCookies -= 55000;
			countryCPS *= 2;
		}
		
		if(x >= 945 && x <= 980 && y >= 130 && y <= 165 && !countryUpgrade2Bool && numCookies >= epicPrice) {
			countryUpgrade2Bool = true;
			numCookies -= epicPrice;
			countryCPS *= 5;
		}
		
		if(x >= 765 && x <= 800 && y >= 175 && y <= 210 && !colonyUpgradeBool && numCookies >= rarePrice) {
			colonyUpgradeBool = true;
			numCookies -= rarePrice;
			colonyCPS *= 2;
		}
		
		if(x >= 810 && x <= 845 && y >= 175 && y <= 210 && !colonyUpgrade2Bool && numCookies >= epicPrice) {
			colonyUpgrade2Bool = true;
			numCookies -= epicPrice;
			colonyCPS *= 5;
		}
		
		if(x >= 855 && x <= 890 && y >= 175 && y <= 210 && !galaxyUpgradeBool && numCookies >= epicPrice) {
			galaxyUpgradeBool = true;
			numCookies -= epicPrice;
			galaxyCPS *= 2;
		}
		
		if(x >= 900 && x <= 935 && y >= 175 && y <= 210 && !galaxyUpgrade2Bool && numCookies >= legendaryPrice) {
			galaxyUpgrade2Bool = true;
			numCookies -= legendaryPrice;
			galaxyCPS *= 5;
		}
		
		if(x >= 945 && x <= 980 && y >= 175 && y <= 210 && !cookieUpgradeBool && numCookies >= commonPrice) {
			cookieUpgradeBool = true;
			numCookies -= commonPrice;
		}
		
		if(x >= 765 && x <= 800 && y >= 220 && y <= 255 && !cookieUpgrade2Bool && numCookies >= rarePrice) {
			cookieUpgrade2Bool = true;
			numCookies -= rarePrice;
		}
		
		if(x >= 810 && x <= 845 && y >= 220 && y <= 255 && !cookieUpgrade3Bool && numCookies >= epicPrice) {
			cookieUpgrade3Bool = true;
			numCookies -= epicPrice;
		}
		
		if(x >= 855 && x <= 890 && y >= 220 && y <= 255 && !cookieUpgrade4Bool && numCookies >= legendaryPrice) {
			cookieUpgrade4Bool = true;
			numCookies -= legendaryPrice;
		}
		
		if(x >= 900 && x <= 935 && y >= 220 && y <= 255 && !buildingUpgradeBool && numCookies >= legendaryPrice) {
			buildingUpgradeBool = true;
			numCookies -= legendaryPrice;
			farmCPS *= 1.1;
			mineCPS *= 1.1;
			factoryCPS *= 1.1;
			countryCPS *= 1.1;
			colonyCPS *= 1.1;
			galaxyCPS *= 1.1;
		}
		
		if(x >= 945 && x <= 980 && y >= 220 && y <= 255 && !cpsUpgradeBool && numCookies >= legendaryPrice) {
			cpsUpgradeBool = true;
			numCookies -= legendaryPrice;
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
