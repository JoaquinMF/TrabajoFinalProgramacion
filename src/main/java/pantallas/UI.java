package pantallas;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.awt.Image;

import clases.GameManager;
import event.Event01;
import java.awt.Font;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import javax.swing.UIManager;
import java.awt.GridLayout;

public class UI {

	GameManager gm;

	public JFrame window;
	public JTextArea messages;
	public JPanel bgPanel[] = new JPanel[10];
	public JLabel bgLabel[] = new JLabel[10];
	public JButton choiceB1,choiceB2;
	//Player UI
	
	JPanel lifePanel;
	public JLabel lifeLabel[]=new JLabel[6];
	
	JPanel inventoryPanel;
	public JLabel weaponLabel;
	public JLabel defenseLabel;
	public JLabel itemLabel;
	
	//GAME OVER UI
	public JLabel endLabel;
	public JLabel gameOverLabel;
	public JButton restartButton;
	
	
	// public HashMap<String,JPanel> bgPanel=new HashMap<String,JPanel>();

	public UI(GameManager gm) {
		this.gm = gm;

		createMainField();
		createPlayerField();
		createGameOverField();
		generateRegion();

		
		window.setVisible(true);
	}

	public void createMainField() {

		window = new JFrame("Awesome Quest");
		window.setSize(1100, 990);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.getContentPane().setLayout(null);

		messages = new JTextArea("");
		messages.setBounds(100, 795, 528, 106);
		messages.setBackground(new Color(135, 206, 235));
		messages.setForeground(new Color(0, 0, 0));
		messages.setEditable(false);
		messages.setLineWrap(true);
		messages.setWrapStyleWord(true);
		messages.setFont(new Font("Gabriola", Font.PLAIN, 24));
		window.getContentPane().add(messages);
		
	
		
	}

	public void createBackgroundImage(int bgNum, String bgFileName) {

		bgPanel[bgNum] = new JPanel();
		bgPanel[bgNum].setBounds(50, 50, 1100, 990);
		bgPanel[bgNum].setBackground(Color.black);
		bgPanel[bgNum].setLayout(null);
		bgPanel[bgNum].setVisible(false);
		
		window.add(bgPanel[bgNum]);
		
		
		bgLabel[bgNum] = new JLabel();
		bgLabel[bgNum].setBounds(0, 0, 1100, 990);

		ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
		bgLabel[bgNum].setIcon(bgIcon);

	}

