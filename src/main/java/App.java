/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.io.Console;
public class App
{
    public static void main (String[] args)
    {
        Console con = System.console();
        String first = con.readLine("What is the first number? ");
        String second = con.readLine("What is the second number? ");
        int num1 = Integer.parseInt(first);
        int num2 = Integer.parseInt(second);
        int sum = num1 + num2;
        int dif = num1 - num2;
        int prod = num1 * num2;
        int quot = num1 / num2;
        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n ",
                num1, num2, sum,  num1, num2, dif , num1, num2, prod, num1, num2, quot);
    }
}
