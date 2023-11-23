import java.util.Scanner;

public class Task24a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x = sqrt(2a+sin|3a|/3.56)\nEnter 'a'");
        Double a = new Double(scanner.nextLine());
        double x = Math.sqrt((2*a+Math.sin(Math.abs(3*a)))/3.56);
        System.out.println(x);
    }
}