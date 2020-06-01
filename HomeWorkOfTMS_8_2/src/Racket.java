public abstract class Racket {
    private String name;

    public Racket(String model) {
        this.name = model;
    }
    public Racket() { }

    public String getName() { return name; }
    public void setName(String model) { this.name = model; }

    public abstract boolean preLaunchCheck();
    public abstract void runEngines();
    public abstract void startRacket();
}
