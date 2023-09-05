package com.company.Part2;

import java.util.Scanner;

public class NumbersOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfNum = 0;

        while (true)
        {
            System.out.println("Give  a number");
            int num = scan.nextInt();

            if(num != 0)
            {
                numOfNum++;
                continue;
            }
            else
            {
                break;
            }
        }
        System.out.println("Number of numbers: " +numOfNum);
    }
}
