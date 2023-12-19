package lab6.task5;

import java.util.Scanner;

public abstract class Phone {
    int weight;
    int length;
    int width;
    String color;
    int ageUser;
    String nameUser;

    public Phone(int weight, int length, int width, String color) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public String getAgeUser() {
        return Integer.toString(ageUser);
    }

    public void entryUserData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        setNameUser(scanner.nextLine());
        System.out.print("Введите возраст пользователя: ");
        setAgeUser(scanner.nextInt());
    }

    public void setAgeUser(int ageUser) {
        this.ageUser = ageUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

}
