public class Spaceport {
    public static void runRacket(Racket racket) {
        if ( ! racket.preLaunchCheck() ) {
            System.out.println(racket.getName() + " не может отправиться в космос, " +
                    "запуск придется отложить");
            return;
        }

        racket.runEngines();
        for ( int i = 9; i >= 0; i-- ) {
            System.out.println(i + "...");
        }
        racket.startRacket();
    }
}
