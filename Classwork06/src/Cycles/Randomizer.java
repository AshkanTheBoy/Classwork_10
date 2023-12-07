package Cycles;

import java.util.Random;

public class Randomizer {
    public static void main(String[] args) {
        Random random = new Random(); //Java Random class vs Math.random()
        for (int i=0; i<9; i++)
            System.out.print((random.nextInt(18)+3)+" "); //[0; 9)
        System.out.println();


        for (int i=0; i<9; i++) {
            System.out.print("1th: "+(i+1));
            System.out.println((" 2nd: "+(9-i)));
        }

        for (int i=0, j=0; i<9 && j<9; i++, j+=2) {
            System.out.print("1th: "+(i+1));
            System.out.println(" 2nd: "+(j+1));
            if (j>=9) {
                break;
            }
        }

//Два шага вперед, один назад: 0,2,1,3,2,4,3,5
        for (int i=0; i<9; i+=2) {
            System.out.print(i+" ");
            if (i>0) {
                --i;
                System.out.print(i+" ");
            }
        }

    }

}
