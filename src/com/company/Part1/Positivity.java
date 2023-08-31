package com.company.Part1;
import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int number = sc.nextInt();

        if(number > 0){
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is negative");
        }
    }

}
