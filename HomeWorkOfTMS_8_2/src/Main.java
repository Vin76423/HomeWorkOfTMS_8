import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Racket racket1 = new UnionRacket("Союз-17");
        Racket racket2 = new SpaceShuttle("Челленджер");
        Racket racket3 = new FalconHeavy("Falcon-9");

        Spaceport.runRacket(racket1);
        System.out.println();
        Spaceport.runRacket(racket2);
        System.out.println();
        Spaceport.runRacket(racket3);
    }
}
