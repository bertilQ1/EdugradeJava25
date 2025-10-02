package org.example.Characters;

abstract class Characters {
    private String name;
    private int health;
    private int maxHp;

    public Characters(String name, int maxHp) {
        this.name = name;
        this.maxHp = maxHp;
        this.health = maxHp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }


    public abstract void takeDamage(int damage);

    public abstract void attack(Characters target);
}
