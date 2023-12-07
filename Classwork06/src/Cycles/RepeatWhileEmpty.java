package Cycles;

import java.util.Scanner;

/*
//Пользователь вводит имя, и, если оно пусто, то производится повторный ввод
 */
public class RepeatWhileEmpty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("Введите имя: ");
            name = scanner.nextLine();
        }
        while (name.length()==0);

    }


}
