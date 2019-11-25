import java.util.Scanner;

public class Meeh
{

    public static void main(String[] args)
    {
        //modification

        print("Application has started");

        print("if you need help type help");
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();

        while (!command.equals("exit"))
        {
            if (command.equals("help"))

            {
                DisplayHelp.displayHelp();
            }

            else if (!command.equals("help"))

            {
                    print("if you need help type help");
            }

            command = sc.nextLine();

        }

        print("see you again");





    }
    public static void print(Object o)     // raccourci pour le print
    {
        System.out.println(o);
    }
}











