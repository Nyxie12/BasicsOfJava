package com.company.Part2;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for (int i=0; i<num+1; i++)
        {
            System.out.println(i);
        }
    }
}
