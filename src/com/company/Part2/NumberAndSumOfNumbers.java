package com.company.Part2;

import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int numOfNum = 0;

        while (true)
        {
            System.out.println("Give a number: ");
            int num = scan.nextInt();;

            if (num == 0)
            {
                break;
            }
            numOfNum++;
            sum += num;

        }

        System.out.println("Number of numbers: " + numOfNum);
        System.out.println("Sum of the numbers: " + sum);

    }
}
