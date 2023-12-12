package basics.lab1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();
        exerciseSix();
    }

    public static void exerciseOne() {
        System.out.println("-----------< Упражнение №1 >----------");
        System.out.println("Я \nхорошо \nзнаю \nJava");
    }

    public static void exerciseTwo() {
        System.out.println("-----------< Упражнение №2 >----------");
        double a = 46 + 10;
        double b = 10d / 3d;
        double result = a * b;
        System.out.println("(46 + 10) * (10 / 3)= " + result);
        int result2 = 29 * 4 * (-15);
        System.out.println("29 * 4 * (-15) = " + result2);
    }

    public static void exerciseThree() {
        System.out.println("-----------< Упражнение №3 >----------");
        int number = 10500;
        double result = (number / 10d) / 10d;
        System.out.println(result);
    }

    public static void exerciseFour() {
        System.out.println("-----------< Упражнение №4 >----------");
        double result = 3.6 * 4.1 * 5.9;
        System.out.println("3.6 * 4.1 * 5.9 = " + result);
    }

    public static void exerciseFive() {
        System.out.println("-----------< Упражнение №5 >----------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3и числа: ");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        System.out.println("Вы ввели следующие числа: ");
        System.out.println("Число №1 = " + one);
        System.out.println("Число №2 = " + two);
        System.out.println("Число №3 = " + three);
    }

    public static void exerciseSix() {
        System.out.println("-----------< Упражнение №6 >----------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int b = scanner.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечётное");
        } else {
            if ((b % 2 == 0) && (b > 100)) {
                System.out.println("Выход за пределы диапазона");
            }
            if ((b % 2 == 0) && (b <= 100)) {
                System.out.println("Чётное");
            }
        }
    }
}
