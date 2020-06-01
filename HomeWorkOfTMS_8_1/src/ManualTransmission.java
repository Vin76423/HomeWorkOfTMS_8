import java.util.Random;
import java.util.Scanner;

public class ManualTransmission extends Transmission {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public ManualTransmission() { }

    @Override
    public boolean start() {
        if ( checkTransmission() ) {
            System.out.println("Включаю 1-ую передачу");
            return true;
        } else {
            System.out.println("Трансмиссия вышла из строя...");
            return false;
        }
    }

    private boolean checkTransmission() {
        System.out.println("Введите число от 0 до 3 включительно:");
        return scanner.nextInt() != random.nextInt(4) ;
    }
}
