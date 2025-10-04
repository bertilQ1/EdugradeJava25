package org.example.Weapons;

public class Weapon {
    private String name;
    private int damage;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
 // setters getters för damage och vapen namnet
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getDamage(){
        return damage;
    }
}
