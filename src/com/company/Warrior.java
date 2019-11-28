package com.company;

public class Warrior extends Archetype {

    public void hurt(int receivedDmg)    /** Get damageTaken of the current user */
    {
        receivedDmg = receivedDmg-this.Shield;


        super.hurt(receivedDmg);
    }


    private int Shield;


    public Warrior(String name , int HP , int damage , int Init, int Shield)
    {
        super(name, HP, damage, Init);
        this.Shield=Shield;
    }










}


