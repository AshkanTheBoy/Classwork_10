public class Task_01b {
    /*
Для трех чисел известна их четность. Определить, будет ли сумма четной.
y = A'B'C + A'BC' + AB'C' + ABC
 */
    public static void main(String[] args) {
        int a = 6, b = 4, c = 2;
        boolean a1 = true, b1 = true, c1 = true;
        boolean y = (!a1&&!b1&&c1)||(!a1&&b1&&!c1)||(a1&&!b1&&!c1)||(a1&&b1&&c1);
        if (y == true)
            System.out.println("even");
        else System.out.println("odd");
    }
}
