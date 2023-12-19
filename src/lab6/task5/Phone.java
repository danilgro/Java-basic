package lab6.task5;

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

    public int getAgeUser() {
        return ageUser;
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
