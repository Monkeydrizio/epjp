package b06.s071;

public class Dog {

    protected final static String DEFAULT_NAME = "Zeus"; // se non avessi messo static il comp. avrebbe duplicato le
                                                         // costanti a ogni oggetto
    protected final static int DEFAULT_WEIGHT = 10;

    protected final static double DEFAULT_SPEED = 0;

    private String name;
    private int weight;
    private double speed;

    public Dog() {
    }

    public Dog(String name) {
        this(name, DEFAULT_WEIGHT, DEFAULT_SPEED);
    }

    public Dog(int weight) {
        this(DEFAULT_NAME, weight, DEFAULT_SPEED);
    }

    public Dog(String name, int weight) {
        this(name, weight, DEFAULT_SPEED);
    }

    public Dog(String name, double speed) {
        this(name, DEFAULT_WEIGHT, speed);
    }

    public Dog(String name, int weight, double speed) {
        this.name= name;
        this.weight = weight;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", weight=" + weight + ", speed=" + speed + "]";
    }

    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

}
