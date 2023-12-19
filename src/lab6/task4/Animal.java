package lab6.task4;

import java.util.Scanner;

public class Animal {
    private float weight;
    private int age;
    private float tailLength;

    public Animal(float weight, int age, float tailLength) {
        this.weight = weight;
        this.age = age;
        this.tailLength = tailLength;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст животного: ");
        this.age = scanner.nextInt();
        System.out.println("Вы изменили возраст животного на: " + age + "г.");
    }
}