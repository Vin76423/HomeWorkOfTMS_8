public class Car {
    private String model;
    private int price;
    private Engine engine;
    private Transmission transmission;

    public Car(String model, int price, Engine engine, Transmission transmission) {
        this.model = model;
        this.price = price;
        this.engine = engine;
        this.transmission = transmission;
    }
    public Car() { }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
    public Engine getEngine() { return engine; }
    public void setEngine(Engine engine) { this.engine = engine; }
    public Transmission getTransmission() { return transmission; }
    public void setTransmission(Transmission transmission) { this.transmission = transmission; }

    public void start() {
        if ( checkSystem() ) {
            engine.start();
            System.out.println(model + " завелся");
        }

        if ( transmission.start() ) System.out.println(model + " поехал");
        else System.out.println(model + " требуется тех-обслуживание");
    }

    private boolean checkSystem() {
        System.out.println("Проверка всех систем");
        return true;
    }
}
