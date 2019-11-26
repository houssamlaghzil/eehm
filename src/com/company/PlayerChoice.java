package com.company;

import java.util.Scanner;

public class PlayerChoice
{
    public static String playerChoice() // creation playerChoice method
    {
        Scanner sc = new Scanner(System.in); // scan playerchoice
        String command = sc.nextLine(); // return playerchoice

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

        print("see you again"); // display "see you again"
        return command; // return command for main class
    }



    public static void print(Object o)     // raccourci pour le print
    {
        System.out.println(o);
    }
}
