package Chapter3;

public class LIght {

    public static void main(String[] args) {
        int lightspeed ;
        long days;
        long seconds;
        long distance;

        lightspeed = 186_000 ;

        days = 1_000;

        seconds = days * 24 * 60 *60;

        distance = lightspeed * seconds;

        System.out.print("За " + days);
        System.out.print("дней свет пройдет около ");
        System.out.println(distance + "миль. ");



    }
}
