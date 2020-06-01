public class DiselEngine extends Engine {

    public DiselEngine(int power) { super(power); }
    public DiselEngine() { }

    @Override
    public void start() {
        System.out.println("Качаю салярку...");
        System.out.println("Накаливаю свечи");
        System.out.println("Дизельный двигатель мощность " + getPower() + "л/с завелся");
    }
}
