package lab6.task2;

public class Employee extends Client implements Human {
    private String bank;
    private String name;
    private String surname;

    public Employee(String name, String surname, String bank) {
        super(name, surname, bank);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public String getNameBank() {
        return this.bank;
    }

    @Override
    public void getInfo() {
        System.out.println("Имя: " + getName() + "Фамилия: " + getSurname() + "Банк: " + bank);
    }
}
