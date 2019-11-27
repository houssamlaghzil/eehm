package com.company;

public class Archetype
{
    private String name;
    private int HP;
    private int damage;
    private int Init;

    //private final static String Archetype ="/Users/souksou/Desktop/coding-factory/Archetype";

    public Archetype(String name , int HP , int damage , int Init){
        this.name = name;
        this.HP=HP;
        this.damage=damage;
        this.Init=Init;
    }



    public String getName()    /** Get Name of the current user */
    {
        return this.name;
    }

    public int getHP()    /** Get HealthPoints of the current user */
    {
        return this.HP;
    }

    public int getDamage()    /** Get Damage of the current user */
    {
        return this.damage;
    }
    public int getInit()    /** Get Initiative of the current user */
    {
        return this.Init;
    }

    public int damageTaken()    /** Get damageTaken of the current user */
    {
        return this.damageTaken();
    }

    public String toString ()
    {
        String result = "| Name : " + this.name + "| HealthPoints : " + this.HP + "| Damage : " + this.damage + "| Initiative : " + this.Init;    /** SHOW ALL STATS */
        return result;
    }
}