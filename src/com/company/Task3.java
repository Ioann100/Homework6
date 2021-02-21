package com.company;

import java.util.Scanner;

public class Task3 {
    static int number = 0;

    public static void main(String[] args) {
        System.out.println("Введите число для проверки.");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        posOrNeg();
        simpleNum();
        divisiOrNot();
    }

    public static void posOrNeg() {
        if (number > 0) {
            System.out.println("Это положительно число.");
        } else System.out.println("Это отрицательно число.");
    }

    public static void simpleNum() {
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            temp = number % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Это простое число.");
        } else {
            System.out.println("Это составное число.");
        }
    }

    public static void divisiOrNot() {
        for (int i = 2; i < 10 ; i++) {
            if (i == 4 ) i++;
            if (i == 7) i = i + 2;
if (number % i == 0) System.out.println("Число "+number + " делится на " + i +" без остатка.");
else System.out.println("Число "+number + " не делится на " + i +" без остатка.");
        }

    }
}
