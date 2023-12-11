import java.util.Arrays;
/*
. Дан двумерный массив. Вывести на экран:
а) все элементы второго столбца массива;
б) все элементы m-й строки массива.
 */
public class Task12_06 {
    public static void main(String[] args) {
        //12_6
        int[][] asd = new int[6][6];
        int i,j;
        for (i=0; i<asd.length; ++i) {
            asd[0][i] = i;
            for (j=0; j<asd[0].length; ++j) {
                asd[i][j] = i;
            }
            System.out.println(Arrays.toString(asd[i]));
        }
    }
}