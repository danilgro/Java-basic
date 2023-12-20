package lab6.task1;

public class Client extends Human {
    private String bank;


    public Client(String name, String surname, String bank) {
        super(name, surname);
        this.bank = bank;
    }

    @Override
    public void getInfo() {
        System.out.println("Имя: " + getName() + "Фамилия: " + getSurname() + "Банк: " + this.bank);
    }


}
