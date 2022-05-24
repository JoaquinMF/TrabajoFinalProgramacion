package pantallas;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;

import java.awt.Color;
import clases.GameManager;
import java.awt.SystemColor;

public class UI {

	GameManager gm;
	JFrame window;
	
	public JTextArea messages;
	
	public UI(GameManager gm) {
		this.gm=gm;
		createMainField();
		
		window.setVisible(true);
	}
	
	public void createMainField() {
		
		window=new JFrame();
		window.setSize(1024,800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.getContentPane().setLayout(null);
		
		
		messages = new JTextArea("TEXTO DE PRUEBA");
		messages.setBounds(10,588,988,162);
		messages.setBackground(new Color(135, 206, 235));
		messages.setForeground(new Color(0, 0, 0));
		messages.setEditable(false);
		messages.setLineWrap(true);
		messages.setWrapStyleWord(true);
		messages.setFont(new Font("Gabriola", Font.PLAIN, 34));
		window.getContentPane().add(messages);
		
	}
	
}
