package com.bsbo_04_19.ryzhak.Task_1;

import java.util.Scanner;

public class Cheetah extends Feline
{
    public Cheetah(Scanner input)
    {
        super(input);
    }

    @Override
    public void Voice()
    {
        System.out.println("\nReeeeeeeeer!\n");
    }
}