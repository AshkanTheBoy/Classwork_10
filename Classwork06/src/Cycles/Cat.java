package Cycles;

import java.util.Random;

/*
//Кот перемещается короткими бросками (по 5-7 шагов) по лесной тропинке.
//За сколько перебежек он преодолеет расстояние в 50 шагов?
 */
public class Cat {
    public static void main(String[] args) {
        Random random = new Random();
        int length = 0;
        int step = random.nextInt(2)+5;
        int counter = 0;
        while (length<50) {
            length+=step;
            step = random.nextInt(2)+5;
            counter++;
            System.out.println(counter+" "+length);
        }
    }
}
