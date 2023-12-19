package lab6.task4;

public class Cat extends Animal {

    public Cat(float weight, int age, float tailLength) {
        super(weight, age, tailLength);
    }

    public void printAge() {
        System.out.println("Возраст: " + getAge() + " года");
    }
}
