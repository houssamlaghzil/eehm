package com.company;

public class Archetype
{
    private String name;
    private int HP;
    private int damage;
    private int Init;


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

    public void hurt(int receivedDmg)    /** Get damageTaken of the current user */
    {
        if (receivedDmg < 0)
        {
            receivedDmg = 0;
        }
        this.HP = this.HP - receivedDmg;
    }

    public String toString ()
    {
        String result = "| Name : " + this.name + "| HealthPoints : " + this.HP + "| Damage : " + this.damage + "| Initiative : " + this.Init;    /** SHOW ALL STATS */
        return result;
    }
}