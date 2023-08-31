package com.company.Part1;
import java.util.Scanner;

public class LargeThanOrEqualTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a number: ");
        int number = sc.nextInt();
        System.out.println("Give me second number: ");
        int number2 =sc.nextInt();

        if(number == number2)
        {
            System.out.println("The numbers are equal!");
        }
        else if(number > number2)
        {
            System.out.println("The greater number is: " + number);
        }
        else if (number < number2)
        {
            System.out.println("The greater number is: " + number2);
        }
    }
}
