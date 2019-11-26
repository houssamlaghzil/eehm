package com.company;

public class Archetype

{

    private String name;
    private int HP;
    private int Damage;
    private int Init;

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
        return this.Damage;
    }
    public int getInit()    /** Get Initiative of the current user */

    {
        return this.Init;
    }

    public int damageTaken()    /** Get damageTaken of the current user */
    {
        return this.damageTaken();
    }








    public static String toString (String getName, int getHP ,int getDamage, int getInit)
    {
        String result = "| Name : " + getName + "| HealthPoints : " + getHP + "| Damage : " + getDamage + "| Initiative : " + getInit;    /** SHOW ALL STATS */
        return result;
    }
}
