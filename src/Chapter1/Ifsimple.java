package Chapter1;

public class Ifsimple {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y)
            System.out.println("x меньще y");

        x = x * 2;
        if (x == y) {
            System.out.println("x теперь ровно y");

            x = x * 2;
            if (x > y) {
                System.out.println("x теперь больще y");

            }
        }
    }
}
