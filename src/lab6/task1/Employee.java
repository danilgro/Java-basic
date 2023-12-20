package lab6.task1;

public class Employee extends Human {
    private String bank;

    public Employee(String name, String surname, String bank) {
        super(name, surname);
        this.bank = bank;
    }

    @Override
    public void getInfo() {
        System.out.println("Имя: " + getName() + "Фамилия: " + getSurname() + "Банк: " + this.bank);
    }
}
