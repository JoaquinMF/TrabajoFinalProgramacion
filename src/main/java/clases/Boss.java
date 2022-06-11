package clases;

import java.sql.SQLException;
import java.sql.Statement;

import utils.UtilsDB;

/**
 * Clase que contiene al Boss, extiende de Monster
 * @author Duendeboss
 *
 */

public class Boss extends Monster{
	
	/**
	 * Metodo para llamar y establecer al Boss.
	 * El Statement query realiza una inserción en la base de datos proyectoFinal
	 */
	
	public Boss() {
		monsterName = "Boss";
		monsterLife = 5;
		monsterAttack = 2; 
		monsterDefense = 1;
		
		Statement query = UtilsDB.conectarBD();
		try {
			query.executeUpdate("insert into monster values('" + monsterName + "','" + monsterLife + "','"
					+ monsterAttack + "','" + monsterDefense + "')");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		this.monsterName = "Boss";
		this.monsterLife = 5;
		this.monsterAttack = 2;
		this.monsterDefense = 1;

		UtilsDB.desconectarBD();

	  }

}
