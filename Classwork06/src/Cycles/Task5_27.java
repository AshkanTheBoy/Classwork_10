package Cycles;
/*
г) сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры;
b a).
 */

import java.util.Scanner;

public class Task5_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а: ");
        int a = scanner.nextInt();
        System.out.println("Введите число б: ");
        int b = scanner.nextInt();
        int sum = 0;

        for (int i = a; i<=b; i++) {
            System.out.println(sum+=i);
        }
    }
}
