package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 hudson millar
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "Enter the principal" );
        int p = scan.nextInt();

        System.out.println( "Enter the rate" );
        double r = 0.01*scan.nextFloat();

        System.out.println( "Enter the num of years" );
        int t = scan.nextInt();

        System.out.println( "Enter the num of times per year its compounded" );
        int n = scan.nextInt();

        double a = p*Math.pow((1+r/n),(n*t));
        System.out.println("The investment will be worth "+String.format("%.2f", a));
    }
}
