package com.codersbay;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        System.out.println(getNthFibonacci(n));

    }

    private static Integer getNthFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return getNthFibonacci(n - 1) + getNthFibonacci(n - 2);


    }

}
