package org.example.Menu;

import org.example.Characters.GulDan;
import org.example.Characters.Hero;
import org.example.Characters.LichKing;
import org.example.Characters.Wither;
import org.example.Combat;

import java.util.Scanner;
import java.util.SortedMap;

public class GameMenu {
    private Scanner scanner = new Scanner(System.in);
    private Hero hero;
    private boolean gameIsRunning;

    public GameMenu(Hero hero) {
        this.hero = hero;
        this.gameIsRunning = true;
    }

    public void showMainMenu() {
        while (gameIsRunning) {
            System.out.println("=== MENU ===");
            System.out.println("[1] Venture in to the forest!");
            System.out.println("[2] Go to the shop!");
            System.out.println("[3] Fight Gul'Dan (level 10 required)");
            System.out.println("[4] See your stats!");
            System.out.println("[0] Quit game!");

            System.out.println("\nChoose a number!");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ventureIntoForest();
                    break;
                case 2:
                    break;
                case 3:
                    if (hero.getLevel() >= 10) {
                        GulDan gulDan = new GulDan();
                        Combat battle = new Combat(hero, gulDan);
                        battle.startBattle();
                        if (hero.getHealth() <= 0) {
                            System.out.println("\n" + hero.getName() + " Has died! \n GAME OVER!");
                            gameIsRunning = false;
                        }
                    } else {
                        System.out.println("You need to be level 10 to fight Gul'Dan!");
                    }
                    break;
                case 4:
                    System.out.println(hero.getName() + "\n level: " + hero.getLevel() + "\n XP: " + hero.getXp() + "\n Gold: " + hero.getGold() + "\n Weapon damage: " + hero.getAttackDamage());
                    break;
                case 0:
                    System.out.println("Shutting down!");
                    gameIsRunning = false;
                    break;
            }
        }
    }

    private void ventureIntoForest() {
        System.out.println(hero.getName() + " ventures into the forest...");
        int chance = Helper.randomInt(1, 100);

        if (chance <= 10) {
            LichKing lichKing = new LichKing();
            System.out.println("\nLICH KING APPEARS!");
            Combat battle = new Combat(hero, lichKing);
            battle.startBattle();
        } else if (chance <= 30) {
            System.out.println("You found some goodies! +25 xp, +50 gold");
            hero.gainXp(25);
            hero.setGold(hero.getGold() + 50);
        } else {
            System.out.println("A wither jumps out of the bushes!");
            Wither wither = new Wither();
            Combat battle = new Combat(hero, wither);
            battle.startBattle();
        }

        if (hero.getHealth() <= 0) {
            System.out.println("\n GAME OVER!");
            gameIsRunning = false;
        }
    }
}