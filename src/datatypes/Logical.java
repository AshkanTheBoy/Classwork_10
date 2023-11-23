package datatypes;

public class Logical {
    // || && ! tr = 1 false = 0
    public static void main(String[] args) {
        //OR ||
        boolean a = false;
        boolean b = false;
        System.out.println(a || b);
        a = true;
        System.out.println(a || b);
        b = true;
        System.out.println(a || b);
        // AND &&
        a = false;
        b = false;
        System.out.println(a && b);
        a = true;
        System.out.println(a && b);
        b = true;
        System.out.println(a && b);
        //NOT !
        a = false;
        b = false;
        System.out.println(!a);
        a = true;
        System.out.println(!b);
        b = true;
        System.out.println(!a && b);
    }
}
