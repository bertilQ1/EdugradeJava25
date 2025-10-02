package org.example.Characters;

public abstract class Monster extends Characters {
    private int xpReward;
    private int goldReward;

    public Monster (String name, int maxHp, int xpReward, int goldReward){
        super(name,maxHp);
        this.xpReward = xpReward;
        this.goldReward = goldReward;
    }

    public int getXpReward(){
        return xpReward;
    }

    public int getGoldReward(){
        return goldReward;
    }
}

