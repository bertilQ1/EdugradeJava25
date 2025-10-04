package org.example.Characters;

import org.example.Menu.Helper;

public class LichKing extends Monster {
    public LichKing() {
        super("Lich King", 100, 150, 100);
    }
    @Override
    public void attack(Characters target) {
        int chance = Helper.randomInt(1, 100);
        int damage;

        if (chance <= 30) {
            damage = Helper.randomInt(5, 30); // 5-30 dmg på 30% chans att hända
            System.out.println("\n" + getName() + " uses a SPECIAL ATTACK on " + target.getName() + " and deals " + damage + " damage!");
        } else {
            damage = Helper.randomInt(3, 15); // 70% chans att få normal attacken som rollar 3-15
            System.out.println("\n" + getName() + " Attacks " + target.getName() + " and deals " + damage + " damage!");
        }
        target.takeDamage(damage);
    }


    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
        if (getHealth() <= 0) {
            setHealth(0);
            System.out.println(getName() + " has died!");
        } else {
            System.out.println("\n" + getName() + " takes " + damage + " damage, their hp is now " + getHealth());
        }
    }
}
