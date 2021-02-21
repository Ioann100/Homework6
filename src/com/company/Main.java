package com.company;

import java.util.Scanner;
//Task1
public class Main {
    public static int minSum = 100;
    public static int creditAmount = 1000;
    public static int minus = 0;
    public static void main(String[] args) {

        System.out.println("Сумма вашего кредита: " + creditAmount);
        System.out.println("Какую сумму вы хотите внести?");
        getSum();
       creditComputation();

    }

    public static int getSum() {
        int minSum = 100;
        Scanner scan = new Scanner(System.in);
        int depositMoney = scan.nextInt();
        if (depositMoney < minSum) {
            System.out.println("Миннимальная сумма платежа должна составлять " + minSum + "грн.");
            return getSum();
        } else {
minus = depositMoney;
creditAmount = creditAmount - minus;
            creditComputation();
           return getSum();

               }

    }


    public static void creditComputation(){
        System.out.println("Остаток кредита " + creditAmount);
       System.out.println("Сумма переплаты " + (minus - minSum));
       if (creditAmount == 0){
           System.out.println("Вы погасили кредит!!!");

       }
       else if (creditAmount < 0){
           System.out.println("Остаток отправлени вам на карту.");
       }
else System.out.println("Хотите внести еще?");
    }

}