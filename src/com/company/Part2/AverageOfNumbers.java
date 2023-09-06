package com.company.Part2;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int numOfNum = 0;

        while (true)
        {
            System.out.println("Give a number: ");
            int num = scan.nextInt();

            if (num == 0)
            {
                break;
            }
            total += num;
            numOfNum++;
        }
        double average = (double) total /numOfNum;
        System.out.println("Average of the numbers: " + average);

    }
}
