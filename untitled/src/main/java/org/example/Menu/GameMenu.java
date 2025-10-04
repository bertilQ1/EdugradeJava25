package org.example.Menu;

import org.example.Characters.GulDan;
import org.example.Characters.Hero;
import org.example.Characters.LichKing;
import org.example.Characters.Wither;
import org.example.Combat;

import java.util.Scanner;

public class GameMenu {
    private Scanner scanner = new Scanner(System.in);
    private Hero hero;
    private boolean gameIsRunning;

    public GameMenu(Hero hero) {
        this.hero = hero;
        this.gameIsRunning = true; // boolean för spelet
    }

    public void showMainMenu() {
        while (gameIsRunning) { // om boolean(gameisrunning) är false = while loopen slutar
            System.out.println("=== MENU ===");
            System.out.println("[1] Venture in to the forest!");
            System.out.println("[2] Go to the shop!");
            System.out.println("[3] Fight Gul'Dan (level 10 required)");
            System.out.println("[4] See your stats!");
            System.out.println("[0] Quit game!");

            System.out.println("\nChoose a number!"); // \n så den inte blir klumpad med menyn
            int choice = scanner.nextInt(); // ser till att nästa int dem skriver blir vilken switch case dem väljer

            switch (choice) {
                case 1:
                    ventureIntoForest();
                    break;
                case 2:
                    Shop shop = new BasicShop(); // kunna troligen gjort shoppen snyggare :/
                    shop.openShop(hero);
                    break;
                case 3:
                    if (hero.getLevel() >= 10) { // ser till att man bara kan fighta guldan när man är 10 eller högre level
                        GulDan gulDan = new GulDan(); // skapar en guldan
                        Combat battle = new Combat(hero, gulDan); // skapar en battle, hero mot guldan
                        battle.startBattle(); // startar den battlen
                        if (hero.getHealth() <= 0) { // om hero dör
                            System.out.println("\n GAME OVER");
                            gameIsRunning = false;
                        }
                        if (gulDan.getHealth() <= 0) { // om guldan dör
                            System.out.println("=== CONGRATULATIONS ===");
                            System.out.println("You've defeated the final boss and thus beat the game!");
                            gameIsRunning = false;
                        }
                    } else { // om man inte har lvl 10 eller högre
                        System.out.println("You need to be level 10 to fight Gul'Dan!");
                    }
                    break;
                case 4: // skriver ut alla stats man har, samt guld etc
                    System.out.println(hero.getName() + "\n level: " + hero.getLevel() + "\n XP: " + hero.getXp() + "\n Gold: " + hero.getGold() + "\n Weapon damage: " + hero.getAttackDamage());
                    break;
                case 0: // stänger ner spelet
                    System.out.println("Shutting down!");
                    gameIsRunning = false;
                    break;
            }
        }
    }

    private void ventureIntoForest() { //kunde troligen gjort detta i en egen klass för att denna klassen skulle bli lite mindre
        System.out.println(hero.getName() + " ventures into the forest...");
        int chance = Helper.randomInt(1, 100);

        if (chance <= 10) { // 10% chans för bossen (lichking)
            LichKing lichKing = new LichKing();
            System.out.println("\nLICH KING APPEARS!");
            Combat battle = new Combat(hero, lichKing);
            battle.startBattle();
        } else if (chance <= 30) { // 20% chans för safe spot
            System.out.println("You found some goodies! +25 xp, +50 gold");
            hero.gainXp(25);
            hero.setGold(hero.getGold() + 50);
        } else { // 70% chans för wither
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