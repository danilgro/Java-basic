package lab6.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lorry scania = new Lorry(8190, "Scania", "Красный", 200.00f, 6, 25000);
        scania.newWheels();
    }
}
