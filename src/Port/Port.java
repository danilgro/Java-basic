package Port;

import java.util.ArrayList;
import java.util.List;

public class Port extends Ship {
    private String name;
    private int deadWeight;  // вес вмещаемых контейнеров
    public List<Container> data = new ArrayList<>();

    public Port(String name, int deadWeight) {
        super(name, deadWeight);
    }

    public void workPort(Ship shipOne, Ship shipTwo) throws InterruptedException {
        System.out.println("--------------------- ПОРТ <<" + getName() + ">> ---------------------");
        Pier pierOne = new Pier("1", true);
        Pier pierTwo = new Pier("2", true);
        Thread threadPierOne = new Thread(new Runner("Причал №" + pierOne.getNumber(), "ПОГРУЗКА", 7, shipOne));
        threadPierOne.start();
        Thread threadPierTwo = new Thread(new Runner("Причал №" + pierTwo.getNumber(), "РАЗГРУЗКА", 7, shipTwo));
        threadPierTwo.start();
        Thread.sleep(11000);
    }

    class Runner implements Runnable {
        String namePier;
        String process;
        Ship ship;
        int amountContainersInProcess;

        public Runner(String namePier, String process, int amountContainersInProcess, Ship ship) {
            this.namePier = namePier;
            this.process = process;
            this.amountContainersInProcess = amountContainersInProcess;
            this.ship = ship;
        }

        @Override
        public void run() {
            int amountContainersOnShip = ship.getData().size();
            int amountContainersInPort = getData().size();
            int counterLoading = amountContainersInProcess;

            boolean workLoading = true;
            boolean workUnloading = true;

            if (process.equalsIgnoreCase("Погрузка")) {   // ПОГРУЗКА НА СУДНО
                while (workLoading) {
                    workLoading = false;
                    if (amountContainersInPort > 0 && counterLoading > 0) {
                        if ((ship.howMuchCargo() + getData().get(0).getWeightAllContainer()) < ship.getDeadWeight()) {
                            System.out.println(namePier + ". " + process + " судна <<" + ship.getName() + ">>; " +
                                    ">-------------> ГРУЗ: " + getData().get(0).getInfo());
                            ship.setData(getData().get(0));
                            deleteDataElement(0);
                            counterLoading--;
                            workLoading = true;
                        } else {
                            System.out.println("Вес груза превышает Dead Weight судна <<" + ship.getName() + ">>");
                        }
                    } else if (amountContainersInPort == 0) {
                        System.out.println("В порту нет контейнеров");
                    } else if (counterLoading == 0) {
                        System.out.println("Погрузка судна <<" + ship.getName() + ">> завершена.");
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }  // ПОГРУЗКА НА СУДНО

            if (process.equalsIgnoreCase("Разгрузка")) {  // РАЗГРУЗКА В ПОРТ
                while (workUnloading) {
                    workUnloading = false;
                    if (amountContainersOnShip > 0 && counterLoading > 0) {
                        if ((howMuchCargo() + ship.getData().get(0).getWeightAllContainer()) < getDeadWeight()) {
                            System.out.println(namePier + ". " + process + " судна <<" + ship.getName() + ">>; " +
                                    ">-------------> ГРУЗ: " + ship.getData().get(0).getInfo());
                            setData(ship.getData().get(0));
                            ship.deleteDataElement(0);
                            counterLoading--;
                            workUnloading = true;
                        } else {
                            System.out.println("Вес груза превышает Dead Weight порта");
                        }
                    } else if (amountContainersOnShip == 0) {
                        System.out.println("На судне <<" + ship.getName() + ">> нет контейнеров.");
                    } else if (counterLoading == 0) {
                        System.out.println("Разгрузка судна <<" + ship.getName() + ">> завершена.");
                    }
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }  // РАЗГРУЗКА В ПОРТ
        }

    }

    public static class Pier {
        private String number;
        private boolean busy;

        public Pier(String number, boolean busy) {
            this.number = number;
            this.busy = busy;
        }

        public String getNumber() {
            return number;
        }

        public boolean isBusy() {
            return busy;
        }

        public void setBusy(boolean busy) {
            this.busy = busy;
        }
    }

}