	public void createObject(int bgNum, int objx, int oby, int objWidth, int objectHeight, String objFileName,
			String choice1Name, String choice2Name, String choice3Name, String choice1Command, String choice2Command,
			String choice3Command) {

		// CREATE POP MENU
		final JPopupMenu popMenu = new JPopupMenu();
		// CREATE POP MENU ITEMS
		JMenuItem menuItem[] = new JMenuItem[10]; // Usar [1],[2],[3]
		menuItem[1] = new JMenuItem(choice1Name);
		menuItem[1].addActionListener(gm.aHandler);
		menuItem[1].setActionCommand(choice1Command);
		popMenu.add(menuItem[1]);

		menuItem[2] = new JMenuItem(choice2Name);
		menuItem[2].addActionListener(gm.aHandler);
		menuItem[2].setActionCommand(choice2Command);
		popMenu.add(menuItem[2]);

		menuItem[3] = new JMenuItem(choice3Name);
		menuItem[3].addActionListener(gm.aHandler);
		menuItem[3].setActionCommand(choice3Command);
		popMenu.add(menuItem[3]);
		
		// CREATE OBJECTS
		final JLabel objectLabel = new JLabel();
		objectLabel.setBounds(objx, oby, objWidth, objectHeight);
		
		//objectLabel.setOpaque(true);
		//objectLabel.setBackground(Color.blue);
		
		ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFileName));
		objectLabel.setIcon(objectIcon);

		objectLabel.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {

				if (SwingUtilities.isRightMouseButton(e)) {
					popMenu.show(objectLabel, e.getX(), e.getY());
				}
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

		});

		bgPanel[bgNum].add(objectLabel);
		

	}
	
	public void createArrowButton(int bgNum, int x, int y, int width, int height, String arrowFileName, String command) {
		
		//final JLabel objectLabel = new JLabel();
		
		ImageIcon arrowIcon=new ImageIcon(getClass().getClassLoader().getResource(arrowFileName));
		//objectLabel.setIcon(arrowIcon);
		
		JButton arrowButton = new JButton();
		arrowButton.setBounds(x,y,width,height);
		arrowButton.setBackground(null);
		arrowButton.setContentAreaFilled(false);
		arrowButton.setFocusPainted(false);
		arrowButton.setIcon(arrowIcon);
		arrowButton.addActionListener(gm.aHandler);
		arrowButton.setActionCommand(command);
		arrowButton.setVisible(true);
		
		bgPanel[bgNum].add(arrowButton);
		
	}

	public void createPlayerField() {
		
		lifePanel=new JPanel();
		lifePanel.setBounds(50, 10, 500, 100);
		lifePanel.setBackground(Color.black);
		lifePanel.setLayout(new GridLayout(1,5));
		window.add(lifePanel);
		
		ImageIcon lifeIcon=new ImageIcon(getClass().getClassLoader().getResource("heartICON100X100.png"));
		
		
		short i=1;
		while(i<6) {
			
			lifeLabel[i]=new JLabel();
			lifeLabel[i].setIcon(lifeIcon);
			lifePanel.add(lifeLabel[i]);
			i++;
		}
		
		inventoryPanel =new JPanel();
		inventoryPanel.setBounds(600,10,300,120);
		inventoryPanel.setBackground(Color.black);
		inventoryPanel.setLayout(new GridLayout(1,3));
		window.add(inventoryPanel);
		
		//Create items
		
		weaponLabel=new JLabel();
		ImageIcon weaponIcon=new ImageIcon(getClass().getClassLoader().getResource("dagger100x13ICON.png"));
		weaponLabel.setIcon(weaponIcon);
		inventoryPanel.add(weaponLabel);
		
		defenseLabel=new JLabel();
		ImageIcon defenseIcon=new ImageIcon(getClass().getClassLoader().getResource("chestArmorICON100x100.png"));
		defenseLabel.setIcon(defenseIcon);
		inventoryPanel.add(defenseLabel);
		
		itemLabel=new JLabel();
		ImageIcon itemIcon=new ImageIcon(getClass().getClassLoader().getResource("ropeICON100x100.png"));
		itemLabel.setIcon(itemIcon);
		inventoryPanel.add(itemLabel);
	
		
		
	}
	
	public void createGameOverField() {
		
		gameOverLabel=new JLabel("",JLabel.CENTER);
		gameOverLabel.setBounds(200,150,400,200);
		gameOverLabel.setForeground(Color.red);
		gameOverLabel.setFont(new Font("Times new Roman",Font.PLAIN,70));
		gameOverLabel.setBackground(Color.black);
		gameOverLabel.setVisible(false);
		window.add(gameOverLabel);
		
		restartButton=new JButton();
		restartButton.setBounds(340,320,120,50);
		restartButton.setBorder(null);
		restartButton.setBackground(null);
		restartButton.setForeground(Color.white);
		restartButton.setFocusPainted(false);
		restartButton.addActionListener(gm.aHandler);
		restartButton.setActionCommand("restart");
		restartButton.setVisible(false);
		window.add(restartButton);
	}
	
	public void generateRegion() {

		//REGION 1
		createBackgroundImage(1, "brightfoot1024x800.PNG");
		createObject(1, 750, 690, 200, 84, "chest200x84OBJECT.PNG", "Look", "Open", "Talk", "lookChest", "openChest","talkChest");
		createObject(1, 550, 490, 130, 274, "seta130x274OBJECT.PNG", "Look", "Talk", "Attack", "lookSeta","talkSeta","attackSeta");
		createObject(1, 100, 530, 100, 100, "blankICON300X300.png", "Look", "Talk", "Climb Cliff", "lookCliff", "talkCliff","climbCliff");
		createArrowButton(1,820,270,100,100,"directionArrowICON.png","goRegion2");
		bgPanel[1].add(bgLabel[1]);
		
		//REGION 2
		createBackgroundImage(2, "brightfoot21024x800.png");
		createObject(2, 350, 450, 128, 327, "captainMike600x400OBJECT.png", "Look", "Attack", "Talk", "lookMike", "attackMike","talkMike");
		createObject(2, 770, 450, 250, 386, "buttStallion600x400OBJECT.png", "Look", "Attack", "Talk", "lookButtstallion", "attackButtstallion","talkButtstallion");
		createObject(2, 480, 200, 100, 100, "blankICON300X300.png", "Look", "Rest", "Search", "lookCastle", "restCastle","searchCastle");
		createArrowButton(2,140,580,100,100,"directionArrowICON.png","goRegion1");
		bgPanel[2].add(bgLabel[2]);
		
		
		//REGION 3
		createBackgroundImage(3, "lootbay1024x800.png");
		createObject(3, 150, 350, 435, 346, "skeleton2OBJECT435x346.png", "Look", "Attack", "Talk", "lookSkeleton2", "attackSkeleton2","talkSkeleton2");
		createObject(3, 480, 200, 100, 100, "blankICON300X300.png", "Look", "Talk", "Enter", "lookTemple", "talkTemple","enterTemple");
		createArrowButton(3,900,780,100,100,"directionArrowICON.png","goRegion1");
		bgPanel[3].add(bgLabel[3]);
		
		//REGION 4
		createBackgroundImage(4, "temple1024x800.png");
		createObject(4, 350, 350, 435, 346, "bossICON500x405.png", "Look", "Attack", "Talk", "lookBoss", "attackBoss","talkBoss");
		createArrowButton(4,900,780,100,100,"directionArrowICON.png","goRegion3");
		bgPanel[4].add(bgLabel[4]);
		
		//End Screen
		createBackgroundImage(5, "startScreen1024x800.png");
		bgPanel[5].add(bgLabel[5]);
		
		
	}
}
