package com.codersbay;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Bitte gib eine Zahl für die n-te Stelle der Fibonaccireihe ein!");

            if (scan.hasNextLong()) {
                System.out.println("Hier kommt die Fibonaccireihe bis zu deiner Stelle:");
                Long n = scan.nextLong();
                for (int i = 0; i < n; i++) {
                    System.out.printf("n = %d: %d \n", i, getNthFibonacci(i));

                }
            } else {
                scan.next();
                System.out.println("Falsche Eingabe!");
            }
        }
    }

    private static long getNthFibonacci(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return getNthFibonacci(n - 1) + getNthFibonacci(n - 2);


    }

}
