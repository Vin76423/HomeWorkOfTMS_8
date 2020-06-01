import java.util.Random;

public class FalconHeavy extends Racket {
    private Random random = new Random();

    public FalconHeavy(String model) {
        super(model);
    }
    public FalconHeavy() { }

    @Override
    public boolean preLaunchCheck() {
        System.out.println("Проверка электроники...");
        System.out.println("Проверка связи...");
        System.out.println("Проверка узлов 2-ой ступени..");
        System.out.println("Проверка узлов 1-ой ступени...");
        System.out.println("Проверка систем возврата первой ступени на Землю...");
        System.out.println("Проверка положения/состояния плавающей платформы, для посадки " +
                "1-ой ступени после отделения от ракетоносителя...");

        int value = random.nextInt(10);

        if ( value > 3 && value % 2 == 0 ) {
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
        System.out.println("Запущены 9 жидкосных ракетных двигателей марки Merlin");
    }

    private void pump() {
        System.out.println("Качаю реактивное топливо - керасин RP-1");
        System.out.println("По трубопроводу качаю окислитель топлива - жидкий кислород");
    }

    @Override
    public void startRacket() {
        System.out.println("Пуск");
        System.out.println("******");
        System.out.println("5 секунд, полет нормальный");
        System.out.println("******");
        System.out.println(getName() + " на высоте 70 км....Отделение первой ступени");
        System.out.println("Первая ступень " + getName() + " успешно приземлилась на плавающую платформу в Тихом океане");
        System.out.println(getName() + " преодолел гравитационное поле Земли и вышел на околоземную арбиту");
    }
}
