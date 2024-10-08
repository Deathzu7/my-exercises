package io.codeforall.bootcamp.gameobject.decor;

public enum zBarrelType {
    PLASTIC,
    WOOD,
    METAL;
    private int maxDamage = 2;

    public int getMaxDamage(){
        return maxDamage;
    }
}
