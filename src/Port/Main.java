package Port;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Ship baracuda = new Ship("Baracuda", 1000); // рыболовецкое судно от 2000-3000тн
        baracuda.loadingContainers(Type.cont_40RF,9);
        baracuda.loadingContainers(Type.cont_20RF,3);
        baracuda.printDataV2();  // инфо груз на судне
        Ship contshipEco = new Ship("Contship Eco", 35000); // контейнеровоз
        contshipEco.loadingContainers(Type.cont_40DC, 5);
        contshipEco.loadingContainers(Type.cont_40RF, 3);
        contshipEco.loadingContainers(Type.cont_20OT, 2);
        contshipEco.printDataV2(); //инфо груз на судне
        Port port = new Port("Порт Новоросийск",200000);   // порт
        port.loadingContainers(Type.cont_40DC, 4);
        port.loadingContainers(Type.cont_20DC, 3);
        port.loadingContainers(Type.cont_40RF, 3);
        port.loadingContainers(Type.cont_20RF, 4);
        port.loadingContainers(Type.cont_20OT, 3);
        port.printDataV2();  //инфо груз в порту
        port.workPort(baracuda,contshipEco);  //Запуск работы порта

        // Обновлённая информация по состоянию груза после погрузки/разгрузки
        baracuda.printDataV2();  // инфо груз на судне
        contshipEco.printDataV2(); //инфо груз на судне
        port.printDataV2();  //инфо груз в порту
    }
}
