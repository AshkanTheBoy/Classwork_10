package Cycles;

import java.util.Scanner;

public class Task5_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс рубля к доллару: ");
        double toByn = scanner.nextDouble();
        for (int i=0; i<20; i++) {
            System.out.printf("%d USD = %.2f BYN%n",i,i*toByn);
        }
    }
}
