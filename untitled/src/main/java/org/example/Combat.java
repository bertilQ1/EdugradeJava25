package org.example;

import org.example.Characters.*;

public class Combat {
    private Hero hero;
    private Monster monster;

    public Combat(Hero hero, Monster monster) {
        this.hero = hero;
        this.monster = monster;
    }

    public void startBattle() {
        System.out.println("\n" + hero.getName() + " runs into a " + monster.getName() + ", fight!");

        while (hero.getHealth() > 0 && monster.getHealth() > 0) {
            hero.attack(monster);
            if (monster.getHealth() <= 0) {
                break;
            }
            monster.attack(hero);
            if (hero.getHealth() <= 0) {
                break;
            }
        }
        if (hero.getHealth() > 0) {
            System.out.println("\n" + hero.getName() + " has killed " + monster.getName() + " and gained " + monster.getXpReward() + " XP and " + monster.getGoldReward() + " gold!");
            hero.setGold(hero.getGold() + monster.getGoldReward());
            hero.gainXp(monster.getXpReward());
        }
    }
}

