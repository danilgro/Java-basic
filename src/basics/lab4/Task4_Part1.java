package basics.lab4;

import java.util.Scanner;

public class Task4_Part1 {
    public static void main(String[] args) {
        //  printOddNumber();          // Упражнение №1
        //  printNumber();             // Упражнение №2
        //  sum();                     // Упражнение №3
        //  comparisonThreeNumber();   // Упражнение №4
        //  arrayContainsThreeFirstAndLast(); // Упражнение №5
        //  arrayContainsOneAndThree(); // Упражнение №6
    }

    public static void printOddNumber() {
        int result;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printNumberDivisionThreeAndFive() {
        System.out.print("Делиться на 3:  ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\nДелиться на 5:  ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\nДелиться на 3 и на 5:  ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean sum() {
        boolean result = false;
        int one, two, three;
        int sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        one = scanner.nextInt();
        System.out.print("Введите второе число: ");
        two = scanner.nextInt();
        System.out.print("Введите третье число: ");
        three = scanner.nextInt();
        sum = one + two;
        if (sum == three) {
            result = true;
            System.out.print("Результат: " + result);
        } else {
            System.out.print("Результат: " + result);
        }
        return result;
    }

    public static boolean comparisonThreeNumber() {
        boolean result = false;
        int one, two, three;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        one = scanner.nextInt();
        System.out.print("Введите второе число: ");
        two = scanner.nextInt();
        System.out.print("Введите третье число: ");
        three = scanner.nextInt();
        if (two > one && three > two) {
            result = true;
            System.out.print("Результат: " + result);
        } else {
            System.out.print("Результат: " + result);
        }

        return result;
    }

    public static boolean arrayContainsThreeFirstAndLast() {
        boolean result = false;
        int array[] = {3, 10, 8, 14, 5, 4, 13, 5, 3};
        if (array.length >= 2) {
            System.out.print("array = ");
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    System.out.println(array[i]);
                } else {
                    System.out.print(array[i] + ", ");
                }
            }
            if ((array[0] == 3) && (array[array.length - 1] == 3)) {
                result = true;
            }
        } else {
            System.out.println("Длина массива меньше 2 ! ");
        }

        System.out.println(result);
        return result;
    }

    public static boolean arrayContainsOneAndThree() {
        boolean contains = false;
        int count = 0;
        int array[] = {3, 10, 7, 1, 5, 2, 13, 7, 8};
        System.out.print("array = ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) {
                count++;
            }
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        if (count >= 1) {
            contains = true;
        }
        System.out.println(contains);
        return contains;
    }

}
