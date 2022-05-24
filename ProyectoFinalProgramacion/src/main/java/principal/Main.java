package principal;

import java.util.ArrayList;
import clases.Item;
import clases.Quest;
import clases.Skill;

public class Main {

	public static void main(String[] args) {
		
		
		
		ArrayList<Quest> quests = new ArrayList<Quest>();
		
		quests.add(new Quest("Main Quest 1º Parte","Hola aventurero, bienvenido ",null));
		quests.add(new Quest("Main Quest 2º Parte","Que hay de nuevo aventurero ",null));
		quests.add(new Quest("Main Quest 3º Parte","El momento de la verdad llegó aventurero ",null));
		quests.add(new Quest("Side Quest 1º","Hola, tu no podrias... ",null));
		quests.add(new Quest("Side Quest 2º","Hombre, si es el aventurero ",null));
		quests.add(new Quest("Side Quest 3º","Por favor aventurero... ",null));
		
		ArrayList<Skill> passives = new ArrayList<Skill>();
		
		Skill salto=new Skill("Mejora la speed", (short)1, (short)1, (short)1, (short)1, (short)1);

	}

}
