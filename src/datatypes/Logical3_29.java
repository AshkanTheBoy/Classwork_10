package datatypes;

public class Logical3_29 {
    /*
    Записать условие, которое является истинным, когда:
    а) каждое из чисел X и Y нечетное;
    б) только одно из чисел X и Y меньше 20;
    в) хотя бы одно из чисел X и Y равно нулю;
    г) каждое из чисел X, Y, Z отрицательное;
    д) только одно из чисел X, Y и Z кратно пяти;
    е) хотя бы одно из чисел X, Y, Z больше 100.
     */
    public static void main(String[] args) {
        //a
        int x = 16;
        int y = 5;
        int z = 10;

        System.out.println(x%2!=0 && y%2!=0);
        //b
        boolean resultB = (x<20)^(y<20);
        System.out.println(x<20 && !(y<20) || !(x<20)&&y<20);
        System.out.println(resultB);
        //c
        System.out.println(x<20 || y<20);
        //d
        System.out.println(x<0 && y<0 && z<0);
        //e
        boolean resultE = (x%5==0)^(y%5==0) || (y%5==0)^(z%5==0) || (x%5==0)^(z%5==0);
        System.out.println("Д: "+resultE);
        //f
        System.out.println(x>100 || y>100 || z>100);

    }
}
