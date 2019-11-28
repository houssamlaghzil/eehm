package com.company;

public class Wizard extends Archetype {

    public void hurt(int receivedDmg)    /** Get damageTaken of the current user */
    {
        receivedDmg = receivedDmg - this.Shield;


        super.hurt(receivedDmg);
    }


    private int Shield;


    public Wizard(String name, int HP, int damage, int Init, int Shield) {
        super(name, HP, damage, Init);
        this.Shield = Shield;
    }
}