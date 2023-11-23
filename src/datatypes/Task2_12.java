package datatypes;

public class Task2_12 {
    public static void main(String[] args) {
        int a = 1233;
        int o = a%10;
        int t= (a%100)/10;
        t = a/10%10;
        int h = a/100;
        System.out.println(h);
        int res = Integer.valueOf(t+""+h+""+o);
        System.out.println(res);
        res = a%100/10;
        System.out.println(res);
    }
}
