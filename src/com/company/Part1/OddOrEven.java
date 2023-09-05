package com.company.Part1;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give a number: ");
        int num = sc.nextInt();

        if(num%2 == 0)
        {
            System.out.println("Number " + num + " is even.");
        }else
        {
            System.out.println("Number " + num +" is odd.");
        }
    }
}
