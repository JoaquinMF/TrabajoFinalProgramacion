package clases;

import java.sql.SQLException;
import java.sql.Statement;

import utils.UtilsDB;

public class Seta extends Monster{
	
	
	public Seta() {
		
		this.monsterName = "Mushroom";
		this.monsterLife = 3;
		this.monsterAttack = 1;
		this.monsterDefense = 0;
	
	Statement query=UtilsDB.conectarBD();
		try {
			query.executeUpdate("insert into monster values('"+monsterName+"','"+monsterLife+"','"+monsterAttack+"','"+monsterDefense+"')");
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
			this.monsterName = "Mushroom";
			this.monsterLife = 3;
			this.monsterAttack = 1;
			this.monsterDefense = 0;
	
	UtilsDB.desconectarBD();

  }
}
