package org.example.Characters;

import org.example.Helper;

public class Wither extends Monster implements Helper {
    public Wither() {
        super("Wither", 30, 50, 25);
    }
    @Override
    public void attack(Characters target) {
        int damage = (Helper.randomInt(5, 20));
        System.out.println(getName() + " Attacks " + target.getName() + " and deals " + damage + " damage!");
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

