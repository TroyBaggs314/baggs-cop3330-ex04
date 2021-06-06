/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.util.Scanner;

class AL
{
    String noun;
    String verb;
    String adj;
    String adv;
}

public class Exercise4
{
    public static void main(String[] args)
    {
        AL al = new AL();
        al = inputs(al);
        System.out.println("Do you " + al.verb + " your " + al.adj + " " + al.noun + " " + al.adv + "?" + " That's hilarious!");

    }

    public static AL inputs(AL al)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        al.noun = sc.nextLine();
        System.out.println("Enter a verb: ");
        al.verb = sc.nextLine();
        System.out.println("Enter an adjective: ");
        al.adj = sc.nextLine();
        System.out.println("Enter an adverb: ");
        al.adv = sc.nextLine();
        return al;
    }
}
