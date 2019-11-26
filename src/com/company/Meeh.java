package com.company;

public class Meeh
{

    public static void main(String[] args)
    {
        // Start and help/exit command

        print("Application has started"); // display welcome message
        print("Write any command"); // display "Write any command"
        print("Type help for commands list"); // display "Write any command"
        Commands.playerChoice(); // shortcut
    }

    public static void print(Object o)     // raccourci pour le print
    {
        System.out.println(o);
    }
}











