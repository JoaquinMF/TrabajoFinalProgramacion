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

import clases.GameManager;

import java.awt.Font;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class UI {

	GameManager gm;

	JFrame window;
	public JTextArea messages;
	public JPanel bgPanel[] = new JPanel[10];
	public JLabel bgLabel[] = new JLabel[10];
	// public HashMap<String,JPanel> bgPanel=new HashMap<String,JPanel>();

	public UI(GameManager gm) {
		this.gm = gm;

		createMainField();

		generateRegion();

		// createBackground();
		// createObject();

		window.setVisible(true);
	}

	public void createMainField() {

		window = new JFrame();
		window.setSize(1100, 960);
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

	public void createBackground(int bgNum, String bgFileName) {

		bgPanel[bgNum] = new JPanel();
		bgPanel[bgNum].setBounds(50, 50, 1100, 960);
		bgPanel[bgNum].setBackground(Color.black);
		bgPanel[bgNum].setLayout(null);
		//bgPanel[bgNum].setVisible(false);
		window.getContentPane().add(bgPanel[bgNum]);

		bgLabel[bgNum] = new JLabel();
		bgLabel[bgNum].setBounds(0, 0, 1100, 960);

		ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
		bgLabel[bgNum].setIcon(bgIcon);

	}

	public void createObject(int bgNum, int objx, int oby, int objWidth, int objectHeight, String objFileName,
			String choice1Name, String choice2Name, String choice3Name, String choice1Command, String choice2Command,
			String choice3Command) {

		// CREATE POP MENU
		final JPopupMenu popMenu = new JPopupMenu();
		// CREATE POP MENU ITEMS
		JMenuItem menuItem[] = new JMenuItem[4]; // Usar [1],[2],[3]
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
		// objectLabel.setBounds(750,690,200,84);
		objectLabel.setBounds(objx, oby, objWidth, objectHeight);

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
		
		bgPanel[bgNum].add(arrowButton);
		
	}

	public void generateRegion() {

		//REGION 1
		createBackground(1, "brightfoot1024x800.PNG");
		createObject(1, 750, 690, 200, 84, "chest200x84OBJECT.PNG", "Look", "Open", "Talk", "lookChest", "openChest","talkChest");
		createObject(1, 550, 490, 130, 274, "seta130x274OBJECT.PNG", "Look", "Talk", "Attack", "lookSeta", "attackSeta","talkSeta");
		createArrowButton(1,820,270,100,100,"directionArrowICON.png","goRegion2");
		bgPanel[1].add(bgLabel[1]);
		
		//REGION 2
		createBackground(2, "brightfoot21024x800.png");
		createObject(2, 350, 450, 128, 327, "captainMike600x400OBJECT.png", "Look", "Attack", "Talk", "lookMike", "attackMike","talkMike");
		createObject(2, 770, 450, 250, 386, "buttStallion600x400OBJECT.png", "Look", "Attack", "Talk", "lookButtstallion", "attackButtstallion","talkButtstallion");
		createArrowButton(2,140,580,100,100,"directionArrowICON.png","goRegion1");
		bgPanel[2].add(bgLabel[2]);
		
		
	}

}
