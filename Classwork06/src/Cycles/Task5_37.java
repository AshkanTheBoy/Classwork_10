package Cycles;

public class Task5_37 {
    public static void main(String[] args) {
        double sum = 1;
        double x = 2;
        double sign = -1;
        double pow = x;

        for (int i=1; i<=10; i++) {
            double a = sign*(i+1)/(i+2)*pow;
            sign*=-1;
            sum+=a;
            pow*=x;
        }
        System.out.println(sum);
    }
}
