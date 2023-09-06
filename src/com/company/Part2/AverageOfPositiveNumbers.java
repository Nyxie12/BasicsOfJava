package com.company.Part2;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int numOfNum = 0;

        while (true)
        {
            int num = scan.nextInt();
            if(num > 0)
            {
                numOfNum++;
                total += num;
            }
            if (num == 0)
            {
                break;
            }
        }
        if (total <= 0)
        {
            System.out.println("Cannot calculate average");
        }

        double average = (double) total/numOfNum;
        System.out.println(average);
    }
}
