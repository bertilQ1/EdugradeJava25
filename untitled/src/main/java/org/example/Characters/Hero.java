package org.example.Characters;

import org.example.Weapons.Weapon;

public class Hero extends Characters {
    private int xp;
    private int level;
    private int gold;
    private Weapon equippedWeapon;

    public int getLevel(){
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setXp (int xp){
        this.xp = xp;
    }

    public int getXp (){
        return xp;
    }

    public int getGold(){
        return gold;
    }

    public void setGold (int gold){
        this.gold = gold;
    }


    public Hero(String name, int maxHp) {
        super(name, maxHp);
        xp = 0;
        level = 1;
        gold = 0; // sätter starter guld / level / xp för heron

        equippedWeapon = new Weapon();
        equippedWeapon.setName("Excalibur");
        equippedWeapon.setDamage(10);


    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public int getAttackDamage() {
        return equippedWeapon.getDamage();
    }


    @Override
    public void attack(Characters target) {
        int damage = equippedWeapon.getDamage(); // damage = weapon damagen
        System.out.println("\n" + getName() + " Attacks " + target.getName() + " and deals " + damage + " damage!");
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
    public void gainXp(int gainedXp) {
        xp += gainedXp;
        if (xp >= 100) { // kallar på levelup funktionen
            levelUp();
        }
    }

    private void levelUp() {
        level++; // + en level
        xp -= 100; // tar bort xp'n så den inte sitter och dinglar
        int newHp = 100 + (level - 1) * 10; // hp +10 varje gång man levlar
        setHealth(newHp);
        setMaxHp(newHp);
        System.out.println("\n" + "You leveled up to " + level + "!");
        if (xp >= 100) { // om man får mer än 100 xp på en gång så säkerställer detta att man inte får 250 xp och får då lvl 2 med 150 xp t.ex
            levelUp();
        }
    }
}


