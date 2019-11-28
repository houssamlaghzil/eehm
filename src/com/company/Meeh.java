package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

public class Meeh

{

    public static void main(String[] args)
    {

        List<Archetype> heroes= new ArrayList();

        //String nameUser = "test";
        //Archetype a = new Archetype( nameUser ,  0 ,  0 ,  0);
        //System.out.println(a);



        /** Starter Menu with starter phrase */


        print("|------------ MENU ------------|");
        print("|         0 - FIGHT !          |");
        print("|         1 - Create           |");
        print("|         2 - Delete           |");
        print("|         3 - stats            |");
        print("|         4 - Help             |");
        print("|         5 - exit             |");
        print("|         6 - heroes           |");
        print("|------------------------------|");

        print("Application has started");              /** display Welcome message */
        print("Write any command");                    /** display "Write any command" */
        print("Type help for command description");    /** display "Type help for command description" */
        Commands.playerChoice(heroes);                       /** shortcut */

    }

    public static void print (Object o)     /** print shortcut method */
    {
        System.out.println(o);
    }
}