package com.company;

import java.util.Scanner;

public class Commands

{
    public final static String CMDcreate = "1";
    public final static String CMDdelete = "2";
    public final static String CMD = "3";
    public final static String CMD2 = "4";
    public final static String CMDexit = "5";




    public static void playerChoice() // creation playerChoice method

    {
        boolean A=true;
        Scanner sc = new Scanner(System.in); // scan playerchoice

        while(A==true)
        {
            String commands = sc.nextLine(); // return playerchoice

            if (commands.equals("help")) {
                commands = "3";
            }

            switch (commands) {

                case CMDcreate: {
                    Commands.create();
                }
                case CMDdelete: {
                    Commands.delete();
                }
                case CMD: {
                    Commands.displayHelp();
                }
                case CMDexit: {
                    Commands.exit(A);
                }
            }
        }
    }

        /*String command = sc.nextLine(); // return playerchoice

        while (!command.equals("exit")) // if player write exit --> exit app
        {
            if (command.equals("help")) // if player write help --> display help commands

            {
                Commands.displayHelp(); // return class display with displayhelp method
            }

            else

            {
                print("if you need help type help"); // display help message
            }

            command = sc.nextLine();

        }
        */
        //print("see you again"); // display "see you again"
        //return command; // return command for main class


    public static void displayHelp() // creation displayHelp method

    {
        // add help command list
        print("|------------ MENU ------------|");
        print("|         1 - Create           |");
        print("|         2 - Delete           |");
        print("|         3 - ....             |");
        print("|         4 - ....             |");
        print("|         5 - exit             |");
        print("|------------------------------|");

    }

    public static String create() // creation create method

    {
        Scanner sc = new Scanner(System.in);
        String Pseudo = sc.nextLine(); // return playerchoice

        if (Pseudo.equals("create")) // if player write help --> display help commands
        {
            print("Entrez votre Pseudo");
            String pseudo = sc.nextLine();
            String resultat = pseudo;
            //print ("Votre Pseudo est" + resultat);
        }

        return Pseudo;

    }

    public static void delete() // creation delete method

    {

    }

    public static boolean exit(boolean A) // creation exit method

    {
        //while (!command.equals("exit")) // if player write exit --> exit app
        print("see you again"); // display "see you again"
        return A =false;
    }



    public static void print(Object o)     // raccourci pour le print
    {
        System.out.println(o);
    }

}
