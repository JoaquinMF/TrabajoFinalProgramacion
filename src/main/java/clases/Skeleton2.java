package clases;

import java.sql.SQLException;
import java.sql.Statement;

import utils.UtilsDB;

public class Skeleton2 extends Monster {

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
