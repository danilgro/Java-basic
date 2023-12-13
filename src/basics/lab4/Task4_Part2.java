package basics.lab4;

import java.util.Scanner;

public class Task4_Part2 {
    public static void main(String[] args) {
        //  sortArray();           // Упражнение №1
        //  printArray();          // Упражнение №2
        //  changeElementArray();  // Упражнение №3
        //  uniqueElementArray();  // Упражнение №4
    }

    public static void sortArray() {
        boolean sort = false;
        int array[] = {3, 10, 14, 14, 15, 74, 33, 53, 83};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                sort = true;
            } else {
                sort = false;
                break;
            }
        }
        if (sort == true) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static void printArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Result: [");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static void changeElementArray() {
        int[] array = {5, 6, 7, 2};
        System.out.print("Array 1: [");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        System.out.print("Array 2: [");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static void uniqueElementArray() {
        int[] array = {1, 2, 3, 1, 2, 4};
        int count;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("Первое уникальное число: " + array[i]);
                break;
            }
        }
    }

}