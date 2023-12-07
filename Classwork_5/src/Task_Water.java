public class Task_Water {
    public static void main(String[] args) {
        int c = (int)Math.round(Math.random()*150);
        if (c>100)
            System.out.println("Пар");
        else if (c<100)
            System.out.println("Вода");
        else
            System.out.println("Лед");

    }
}
