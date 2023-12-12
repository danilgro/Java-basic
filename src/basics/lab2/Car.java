package basics.lab2;

public class Car {
    private String brand;
    private String engine;
    private int power;
    private Color color;

    public Car() {
    }

    public Car(String brand, String engine, int power, Color color) {
        this.brand = brand;
        this.engine = engine;
        this.power = power;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getEngine() {
        return engine;
    }

    public int getPower() {
        return power;
    }
}
