package principal;

import java.util.ArrayList;
import clases.Item;
import clases.Quest;
import clases.Skill;

public class Main {

	public static void main(String[] args) {
		
		
		
		ArrayList<Quest> quests = new ArrayList<Quest>();
		
		quests.add(new Quest("Main Quest 1� Parte","Hola aventurero, bienvenido ",null));
		quests.add(new Quest("Main Quest 2� Parte","Que hay de nuevo aventurero ",null));
		quests.add(new Quest("Main Quest 3� Parte","El momento de la verdad lleg� aventurero ",null));
		quests.add(new Quest("Side Quest 1�","Hola, tu no podrias... ",null));
		quests.add(new Quest("Side Quest 2�","Hombre, si es el aventurero ",null));
		quests.add(new Quest("Side Quest 3�","Por favor aventurero... ",null));
		
		ArrayList<Skill> passives = new ArrayList<Skill>();
		
		Skill salto=new Skill("Mejora la speed", (short)1, (short)1, (short)1, (short)1, (short)1);

	}

}
