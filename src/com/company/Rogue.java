package com.company;

import java.util.Random;

public class Rogue extends Archetype {

    private int Dodge;
    private int Critic;
    private boolean toto = false;

    public int getDamage() {
        Random rand = new Random();
        if (rand.nextInt(100) <= Critic) {
            if (!toto){
                toto = true;
                return super.getDamage() * 2;
            } else{
                toto= false;
                return super.getDamage();
            }
        } else {
            toto=false;
            return super.getDamage();
        }


    }

    public void hurt(int receivedDmg){
        Random rando = new Random();
        if (rando.nextInt(100) <= Dodge) {
            receivedDmg = 0;
            super.hurt(receivedDmg);
        } else{
            super.hurt(receivedDmg);
        }


    }



    public Rogue(String name, int HP, int damage, int Init, int Dodge,int Critic) {
        super(name, HP, damage, Init);
        this.Dodge=Dodge;
        this.Critic=Critic;
    }
    public int getDodge(){
        return this.Dodge;
    }
    public int getCritic(){
        return this.Critic;
    }
}
