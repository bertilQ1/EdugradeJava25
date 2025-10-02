package org.example.Characters;

import org.example.Menu.Helper;

public class GulDan extends Monster {
    public GulDan(){
        super("Gul'Dan", 200, 0, 0);
    }

    public void attack(Characters target) {
        int chance = Helper.randomInt(1, 100);
        int damage;

        if (chance <= 30) {
            damage = Helper.randomInt(10, 40);
            System.out.println("\n" + getName() + " uses a SPECIAL ATTACK on " + target.getName() + " and deals " + damage + " damage!");
        } else {
            damage = Helper.randomInt(3, 20);
            System.out.println("\n" + getName() + " Attacks " + target.getName() + " and deals " + damage + " damage!");
        }
        target.takeDamage(damage);
    }


    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
        if (getHealth() <= 0) {
            setHealth(0);
            System.out.println("\n" + getName() + " has died!");
        } else {
            System.out.println("\n" + getName() + " takes " + damage + " damage, their hp is now " + getHealth());
        }
    }
}
