package basics.lab3;

public class Tree {
    private int age;
    private boolean treeLives;
    private String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean treeLives, String name) {
        this.age = age;
        this.treeLives = treeLives;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

}
