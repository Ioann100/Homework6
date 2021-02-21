package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static Scanner scan = new Scanner(System.in);
    public static int number;
    public static int[] masiv = new int[10];
    static boolean flag = false;


    public static void main(String[] args) {
        System.out.println("Введите число для поиска от 1 до 20.");
        number = scan.nextInt();
        Random ran = new Random();
        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = ran.nextInt(20);
        }
        flag = false;
        check();
        System.out.println(Arrays.toString(masiv));
    }

    public static void check() {

        for (int i = 0; i < masiv.length; i++) {

            if (masiv[i] == number) {
                flag = true;
                break;

            }
            flag = false;
            //  System.out.println(flag);


        }
        if (flag = false)System.out.println("В миссиве нет даного число.");
        if (flag = true) System.out.println("Миссив содержит это число.");

    }

}