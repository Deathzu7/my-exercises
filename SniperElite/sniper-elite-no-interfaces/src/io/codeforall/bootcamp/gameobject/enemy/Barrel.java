package io.codeforall.bootcamp.gameobject.enemy;

import io.codeforall.bootcamp.gameobject.GameObject;
import org.w3c.dom.ls.LSOutput;

public class Barrel extends GameObject implements Destroyable {

    private BarrelType barrelType;
    private int currentDamage;
    private boolean destroyed;

    public Barrel(BarrelType barrelType) {
        this.barrelType = barrelType;
        this.destroyed = false;

        switch (barrelType) {
            case PLASTIC:
                barrelType.setMaxDamage(2);
                break;
            case WOOD:
                barrelType.setMaxDamage(3);
                break;
            case METAL:
                barrelType.setMaxDamage(4);
                break;

        }

    }

    @Override
    public String getMessage() {
        return "Barrel Type: " + barrelType;
    }

    @Override
    public void hit(int damage) {
        currentDamage += damage;

        if (currentDamage >= barrelType.getMaxDamage()) {
            destroyed = true;
            System.out.println(barrelType + " barrel destroyed!");
        }
    }

    @Override
    public boolean isDestroyed() {
        return destroyed;
    }
}

