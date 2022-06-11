package clases;

import java.util.Random;

public class BattleManager {

	GameManager gm;
	Monster monster;
	Seta mushroom = new Seta();
	Skeleton1 skeleton1 = new Skeleton1();
	Boss boss = new Boss();

	Random randomDie = new Random();

	public BattleManager(GameManager gm) {

		this.gm = gm;
	}

	public void resetMonsterLife() {
		// add all the monsters if needed
		mushroom.monsterLife = mushroom.monsterMaxLife;
		skeleton1.monsterLife = skeleton1.monsterMaxLife;
		boss.monsterLife = boss.monsterMaxLife;
	}

	public void setMonster() {
		monster = mushroom;
		monster = skeleton1;
		monster = boss;
		attack();
	}

	public void attack() {

		int playerDamage = randomDie.nextInt(gm.player.playerAttack) - monster.monsterDefense;
		if (playerDamage < 0) {
			playerDamage = 0;
		}
		gm.ui.messages.setText("");
		gm.ui.messages.append("You attack the " + monster.monsterName + " and give " + playerDamage + " damage!");
		monster.monsterLife -= playerDamage;
		if (monster.monsterLife < 1) {
			
		} else {
			int monsterDamage = randomDie.nextInt(monster.monsterAttack) - gm.player.playerDefense;
			if (monsterDamage < 0) {
				monsterDamage = 0;
			}
			gm.player.playerCurrentLife -= monsterDamage;
			gm.ui.messages.append("\nThe " + monster.monsterName + " attacks you and give " + monsterDamage + " damage!");
			if (gm.player.playerCurrentLife < 1) {
				gm.player.playerCurrentLife = 0;
				gm.player.updatePlayerStatus();
				lose();
			} else {
				gm.player.updatePlayerStatus();
			}
		}
		gm.playSE(gm.hittedSound);
	}


	public void lose() {

		gm.ui.messages.append("\nYou died!!");
		gm.rChanger.showGameOverScreen(1);
		gm.rChanger.showGameOverScreen(3);
	}

}
