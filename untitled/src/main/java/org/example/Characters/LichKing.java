package org.example.Characters;

import org.example.Helper;

public class LichKing extends Monster {
    public LichKing() {
        super("Lich King", 200, 150, 100);
    }
    @Override
    public void attack(Characters target) {
        int chance = Helper.randomInt(1, 100);
        int damage;

        if (chance <= 30) {
            damage = Helper.randomInt(10, 40);
            System.out.println(getName() + " uses a SPECIAL ATTACK on " + target.getName() + " and deals " + damage + " damage!");
        } else {
            damage = Helper.randomInt(5, 20);
            System.out.println(getName() + " Attacks " + target.getName() + " and deals " + damage + " damage!");
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
            System.out.println(getName() + " takes " + damage + " damage, their hp is now " + getHealth());
        }
    }
}
