/*
UCF COP3330 Fall 2021 Assignment 2 Solution
Copyright 2021 Reese Stowell
*/
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        String input;
        System.out.print("What is the input string?");
        input = user_input.next();
        int stringLength = input.length();
        System.out.println(String.format("%s has %d characters",input,stringLength));
    }
}
