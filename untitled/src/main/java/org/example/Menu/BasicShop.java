package org.example.Menu;

import org.example.Characters.Hero;

import java.util.Scanner;

public class BasicShop implements Shop {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void openShop(Hero hero){
        boolean shopping = true;
        while (shopping) {
            System.out.println("=== SHOP ===");
            System.out.println("[1] Upgrade weapon (+5 damage) [50 GOLD]");
            System.out.println("[2] Heal to full health [50 GOLD]");
            System.out.println("[0] Return to main menu!");

            int choice = scanner.nextInt();

            switch (choice) { // ser till at man har 50 guld eller mer, tar dem 50 gulden från dig och ger dig 5 damage på vapnet!
                case 1:
                    if (hero.getGold() >= 50) {
                        hero.setGold((hero.getGold()) - 50);
                        hero.getEquippedWeapon().setDamage(hero.getEquippedWeapon().getDamage() + 5);
                        System.out.println("Your weapon has been upgraded with +5 damage, new damage : " + hero.getEquippedWeapon().getDamage() + "! " + "\n You now have " + hero.getGold() + " gold!");
                    } else {
                        System.out.println("Not enough gold! the upgrade costs 50 gold and you currently have " + hero.getGold() + " gold!");
                    }
                    break;
                case 2: // ser till at man har 50 guld eller mer, tar dem 50 gulden och healar till fullt
                    if (hero.getGold() >= 50) {
                        hero.setGold((hero.getGold()) - 50);
                        hero.setHealth(hero.getMaxHp());
                        System.out.println("You have fully healed yourself!" + "\n You now have " + hero.getGold() + " gold!");
                    } else {
                        System.out.println("Not enough gold! the heal costs 50 gold and you currently have " + hero.getGold() + " gold!");
                    }
                    break;

                case 3:
                    System.out.println("You currently have " + hero.getGold() + " gold!");
                case 0:
                    shopping = false;
                            break;
                default:
                    System.out.println("Please enter a valid number to use the shop!"); // om någon skriver in något som inte är 1,2,3,0
            }
        }
    }
}
