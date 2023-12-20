package lab6.task4;

public class Main {
    public static void main(String[] args) {
        Cat myrzik = new Cat(4.5f, 2, 26.7f);
        myrzik.printAge();  //вывод через метод переменной с главного класса.
        System.out.println("Возраст кота = " + myrzik.getAge() + " года"); //вывод переменной из главного класса.
    }
}
