import java.util.Random;
import java.util.Scanner;

public class UnionRacket extends Racket{
    private Random random = new Random();

    public UnionRacket(String model) {
        super(model);
    }
    public UnionRacket() { }

    @Override
    public boolean preLaunchCheck() {
        System.out.println("Проверка электроники...");
        System.out.println("Проверка связи...");
        System.out.println("Проверка узлов 3-ей ступени...");
        System.out.println("Проверка узлов 2-ой ступени...");
        System.out.println("Проверка узлов 1-ой ступени...");

        if ( random.nextInt(10) > 3 ) {
            System.out.println("Проверки закончены. Неполадок нет.");
            return true;
        }

        System.out.println("Ошибка!!!");
        return false;
    }

    @Override
    public void runEngines() {
        pump();
        System.out.println("Зажигание...");
        System.out.println("Маршевые двигатели и двигатель второй ступени запущены");
    }

    private void pump() {
        System.out.println("Качаю реактивное топливо");
        System.out.println("Качаю окислитель топлива");
    }

    @Override
    public void startRacket() {
        System.out.println("Пуск");
        System.out.println("******");
        System.out.println("5 секунд, полет нормальный");
        System.out.println("******");
        System.out.println("1-я ступень отошла...");
        System.out.println("2-я ступень отошла...");
        System.out.println(getName() + " преодолел гравитационное поле Земли и вышел на околоземную арбиту");
    }
}
