package lab6.task3;

public class Car {
    public int weight;
    public String model;
    public String color;
    public float speed;

    public Car(int weight, String model, String color, float speed) {
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public Car() {
    }

    public void outPut() {
        System.out.println("Вес " + model + "составляет " + weight + "кг. ");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

}
