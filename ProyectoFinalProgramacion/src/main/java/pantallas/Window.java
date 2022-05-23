package pantallas;

import java.awt.Cursor;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
	
	private HashMap<String,JPanel> windows;
	
	public Window() {
		windows=new HashMap<String,JPanel>();
		windows.put("new game",new GameWindow());
		windows.put("load game", new GameWindow());
		
		
		
		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon("./iconos/javaIcon.png").getImage());
		this.setTitle("Pruebas y apuntes Interfaces Graficas 1DAM");
		//this.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		this.setResizable(false);
		
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH); //<- "pantalla completa"
		//this.setUndecorated(true); //<- "pantalla completa"
		this.setContentPane(this.windows.get("login"));
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);//setVisible necesita ser lo ultimo siempre
		
		
	}
	
	public void cambiarAPantalla(String nombrePantalla) {
		Iterator it=this.windows.values().iterator();
		while(it.hasNext()) {
			JPanel actual=(JPanel)it.next();
			actual.setVisible(false);
		}
		
		this.windows.get(nombrePantalla).setVisible(true);
		this.setContentPane(this.windows.get(nombrePantalla));
	}

}