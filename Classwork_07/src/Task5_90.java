public class Task5_90 {
    public static void main(String[] args) {
        int n = 10;
        double sum = 1;
        double a = 1;
        for (int i=0; i<n-1; ++i) {
            a*=(i+1);
            sum+=1./a;
        }
        System.out.println(sum);
//        for (int i = 1; i <=n ; i++) {
//            factorial*=i;
//        }
//        System.out.println(factorial);
    }
}
