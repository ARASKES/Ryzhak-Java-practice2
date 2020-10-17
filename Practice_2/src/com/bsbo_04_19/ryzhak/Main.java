package com.bsbo_04_19.ryzhak;

import com.bsbo_04_19.ryzhak.Task_1.*;
import com.bsbo_04_19.ryzhak.Task_2.Cat;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        while (true)
        {
            Scanner input = new Scanner(System.in);

            CallUI();

            switch (input.nextLine())
            {
                case "1":
                    Lion lion = new Lion(input);
                    System.out.printf("Age: %d\tClaws length: %d", lion.GetAge(), lion.GetClawsLength());
                    lion.Voice();
                    break;
                case "2":
                    try
                    {
                        Cat daughterCat = new Cat(input),
                            sonCat = new Cat(input),
                            motherCat = daughterCat.GetMother(),
                            fatherCat = daughterCat.GetFather(),
                            grannyCat = motherCat.GetMother(),
                            grandpaCat = fatherCat.GetFather();

                        System.out.printf("Son's name: %s\n", sonCat.GetName());
                        System.out.printf("Daughter's name: %s\n", daughterCat.GetName());
                        System.out.printf("Mother's name: %s\n", motherCat.GetName());
                        System.out.printf("Father's name: %s\n", fatherCat.GetName());
                        System.out.printf("Granny's name: %s\n", grannyCat.GetName());
                        System.out.printf("Grandpa's name: %s\n", grandpaCat.GetName());
                    }
                    catch (NullPointerException e)
                    {
                        System.out.print("Needed parent is absent!");
                    }
                    break;
                case "3":
                    for (int i = 0; i < 10; i++)
                    {
                        new Cat(input);
                    }

                    Cat.printCatsFromList();

                    Cat.cats.clear();
                    break;
                case "4":
                    Cat.createCats(input);

                    Cat catToRemove = null;
                    int number = 1;
                    for (Cat cat : Cat.catSet)
                    {
                        if (number == Cat.catSet.size())
                        {
                            catToRemove = cat;
                        }
                        number++;
                    }
                    Cat.catSet.remove(catToRemove);

                    Cat.printCatsFromHashSet();

                    Cat.catSet.clear();
                    break;
                case "exit":
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input received! Try again");
                    break;
            }

            WaitKey();
        }
    }

    static void CallUI()
    {
        System.out.println("\nChoose the task to execute:\n");
        for (int i = 0; i < 4; i++)
        {
            System.out.printf("%d. Task %d\n", i + 1, i + 1);
        }
        System.out.print("\t\t\texit - close the program\n> ");
    }

    static void WaitKey() throws IOException
    {
        System.out.println("\nPress Enter to continue...");
        System.in.read();
        System.out.println();
    }
}