package lab6.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MobilePhone huawei = new MobilePhone(157, 141, 6, "черный", "huawei", "Android", 67580.50);
        System.out.print("Введите имя пользователя: ");
        huawei.setNameUser(scanner.nextLine());
        System.out.print("Введите возраст пользователя: ");
        huawei.setAgeUser(scanner.nextInt());
        System.out.print("Пользователь: " + huawei.getNameUser() + "\nВозраст: " + huawei.getAgeUser() + " лет");
    }
}
