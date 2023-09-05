package com.company.Part2;

import java.util.Scanner;

public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int negNum = 0;

        while (true)
        {
            System.out.println("Give a number: ");
            int num = scan.nextInt();;

            if (num < 0)
            {
                negNum++;
                continue;
            }
            if (num == 0)
            {
                break;
            }

        }
        System.out.println("Number of negative numbers: " + negNum);
    }
}
