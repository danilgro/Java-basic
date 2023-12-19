package lab6.task5;

public class MobilePhone extends Phone {

    String brand;
    String mobilePlatform;
    double price;

    public MobilePhone(int weight, int length, int width, String color, String brand, String mobilePlatform, double price) {
        super(weight, length, width, color);
        this.brand = brand;
        this.mobilePlatform = mobilePlatform;
        this.price = price;
    }

    @Override
    public String getNameUser() {
        return super.getNameUser();
    }

    @Override
    public void setNameUser(String nameUser) {
        super.setNameUser(nameUser);
    }


}
