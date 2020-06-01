import java.util.Random;
import java.util.Scanner;

public class RobotTransmission extends Transmission {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public RobotTransmission() { }

    @Override
    public boolean start() {
        if ( checkTransmission() ) {
            System.out.println("Включаю режим A/M");
            return true;
        } else {
            System.out.println("Трансмиссия вышла из строя...");
            return false;
        }
    }

    private boolean checkTransmission() {
        System.out.println("Введите число от 0 или 1:");
        return scanner.nextInt() != random.nextInt(2) ;
    }
}

