package com.company.Part2;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(Math.sqrt(num) + Math.sqrt(num2));
    }


}
