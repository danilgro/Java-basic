package lab6.task3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lorry extends Car {
    private int numberWheels;
    private int loadCapacity;

    public Lorry(int weight, String model, String color, float speed, int numberWheels, int loadCapacity) {
        super(weight, model, color, speed);
        this.numberWheels = numberWheels;
        this.loadCapacity = loadCapacity;
    }

    public void newWheels() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество колёс : ");
        this.numberWheels = scanner.nextInt();
        System.out.println("Количество колёс грузовика изменено на " + numberWheels + " шт.");
    }


}

