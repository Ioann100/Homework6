package com.company;

import java.util.Scanner;

public class Task2 {
    static int val = 0;
    static int grn = 0;
    static int dolr = 0;
    static int euro = 0;
    static int rubl = 0;

    public static void main(String[] args) {

        enter();
    }

    public static void enter() {
        System.out.println("Какую сумму гривен вы хотите конвертировать?");
        Scanner scan = new Scanner(System.in);
        grn = scan.nextInt();
        System.out.println("В какую валюту вы хотите конвертировать?" + "\n 1 -доллары, 2 -евро, 3 -рубли");
        val = scan.nextInt();
        valChoice();
    }

    public static void valChoice() {
        if (val == 1) {
            getDolr();
        }
        if (val == 2) {
            getEuro();
        }
        if (val == 3) {
            getRubl();
        }

    }


    public static void getDolr() {
        dolr = grn / 28;
        System.out.println(grn + " гривен ровняется " + dolr + " долларам.");
        System.out.println("=============================================");
        enter();
    }

    public static void getEuro() {
        euro = grn / 31;
        System.out.println(grn + " гривен ровняется " + euro + " евро.");
        System.out.println("=============================================");
        enter();
    }

    public static void getRubl() {
        rubl = grn * 3;
        System.out.println((grn + " гривен ровняется " + rubl + " рублям."));
        System.out.println("=============================================");
        enter();
    }

}
