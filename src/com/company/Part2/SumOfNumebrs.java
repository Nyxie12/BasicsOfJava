package com.company.Part2;

import java.util.Scanner;

public class SumOfNumebrs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;

        while (true)
        {
            System.out.println("Give a number");
            int num = scan.nextInt();


            if(num == 0)
            {
                break;
            }

            total += num;
        }
        System.out.println("Sum of the numbers: " + total);

    }
}
