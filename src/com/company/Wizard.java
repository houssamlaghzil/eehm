package com.company;

public class Wizard extends Archetype {

    public int getDamage()
    {
        int getDamage= super.getDamage() + this.Magic;
        this.Magic = this.Magic/2;
        return getDamage;

    }


    private int Magic;


    public Wizard(String name, int HP, int damage, int Init, int Magic) {
        super(name, HP, damage, Init);
        this.Magic = Magic;
    }
    public int getMagic(){
        return this.Magic;
    }

}