package com.company;

import java.util.Scanner;

public class Meeh

{



    public static void main(String[] args)
    {

        /* Starter Menu with starter phrase */

        print("|------------ MENU ------------|");
        print("|         1 - Create           |");
        print("|         2 - Delete           |");
        print("|         3 - ....             |");
        print("|         4 - Help             |");
        print("|         5 - exit             |");
        print("|------------------------------|");

        print("Application has started");              /* display Welcome message */
        print("Write any command");                    /* display "Write any command" */
        print("Type help for command description");    /* display "Type help for command description" */
        Commands.playerChoice();                       /* shortcut */

    }

    public static void print (Object o)     /* print shortcut method */
    {
        System.out.println(o);
    }
}










