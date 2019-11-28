package com.company;

import java.util.List;
import java.util.Scanner;

public class Commands
{
    public static String CMDfight = "0";
    public static String CMDcreate = "1";
    public static String CMDdelete = "2";
    public static String CMDstatsheroes= "3";
    public static String CMDhelp = "4";
    public static String CMDexit = "5";
    public static String CMDheroesid = "6";


    public static void playerChoice(List heroes) // creation playerChoice method
    {
        Scanner sc = new Scanner(System.in); // scan playerchoice
        String commands = sc.nextLine(); // return playerchoice

        while (!commands.equals("5")) {
            if (commands.equals("1")) {


                System.out.println("What did u want");
                System.out.println("O= Default 1= Warrior  2=Wizard  3=Rogue");
                commands = sc.nextLine();
                if(commands.equals("1")){
                    Commands.createwarrior(heroes);
                }
                else if (commands.equals("0")){
                    Commands.create(heroes);

                }
                else if (commands.equals("2")){
                    Commands.createWizard(heroes);
                }
            } else if (commands.equals("0")) {
                Commands.fight(heroes);
            } else if (commands.equals("2")) {
                Commands.delete();
            } else if (commands.equals("3")) {
                Commands.statsHeroes(heroes);
            } else if (commands.equals("6")) {
                Commands.heroesList(heroes);
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
        print("| 0 - Starting Fight           |");
        print("|   1 - Add new character      |");
        print("|     2 - Delete a character   |");
        print("|       3 - Show heroes stats  |");
        print("|     4 - Display commands     |");
        print("|   5 - Leave the game         |");
        print("| 6 - Show all heroes ID       |");
        print("|------------------------------|");

    }



    public static void fight(List<Archetype> myfight) // creation fight method
    {
        Scanner id = new Scanner(System.in);
        print("Choose the ID of the first Heroes");
        int firstheroes = id.nextInt(); // return ID first heroes
        Archetype char1 =  myfight.get(firstheroes);

        Scanner id2 = new Scanner(System.in);
        print("Choose the ID of the second Heroes");
        int secondheroes = id2.nextInt(); // return ID second heroes
        Archetype char2 = myfight.get(secondheroes);

        while (char1.getHP() > 0 && char2.getHP() > 0)
        {
            if(char1.getInit() > char2.getInit())
            {
                char2.hurt(char1.getDamage());
                print ( "\n Attaquant : " + char1.getName() );
                print ( " Dégats infligés " + char1.getDamage());
                print ( "\n Défenseur : " + char2.getName() );
                print ( " Points de vie actuelle : " + char2.getHP());

                if (char1.getHP() > 0 && char2.getHP() > 0)
                {
                    char1.hurt(char2.getDamage());

                    print ( "\n Attaquant : " + char2.getName() );
                    print ( " Dégats infligés " + char2.getDamage());
                    print ( "\n Nickname : " + char1.getName());
                    print ( " Points de vie actuelle : " + char1.getHP());
                }
                else
                {
                   break;
                }
            }
            else
            {
                char1.hurt(char2.getDamage());

                print ( " Attaquant : " + char2.getName() );
                print ( " Dégats infligés " + char2.getDamage());
                print( " Nickname : " + char1.getName() );
                print (" Points de vie actuelle : " + char1.getHP());

                if (char1.getHP() > 0 && char2.getHP() > 0)
                {
                    char2.hurt(char1.getDamage());

                    print ( "\n Attaquant : " + char1.getName() );
                    print ( " Dégats infligés " + char1.getDamage());
                    print ( " Nickname : " + char2.getName());
                    print ( " Points de vie actuelle : " + char2.getHP());
                }

               else
                {
                    break;
                }
            }

        }
        print("Fight is finish because one of the two heroes died");
    }



    public static void create(List<Archetype> heroes) // creation create method
        {
        print("Nickname");
        Scanner sc1 = new Scanner(System.in);
        String nameUser = sc1.nextLine(); // return Nickname

        print("HealthPoints");
        Scanner sc2= new Scanner(System.in);
        int hpUser = sc2.nextInt(); // return HealthPoints

        print("Damage");
        Scanner sc3 = new Scanner(System.in);
        int damageUser = sc3.nextInt(); // return Damage

        print("Init");
        Scanner sc4 = new Scanner(System.in);
        int initUser = sc4.nextInt(); // return Init

        print("Nickname : " + nameUser);
        print("HealthPoints : " + hpUser);
        print("Damage : " + damageUser);
        print("Init : " + initUser);

        Archetype char1 = new Archetype(nameUser, hpUser , damageUser , initUser);
        heroes.add(char1);


    }

    public static void statsHeroes(List <Archetype> myHeroList) // creation statsHeroes method
    {
        Scanner sc1 = new Scanner(System.in);
        print("Choissisez l'ID de votre combattant");
        int statsmyheroes = sc1.nextInt(); // return Nickname

        if (statsmyheroes >= myHeroList.size() || statsmyheroes < 0){
            print ("This heroes does not exist");
            statsmyheroes = sc1.nextInt(); // return Nickname
        }
        Archetype myChar = myHeroList.get(statsmyheroes);
        print(myChar);

    }



    public static void heroesList(List <Archetype> myList) // creation heroes method
    {
        for ( int i = 0; i < myList.size(); i++)
        {
            Archetype char1 = (Archetype) myList.get(i);
            print("id : " + i + char1);
        }
        if (myList.size() == 0){

            print("Any character created :");
    }


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

    public static void createwarrior(List<Warrior> heroes) // creation create method
    {
        print("Nickname");
        Scanner sc1 = new Scanner(System.in);
        String nameUser = sc1.nextLine(); // return Nickname

        print("HealthPoints");
        Scanner sc2= new Scanner(System.in);
        int hpUser = sc2.nextInt(); // return HealthPoints

        print("Damage");
        Scanner sc3 = new Scanner(System.in);
        int damageUser = sc3.nextInt(); // return Damage

        print("Init");
        Scanner sc4 = new Scanner(System.in);
        int initUser = sc4.nextInt(); // return Init

        print("Shield");
        Scanner sc5 = new Scanner(System.in);
        int Shield = sc5.nextInt(); // return Init

        print("Nickname : " + nameUser);
        print("HealthPoints : " + hpUser);
        print("Damage : " + damageUser);
        print("Init : " + initUser);
        print("Shield : " + Shield);

        Warrior char1 = new Warrior(nameUser, hpUser , damageUser , initUser,Shield);
        heroes.add(char1);


    }

    public static void createWizard(List<Wizard> heroes) //
    {
        print("Nickname");
        Scanner sc1 = new Scanner(System.in);
        String nameUser = sc1.nextLine(); // return Nickname

        print("HealthPoints");
        Scanner sc2 = new Scanner(System.in);
        int hpUser = sc2.nextInt(); // return HealthPoints

        print("Damage");
        Scanner sc3 = new Scanner(System.in);
        int damageUser = sc3.nextInt(); // return Damage

        print("Init");
        Scanner sc4 = new Scanner(System.in);
        int initUser = sc4.nextInt(); // return Init

        print("Magic damage");
        Scanner sc5 = new Scanner(System.in);
        int Magic = sc5.nextInt(); // return Init

        print("Nickname : " + nameUser);
        print("HealthPoints : " + hpUser);
        print("Damage : " + damageUser);
        print("Init : " + initUser);
        print("Magic Dammage : " + Magic);

        Wizard char1 = new Wizard(nameUser, hpUser, damageUser, initUser, Magic);
        heroes.add(char1);
    }

}
