package datatypes;

public class Logical2 {
    /*
Даны 3 целых числа. Программа выводит результат логических выражений в виде true или false:
1. Первые два числа равны между собой и не равны третьему;
2. Второе или третье число больше первого;
3. Первое не меньше второго, а второе не больше третьего;
4. Все числа разные;
5. Первое - четное, второе - нечетное, третье - отрицательное;
 */
    public static void main(String[] args) {
        //a
        int a = 1, b = 1, c = 2;
        System.out.println(a == b && a!= c);
        //b
        System.out.println(b>a||c>a);
        //c
        System.out.println(!(a<b) && !(b>c));
        //d
        System.out.println(a!=b && b!=c && a!=c);
        //e
        System.out.println(a%2==0 && b%2!=0 && c<0);
    }

}
