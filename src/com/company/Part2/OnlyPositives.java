package com.company.Part2;
import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true)
        {
            System.out.println("Give a number: ");
            int num = scan.nextInt();

            if(num > 0)
            {
                System.out.println(num*num);
                continue;
            }
            else if(num < 0)
            {
                System.out.println("Unsuitable number");
                continue;
            }
            else
            {
                break;
            }
        }
    }
}
