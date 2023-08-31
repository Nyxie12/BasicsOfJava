package com.company.Part1;
import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give speed: ");
        int speed = scan.nextInt();

        if (speed>120)
        {
            System.out.println("Speeding ticket!");
        }
    }
}
