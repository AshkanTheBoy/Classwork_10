package Cycles;

import java.util.Scanner;

/*
//Вводить натуральные числа с клавиатуры.
Признаком окончания ввода будет число -1
 */
public class WhileNotNegative1 {
    public static void main(String[] args) {
        solve1();
        solve2();
    }
    private static void solve1(){
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        while (n>0) {
            System.out.println("Введите целое число: ");
            n = scanner.nextInt();
        }
    }
    private static void solve2(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите целое число: ");
            n = scanner.nextInt();
        }
        while (n>0);
    }
}
