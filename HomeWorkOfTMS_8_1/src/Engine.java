public abstract class Engine {
    private int power;

    public Engine(int power) { this.power = power; }
    public Engine() { }

    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }


    public abstract void start();
}
