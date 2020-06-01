import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new GasEngine(200);
        Engine engine2 = new DiselEngine(300);

        Transmission transmission1 = new ManualTransmission();
        Transmission transmission2 = new AutomaticTransmission();

        Car car1 = new Car("Audi", 2700, engine1, transmission1);
        car1.start();

        System.out.println();

        Car car2 = new Car("BMW", 2500, engine2, transmission2);
        car2.start();

    }
}
