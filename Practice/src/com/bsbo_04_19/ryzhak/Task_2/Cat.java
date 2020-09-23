package com.bsbo_04_19.ryzhak.Task_2;

import com.bsbo_04_19.ryzhak.Task_1.Feline;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Cat extends Feline
{
    static public  HashSet<Cat> catSet = new HashSet<Cat>(); // Task 4
    static public ArrayList<Cat> cats = new ArrayList<>();  // Task 3

    private Cat mom, dad;   // Task 2
    private String name;


    public Cat(Scanner input)
    {
        super(input);

        System.out.println("Cat's name:");
        name = input.nextLine();

        System.out.print("\nDo you want to add father? [y/n] ");
        switch (input.nextLine())
        {
            case "y":
                dad = new Cat(input);
                break;
            case "n":
                dad = null;
                break;
        }

        System.out.print("\nDo you want to add mother? [y/n] ");
        switch (input.nextLine())
        {
            case "y":
                mom = new Cat(input);
                break;
            case "n":
                mom = null;
                break;
        }
        cats.add(this);
    }

    @Override
    public void Voice()
    {
        System.out.println("\nMeow!\n");
    }

    public static void createCats(Scanner input)
    {
        System.out.println("Enter the amount of cats to add to the set:");
        int catAmount = input.nextInt();
        input.nextLine();
        for (int i = 0; i < catAmount; i++)
        {
            catSet.add(new Cat(input));
        }
    }

    public static void printCats()
    {
        System.out.println("Cats from the set:");
        for (Cat cat : catSet)
        {
            System.out.printf("%s ", cat.GetName());
        }
        System.out.println();
    }

    public String GetName()
    {
        return name;
    }

    public Cat GetFather()
    {
        return dad;
    }

    public Cat GetMother()
    {
        return mom;
    }
}
