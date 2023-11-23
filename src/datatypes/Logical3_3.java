package datatypes;

public class Logical3_3 {
    public static void main(String[] args) {
        /*
        Вычислить значение логического выражения при следующих значениях логических величин
        А, В и С: А = Истина, В = Ложь, С = Ложь:
        а) не А и В; б) А или не В; в) А и В или С
         */
        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println(!a && b);
        System.out.println(a || !b);
        System.out.println(a && b || c);
        //3.11
        boolean result = true;
        int x = 1;
        int y = -1;
        result = x*x+y*y <= 4;
        System.out.println(result);
        //3.27a
        if (x>2 && y>3) {
            System.out.println(result);
        } else {
            System.out.println(!result);
        }
        //3.31a
        if (x%5 == 0 && x%7 == 0){
            System.out.println(result);
        } else {
            System.out.println(!result);
        }
    }
}
