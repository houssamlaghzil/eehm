package com.company;

import java.util.Scanner;

public class Meeh {

    public static void main(String[] args)
    {
        // Start and help/exit command

        print("|------------ MENU ------------|");
        print("|         1 - Create           |");
        print("|         2 - Delete           |");
        print("|         3 - ....             |");
        print("|         4 - Help             |");
        print("|         5 - exit             |");
        print("|------------------------------|");

        print("Application has started"); // display welcome message
        print("Write any command"); // display "Write any command"
        print("Type help for command description"); // display "Write any command"
        Commands.playerChoice(); // shortcut

    }

    public static void print (Object o)     // raccourci pour le print
    {
        System.out.println(o);
    }
}










