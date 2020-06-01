import java.util.Random;
import java.util.Scanner;

public class AutomaticTransmission extends Transmission {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public AutomaticTransmission() { }

    @Override
    public boolean start() {
        if ( checkTransmission() ) {
            System.out.println("Включаю режим D");
            return true;
        } else {
            System.out.println("Трансмиссия вышла из строя...");
            return false;
        }
    }

    private boolean checkTransmission() {
        System.out.println("Введите число от 0 до 2 включительно:");
        return scanner.nextInt() != random.nextInt(3) ;
    }
}
