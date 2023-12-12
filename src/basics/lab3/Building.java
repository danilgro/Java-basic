package basics.lab3;

public class Building {
    private int numberFloors;
    private int yearBuild;
    private String name;

    public Building() {
    }

    public void setDataBuilding(int numberFloors, int yearBuild, String name) {
        this.numberFloors = numberFloors;
        this.yearBuild = yearBuild;
        this.name = name;
    }

    public String getDataBuilding() {
        String info = "Информация по зданию: \n" + this.name + "\nКоличество этажей: " + this.numberFloors + "\nГод постройки: " + this.yearBuild;
        return info;
    }

    public int getYearBuild() {
        return yearBuild;
    }
}
