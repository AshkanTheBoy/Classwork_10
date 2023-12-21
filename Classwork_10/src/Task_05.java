public class Task_05 {
    public static void main(String[] args) {
       int[] arr = {1,3,6,2,0,5};
       int a = 3, b = 0;
       boolean firstFound = false;
       boolean secondFound = false;
       for (int elem: arr) {
           if (elem==a) {
               firstFound = true;
           }
           if (elem==b) {
               secondFound = true;
           }
       }
       if (firstFound&&secondFound) {
           System.out.println("Success");
       } else {
           System.out.println("Incorrect");
       }
    }
}
