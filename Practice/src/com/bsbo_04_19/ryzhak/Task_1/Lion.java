package com.bsbo_04_19.ryzhak.Task_1;

import java.util.Scanner;

public class Lion extends Feline
{
    public Lion(Scanner input)
    {
        super(input);
    }

    @Override
    public void Voice()
    {
        System.out.println("\nRoaaaar!\n");
    }
}