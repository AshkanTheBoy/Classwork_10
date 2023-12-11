import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        boolean status = true;
        while(status) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter rock(r), paper(p) or scissors(s). q to quit");
            char answer = scanner.nextLine().charAt(0);
            if (answer=='q') {
                status = false;
            } else {
                int iAnswer = 0;
                int rand = (int) (Math.random() * 3);
                switch (answer) {
                    case 'r':
                        iAnswer = 0;
                        break;
                    case 'p':
                        iAnswer = 1;
                        break;
                    case 's':
                        iAnswer = 2;
                        break;
                }
                String srand = "";
                switch (rand) {
                    case 0:
                        srand = "rock";
                        break;
                    case 1:
                        srand = "paper";
                        break;
                    case 2:
                        srand = "scissors";
                        break;
                }
                System.out.println("Computer move: " + srand);

                if (iAnswer == rand) System.out.println("Draw");
                else if (iAnswer < rand) System.out.println("You lost");
                else System.out.println("You won");
            }
        }
    }
}
