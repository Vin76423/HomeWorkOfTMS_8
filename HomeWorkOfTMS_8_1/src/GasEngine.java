public class GasEngine extends Engine {

    public GasEngine(int power) { super(power); }
    public GasEngine() { }

    @Override
    public void start() {
        if ( !checkEngine() ) {
            System.out.println("Двигатель сдох");
            return;
        }

        System.out.println("Качаю бензин...");
        System.out.println("Даю искру");
        System.out.println("Бензиновый двигатель мощность " + getPower() + "л/с завелся");
    }

    private boolean checkEngine() { return true; }
}
