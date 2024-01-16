package Port;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private String name;
    private int deadWeight;   // грузоподъёмность судна

    public List<Container> data = new ArrayList<>();

    public Ship(String name, int deadWeight) {
        this.name = name;
        this.deadWeight = deadWeight;
    }

    public void setData(Container container) {
        this.data.add(container);
    }

    public List<Container> getData() {
        return data;
    }

    public void setData(List<Container> data) {
        this.data = data;
    }

    public void deleteDataElement(int index) {
        this.data.remove(index);
    }

    public float howMuchCargo() {
        float result = 0;
        for (Container c : data) {
            result = result + c.getWeightAllContainer();
        }
        return result;
    }

    public void loadingContainers(Type type, int amount) {
        int deadWeight;
        int containersAreLoaded = 0;
        float howMuchCargoIsOnShip;
        boolean workShip = true;
        while (workShip) {
            workShip = false;
            deadWeight = getDeadWeight();
            howMuchCargoIsOnShip = howMuchCargo();
            if (deadWeight > (howMuchCargoIsOnShip + type.getWeightAllContainer()) && amount > containersAreLoaded) {
                Container cnt = new Container(type);
                setData(cnt);
                containersAreLoaded++;
                workShip = true;
            } else if (deadWeight < (howMuchCargoIsOnShip + type.getWeightAllContainer()) && containersAreLoaded < amount) {
//                       System.out.println("Контейнеры типа " + type + ", в указанном объеме привышают Dead Weight, попробуйте другие");
            }
        }
//        System.out.println("Контейнеры " + type.getType() + ", в количестве " + containersAreLoaded + "шт., загружены.");
//        System.out.println("Груза на судне/в порту: " + howMuchCargoIsOnShip() + " тн..  Возможно догрузить ещё: " +
//                           (getDeadWeight() - howMuchCargoIsOnShip()) + " тн.");
//        System.out.println("-----------------------------------------------------------------");
    }

    public void printDataV2() {  // КОМПАКТНЫЙ ВЫВОД ДАННЫХ
        System.out.println("---------- << " + getName() + " >> имеет груз: ----------");
        int counterCont_20DC = 0;
        int counterCont_40DC = 0;
        int counterCont_40HC = 0;
        int counterCont_20OT = 0;
        int counterCont_40OT = 0;
        int counterCont_20RF = 0;
        int counterCont_40RF = 0;
        int counter = 1;
        for (Container c : data) {
            if (c.getType().equalsIgnoreCase(Type.cont_20DC.getType())) {
                counterCont_20DC++;
            }
            if (c.getType().equalsIgnoreCase(Type.cont_40DC.getType())) {
                counterCont_40DC++;
            }
            if (c.getType().equalsIgnoreCase(Type.cont_40HC.getType())) {
                counterCont_40HC++;
            }
            if (c.getType().equalsIgnoreCase(Type.cont_20OT.getType())) {
                counterCont_20OT++;
            }
            if (c.getType().equalsIgnoreCase(Type.cont_40OT.getType())) {
                counterCont_40OT++;
            }
            if (c.getType().equalsIgnoreCase(Type.cont_20RF.getType())) {
                counterCont_20RF++;
            }
            if (c.getType().equalsIgnoreCase(Type.cont_40RF.getType())) {
                counterCont_40RF++;
            }
        }
        if (counterCont_20DC > 0) {
            System.out.println(counter + ". Контейнер типа "+ Type.cont_20DC.getType()+ " в количестве " + counterCont_20DC + " шт.");
            counter++;
        }
        if (counterCont_40DC > 0) {
            System.out.println(counter + ". Контейнер типа "+ Type.cont_40DC.getType()+ " в количестве " + counterCont_40DC + " шт.");
            counter++;
        }
        if (counterCont_40HC > 0) {
            System.out.println(counter + ". Контейнер типа "+ Type.cont_40HC.getType()+ " в количестве " + counterCont_40DC + " шт.");
            counter++;
        }
        if (counterCont_20OT > 0) {
            System.out.println(counter + ". Контейнер типа "+ Type.cont_20OT.getType()+ " в количестве " + counterCont_20OT + " шт.");
            counter++;
        }
        if (counterCont_40OT > 0) {
            System.out.println(counter + ". Контейнер типа "+ Type.cont_40OT.getType()+ " в количестве " + counterCont_40OT + " шт.");
            counter++;
        }
        if (counterCont_20RF > 0) {
            System.out.println(counter + ". Контейнер типа "+ Type.cont_20RF.getType()+ " в количестве " + counterCont_20RF + " шт.");
            counter++;
        }
        if (counterCont_40RF > 0) {
            System.out.println(counter + ". Контейнер типа "+ Type.cont_40RF.getType()+ " в количестве " + counterCont_40RF + " шт.");
            counter++;
        }
        System.out.println("ВСЕГО:  " + data.size() + " контейнеров, суммарным весом: " + howMuchCargo() + " тн.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeadWeight() {
        return deadWeight;
    }

    public void setDeadWeight(int deadWeight) {
        this.deadWeight = deadWeight;
    }

}
