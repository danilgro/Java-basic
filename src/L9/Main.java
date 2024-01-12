package L9;

import java.util.Random;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //--------------------------------< ЗАДАЧА №2 >------------------------------
//        List<String> list = Arrays.asList("Первый", "Второй", "Первый", "Второй", "Третий", "Четвертый",
//                "Первый", "Второй", "Пятый", "Шестой", "Седьмой");
//        System.out.println(collectionWithoutDuplicates(list));
        //---------------------------------< ЗАДАЧА №3 >-----------------------------
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        if (addOneMillionElement(arrayList) instanceof ArrayList<Integer>) {
//            chooseRandomElements(arrayList);
//        }
//        if (addOneMillionElement(linkedList) instanceof LinkedList<Integer>) {
//            chooseRandomElements(linkedList);
//        }
      /*
      ArrayList - это массив изменяемого размера, который увеличивается по мере добавления дополнительных элементов
      LinkedList не имеет массива, а вместо этого имеет двустороннюю очередь взаимно связанных элементов Node.Это небольшой внутренний класс,
      который служит оболочкой для каждого элемента.
      ВЫВОД:
      Добавление элементов: в ArrayList и LinkedList происходит практически с одинаковой скоростью около 2х сек.
      Доступ по индексу: LinkedList (2 мин.13сек.) во много раз медленнее ArrayList (около 2х сек.)
      В linkedList операции доступа по индексу производятся перебором с начала или конца (смотря что ближе) до нужного элемента,
      и это занимает очень много времени.
      */
        //-------------------------------< ЗАДАЧА №4 >--------------------------
        Map<User, Integer> map = new HashMap<>();
        fillMap(map);
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------");
        System.out.println("Введите имя игрокa(Миша/Валя/Иван/Саша): ");
        String chooseGamer = scanner.nextLine();
        for (Map.Entry<User, Integer> entry : map.entrySet()) {
            if (entry.getKey().getName().equalsIgnoreCase(chooseGamer)) {
                System.out.println("Игрок " + entry.getKey().getName() + " заработал в игре " + entry.getValue() + " point" );
            }
        }
    }

    public static Set<String> collectionWithoutDuplicates(List<String> list) {
        Set<String> result = new HashSet<>(list);
        return result;
    }

    public static List<Integer> addOneMillionElement(List<Integer> somelist) {
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            somelist.add(random.nextInt(100));
        }
        System.out.println("Готово)");
        return somelist;
    }

    public static void chooseRandomElements(List<Integer> someList) {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            System.out.println(someList.get(random.nextInt(1000000)));
        }
        System.out.println("Готово)");
    }

    public static Map<User, Integer> fillMap(Map<User, Integer> map) {
        Random random = new Random();
        int rnd;
        User user = new User("Миша");
        rnd = random.nextInt(100);
        map.put(user, rnd);
        User user2 = new User("Валя");
        rnd = random.nextInt(100);
        map.put(user2, rnd);
        User user3 = new User("Иван");
        rnd = random.nextInt(100);
        map.put(user3, rnd);
        User user4 = new User("Саша");
        rnd = random.nextInt(100);
        map.put(user4, rnd);
        System.out.println("------------< Данные загруженые в Map >----------------");
        for (Map.Entry<User, Integer> entry : map.entrySet()) {
            System.out.println("Игрок " + entry.getKey().getName() + " заработал в игре " + entry.getValue() + " point");
        }
        return map;
    }


    public static class User {
        String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
