package pantallas;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import java.awt.Font;

import java.awt.Color;
import clases.GameManager;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

public class UI {

	GameManager gm;
	
	JFrame window;
	public JTextArea messages;
	public JPanel bgPanel[]=new JPanel[10];
	public JLabel bgLabel[]=new JLabel[10];
	//public HashMap<String,JPanel> bgPanel=new HashMap<String,JPanel>();
	
	public UI(GameManager gm) {
		this.gm=gm;
		
		createMainField();
		
		generateScreen();
		
		//createBackground();
		//createObject();
		
		window.setVisible(true);
	}
	
	public void createMainField() {
		
		window=new JFrame();
		window.setSize(1100,960);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.getContentPane().setLayout(null);
		
		
		messages = new JTextArea("TEXTO DE PRUEBA");
		messages.setBounds(100,795,528,106);
		messages.setBackground(new Color(135, 206, 235));
		messages.setForeground(new Color(0, 0, 0));
		messages.setEditable(false);
		messages.setLineWrap(true);
		messages.setWrapStyleWord(true);
		messages.setFont(new Font("Gabriola", Font.PLAIN, 24));
		window.getContentPane().add(messages);
		
	}
	
	public void createBackground(int bgNum, String bgFileName) {
		
		bgPanel[bgNum]=new JPanel();
		bgPanel[bgNum].setBounds(50,50,1100,960);
		bgPanel[bgNum].setBackground(Color.black);
		bgPanel[bgNum].setLayout(null);
		window.getContentPane().add(bgPanel[1]);
		
		bgLabel[bgNum]=new JLabel();
		bgLabel[bgNum].setBounds(0,0,1100,960);
		
		ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
		bgLabel[bgNum].setIcon(bgIcon);
		
		
		
	}
	
	public void createObject(int bgNum, int objx, int oby, int objWidth, int objectHeight, 
			String objFileName, String choice1Name, String choice2Name, String choice3Name) {
		
		//CREATE POP MENU
		final JPopupMenu popMenu=new JPopupMenu();
		//CREATE POP MENU ITEMS
		JMenuItem menuItem[]=new JMenuItem[4]; //Usar [1],[2],[3]
		menuItem[1]=new JMenuItem(choice1Name);
		popMenu.add(menuItem[1]);
		
		menuItem[2]=new JMenuItem(choice2Name);
		popMenu.add(menuItem[2]);
		
		menuItem[3]=new JMenuItem(choice3Name);
		popMenu.add(menuItem[3]);
		//CREATE OBJECTS
		final JLabel objectLabel=new JLabel();
		//objectLabel.setBounds(750,690,200,84);
		objectLabel.setBounds(objx,oby,objWidth,objectHeight);
		
		
		ImageIcon objectIcon=new ImageIcon(getClass().getClassLoader().getResource(objFileName));
		objectLabel.setIcon(objectIcon);
		
		objectLabel.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {	
			}
			public void mousePressed(MouseEvent e) {
				
				if(SwingUtilities.isRightMouseButton(e)) {
					popMenu.show(objectLabel,e.getX(),e.getY());
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
		bgPanel[bgNum].add(bgLabel[bgNum]);
		
		
	}
	
	public void generateScreen() {
		
		//SCREEN 1
		createBackground(1,"brightfoot1024x800.PNG");
		createObject(1,750,690,200,84,"chest200x84OBJECT.PNG","Look","Open","Talk");
		createObject(1,550,490,130,274,"seta130x274OBJECT.PNG","Look","Talk","Attack");
		
		
	}
	
}
