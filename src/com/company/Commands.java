package com.company;

import java.util.Scanner;

public class Commands
{
    public static String CMDcreate = "1";
    public static String CMDdelete = "2";
    public static String CMD = "3";
    public static String CMDhelp = "4";
    public static String CMDexit = "5";

    public static void playerChoice() // creation playerChoice method
    {
        Scanner sc = new Scanner(System.in); // scan playerchoice
        String commands = sc.nextLine(); // return playerchoice

        while (!commands.equals("5")) {
            if (commands.equals("1")) {
                Commands.create();
            } else if (commands.equals("2")) {
                Commands.delete();
            } else if (commands.equals("4")) {
                Commands.displayHelp();
            } else {
                print("try again");
                Commands.displayHelp();
            }
            commands = sc.nextLine();
        }
        print("Bye !");

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
        // add description command
        print("|------------ HELP ------------|");
        print("| 1 - Create a new character   |");
        print("|   2 - Delete a character     |");
        print("|     3 - ....                 |");
        print("|   4 - Display commands       |");
        print("| 5 - Leave the game           |");
        print("|------------------------------|");

    }

    public static void create() // creation create method
    {
        print("Nickname");
        Scanner sc1 = new Scanner(System.in);
        String nameUser = sc1.nextLine(); // return Nickname

        print("HealthPoints");
        Scanner sc2= new Scanner(System.in);
        String hpUser = sc2.nextLine(); // return HealthPoints

        print("Damage");
        Scanner sc3 = new Scanner(System.in);
        String damageUser = sc3.nextLine(); // return Damage

        print("Init");
        Scanner sc4 = new Scanner(System.in);
        String initUser = sc4.nextLine(); // return Init

        print("Nickname : " + nameUser);
        print("HealthPoints : " + hpUser);
        print("Damage : " + damageUser);
        print("Init : " + initUser);


    }

    public static void delete() // creation delete method

    {

    }

    public static void exit() // creation exit method

    {
        //while (!command.equals("exit")) // if player write exit --> exit app
        print("see you again"); // display "see you again"
    }



    public static void print(Object o)     // raccourci pour le print
    {
        System.out.println(o);
    }

}
