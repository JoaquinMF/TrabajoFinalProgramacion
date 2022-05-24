package pantallas;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;

import java.awt.Color;
import clases.GameManager;
import java.awt.SystemColor;
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
		createBackground();
		createObject();
		
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
	
	public void createBackground() {
		
		bgPanel[1]=new JPanel();
		bgPanel[1].setBounds(50,50,1100,960);
		bgPanel[1].setBackground(Color.black);
		bgPanel[1].setLayout(null);
		window.getContentPane().add(bgPanel[1]);
		
		bgLabel[1]=new JLabel();
		bgLabel[1].setBounds(0,0,1100,960);
		
		ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("brightfoot1024x800.PNG"));
		bgLabel[1].setIcon(bgIcon);
		
		
		
	}
	
	public void createObject() {
		
		JLabel objectLabel=new JLabel();
		objectLabel.setBounds(750,690,200,84);
		
		ImageIcon objectIcon=new ImageIcon(getClass().getClassLoader().getResource("chest200x84OBJECT.png"));
		objectLabel.setIcon(objectIcon);
		
		bgPanel[1].add(objectLabel);
		bgPanel[1].add(bgLabel[1]);
		
		
		
	}
	
}
