package clases;

import java.util.Random;

public class BattleManager {

	GameManager gm;
	Monster monster;
	Seta mushroom = new Seta();
	Skeleton1 skeleton1 = new Skeleton1();
	Skeleton2 skeleton2 = new Skeleton2();
	Boss boss = new Boss();

	Random randomDie = new Random();

	public BattleManager(GameManager gm) {

		this.gm = gm;
	}

	public void resetMonsterLife() {
		// add all the monsters if needed
		mushroom.monsterLife = mushroom.monsterMaxLife;
		skeleton1.monsterLife = skeleton1.monsterMaxLife;
		skeleton2.monsterLife = skeleton2.monsterMaxLife;
		boss.monsterLife = boss.monsterMaxLife;
	}

	public void setMonster() {
		monster = mushroom;
		monster = skeleton1;
		monster = skeleton2;
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
			win();
		} else {
			int monsterDamage = randomDie.nextInt(monster.monsterAttack) - gm.player.playerDefense;
			if (monsterDamage < 0) {
				monsterDamage = 0;
			}
			gm.player.playerCurrentLife -= monsterDamage;
			gm.ui.messages
					.append("\nThe " + monster.monsterName + " attacks you and give " + monsterDamage + " damage!");
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

	public void win() {

		gm.ui.messages.append("\nYou have defeated the monster!");

		if (monster == mushroom) {
			gm.player.defeatSeta = true;
			gm.stopMusic(gm.currentMusic);
		} else {
		}
		
		if (monster == skeleton1) {
			gm.player.defeatSkeleton1 = true;
			gm.stopMusic(gm.currentMusic);
		} else {
		}
		
		if (monster == skeleton2) {
			gm.player.defeatSkeleton2 = true;
			gm.stopMusic(gm.currentMusic);
		} else {
		}
		
		if (monster == boss) {
			gm.player.defeatBoss = true;
			gm.stopMusic(gm.currentMusic);
		} else {
		}
	}

	public void lose() {

		gm.ui.messages.append("\nYou died!!");
		gm.rChanger.showGameOverScreen(1);
		gm.rChanger.showGameOverScreen(3);
	}

}
