package com.company;

import com.company.PlayerChoice;

public class Meeh
{

    public static void main(String[] args)
    {
        // Start and help/exit command

        print("Application has started"); // display welcome message
        print("Write any command"); // display "Write any command"
        String command = PlayerChoice.playerChoice(); // shortcut
    }

    public static void print(Object o)     // raccourci pour le print
    {
        System.out.println(o);
    }
}











