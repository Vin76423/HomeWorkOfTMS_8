import java.util.Random;

public class SpaceShuttle extends Racket {
    private Random random = new Random();

    public SpaceShuttle(String model) {
        super(model);
    }
    public SpaceShuttle() { }

    @Override
    public boolean preLaunchCheck() {
        System.out.println("Проверка электроники...");
        System.out.println("Проверка связи...");
        System.out.println("Проверка состояния шатла...");
        System.out.println("Проверка сосотояния внешних твердотельних ускорителей...");
        System.out.println("Проверка внешнего топливного бака..");
        System.out.println("Проверка систем подачи топлива из внешнего топливного бака к двигателям..");

        if ( random.nextInt(10) % 2 == 0 ) {
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
        System.out.println("Маршевые двигатели шатла запущены");
        System.out.println(".........");
        System.out.println("Тведотельные ускорители запущены");
    }

    private void pump() {
        System.out.println("Качаю реактивное топливо и окислитель топлива из внешнего топливного бака");
    }

    @Override
    public void startRacket() {
        System.out.println("Пуск");
        System.out.println("******");
        System.out.println("5 секунд, полет нормальный");
        System.out.println("******");
        System.out.println("Отделение твердотельных ускорителей");
        System.out.println(getName() + " развил скорость 7.8 км/с, отключаю маршевые двигатели");
        System.out.println("Отделение внешнего топливного бака");
        System.out.println(getName() + " преодолел гравитационное поле Земли и вышел на околоземную арбиту");
    }
}
