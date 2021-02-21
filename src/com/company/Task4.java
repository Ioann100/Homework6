package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static int mas[] = {10, 3, 7, 9, 0, 4, 2, 8, 1, 5};
    static int remain = 0;
    static boolean flag = true;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mas));
        while (flag) {

            flag = false;

            for (int j = 0; j < mas.length - 1; j++) {
                remain = 0;

                if (mas[j] >= mas[j + 1]) {
                    remain = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = remain;
                    flag = true;
                    j = 0 - 1;
                }


                //     System.out.println(Arrays.toString(mas));
            }


        }
        System.out.println(Arrays.toString(mas));
    }
}

