package com.bsbo_04_19.ryzhak.Task_1;

import java.util.Scanner;

public class Tiger extends Feline
{
    public Tiger(Scanner input)
    {
        super(input);
    }

    @Override
    public void Voice()
    {
        System.out.println("\nRyyyyyyyyrrrrrrr!\n");
    }
}