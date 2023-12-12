package basics.lab3;

public class Car {
    private String color;
    private String brand;
    private int weight;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String carInfo() {
        String info = "Цвет машины: " + this.color + "\nМарка машины: " + this.brand + "\nВес машины: " + this.weight + "кг";
        return info;
    }
}
