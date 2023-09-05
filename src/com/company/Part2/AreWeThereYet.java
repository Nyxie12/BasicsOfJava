package com.company.Part2;
import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true)
        {
            System.out.println("Give me a number");
            int num = scan.nextInt();

            if(num == 4)
            {
                break;
            }
        }
    }
}
