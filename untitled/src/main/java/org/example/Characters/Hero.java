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
        gold = 0;

        equippedWeapon = new Weapon();
        equippedWeapon.setName("Excalibur");
        equippedWeapon.setDamage(10);


    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    @Override
    public void attack(Characters target) {
        int damage = equippedWeapon.getDamage();
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
    public void gainXp(int gainedXp) {
        xp += gainedXp;
        if (xp >= 100) {
            levelUp();

        }
    }

    private void levelUp() {
        level++;
        xp -= 100;
        int newHp = 100 + (level - 1) * 10;
        setHealth(newHp);
        setMaxHp(newHp);
        System.out.println("You leveled up to " + level + "!");
        if (xp >= 100) {
            levelUp();
        }
    }
}


