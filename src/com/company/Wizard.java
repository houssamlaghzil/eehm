package com.company;

public class Wizard extends Archetype {

    public int getDamage()
    {

        this.Magic = this.Magic/2;
        int getDamage= super.getDamage() + this.Magic;

        return getDamage;

    }


    private int Magic;


    public Wizard(String name, int HP, int damage, int Init, int Magic) {
        super(name, HP, damage, Init);
        this.Magic = 2*Magic;
    }
    public int getMagic(){
        return this.Magic;
    }

    public String toString ()
    {
        String result = super.toString()+ "| magic : " + this.Magic;    /** SHOW ALL STATS */
        return result;
    }

}