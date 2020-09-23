package com.bsbo_04_19.ryzhak.Task_1;

import java.util.Scanner;

abstract public class Feline
{
    private int age, clawsLength;

    public Feline(Scanner input)
    {
        System.out.print("Input the feline's age: ");
        age = input.nextInt();
        input.nextLine();

        System.out.print("Input the feline's claws length: ");
        clawsLength = input.nextInt();
        input.nextLine();
    }

    abstract public void Voice();

    public int GetAge()
    {
        return age;
    }

    public int GetClawsLength()
    {
        return clawsLength;
    }
}