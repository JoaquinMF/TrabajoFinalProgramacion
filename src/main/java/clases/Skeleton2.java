package clases;

import java.sql.SQLException;
import java.sql.Statement;

import utils.UtilsDB;

/**
 * Clase cuya instancia representa al monstruo Skeleton2
 * @author Duendeboss
 *
 */

public class Skeleton2 extends Monster {
	
	/**
	 * funcion que al llamarla instancia y settea al monstruo Skeleton2, además de hacer una inserción en la tabla monster de la base de datos proyectoFinal
	 */
	

	public Skeleton2() {
		monsterName = "Skeleton2";
		monsterLife = 4;
		monsterAttack = 1;
		monsterDefense = 1;

		Statement query = UtilsDB.conectarBD();
		try {
			query.executeUpdate("insert into monster values('" + monsterName + "','" + monsterLife + "','"
					+ monsterAttack + "','" + monsterDefense + "')");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		this.monsterName = "Skeleton2";
		this.monsterLife = 4;
		this.monsterAttack = 1;
		this.monsterDefense = 1;

		UtilsDB.desconectarBD();

	}

}
