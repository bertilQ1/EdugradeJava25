package org.example.Characters;

import org.example.Menu.Helper;

public class GulDan extends Monster { // extendar monster som extendar characters
    public GulDan(){
        super("Gul'Dan", 200, 0, 0); //kallar på konstruktor.
    }

    public void attack(Characters target) {
        int chance = Helper.randomInt(1, 100); // från 1-100% chans
        int damage;

        if (chance <= 30) { // under / lika med 30% chans
            damage = Helper.randomInt(10, 40);
            System.out.println("\n" + getName() + " uses a SPECIAL ATTACK on " + target.getName() + " and deals " + damage + " damage!");
        } else { // om den rollar över 30%
            damage = Helper.randomInt(3, 20);
            System.out.println("\n" + getName() + " Attacks " + target.getName() + " and deals " + damage + " damage!");
        }
        target.takeDamage(damage); // kallar takedamage funktionen
    }


    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage); // hp - damage = nya hp
        if (getHealth() <= 0) { // om charactern dog / gick in i minus.
            setHealth(0); // sätter till 0 så det inte går att gå minus.
            System.out.println("\n" + getName() + " has died!");
        } else {
            System.out.println("\n" + getName() + " takes " + damage + " damage, their hp is now " + getHealth());
        }
    }
}
