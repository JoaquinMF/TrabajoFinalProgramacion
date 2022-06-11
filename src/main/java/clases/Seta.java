package clases;

import java.sql.SQLException;
import java.sql.Statement;

import utils.UtilsDB;

/**
 * Clase cuya instancia representa al monstruo Seta
 * @author Duendeboss
 *
 */

public class Seta extends Monster{
	
	/**
	 * funcion que al llamarla instancia y settea al monstruo Seta, además de hacer una inserción en la tabla monster de la base de datos proyectoFinal
	 */
	
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
