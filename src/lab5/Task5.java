package lab5;

public class Task5 {
    public static void main(String[] args) {
        // seekLongestWord("Метод для поиска самого длинного слова в тексте"); // Упражнение №1
        // seekPalindrome("Шалаш");  // Упражнение №2

        // Упражнение №3
        /*  cutAndPasteWord("Вчера на уроке математики я твёрдо решил бяка, что мне пора жениться. А что? Я уже в третий бяка класс хожу,"+
          "а невесты у меня до сих пор нет. Когда же, если не сейчас. Ещё пара лет, и… поезд ушёл. " +
         "Вот папа мне иногда говорит: «В твои годы, Семён, люди уже полком командовали». И это правда. " +
         "Но сначала я должен жениться. О своём бяка намерении я сообщил своему лучшему другу Петьке. Он со мной за одной партой сидит." +
         "– Ты абсолютно прав, – одобрил моё решение Петька. – Будем тебе на большой бяка перемене невесту выбирать. Из нашего класса." +
         "Как только прозвенел бяка звонок, мы с ним первым делом список невест составили и стали думать, кого мне в жёны взять. " );
        */

        // seekSubString("OLDNEWOLDOLDafasdOLDNEW", "NEW");  // Упражнение №4
        // invertWord("This is a test string");   // Упражнение №5  вариант №1
        // System.out.println(invertWordVariant2("This is a test string"));   // Упражнение №5  вариант №2
    }

    public static void seekLongestWord(String str) {
        String[] strings = str.split(" ");
        String longestWord = "";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > longestWord.length()) {
                longestWord = strings[i];
            }
        }
        System.out.println("Самое длинное слово : " + longestWord);
    }

    public static void seekPalindrome(String str) {
        char[] array = str.toCharArray();
        int count = 0;
        int j = 1;
        for (int i = 0; i < array.length / 2; i++) {
            if (Character.toUpperCase(array[i]) == Character.toUpperCase(array[array.length - j])) {
                count++;
            }
            j++;
        }
        if (count == array.length / 2) {
            System.out.println("Слово " + str + " является полиндромом");
        } else {
            System.out.println(str + "- обычное слово");
        }
    }

    public static void cutAndPasteWord(String str) {
        String rightStr = str.replaceAll("бяка", "[вырезано цензурой]");
        System.out.println(rightStr);
    }

    public static void seekSubString(String str, String subStr) {
        int count = 0;
        int newIndex = 0;
        int value = 0;
        while (value != -1) {
            value = -1;
            value = str.indexOf(subStr, newIndex);
            if (value != -1) {
                newIndex = value + subStr.length();
                count++;
            }
        }
        System.out.println("Количество подстрок в строке = " + count);
    }

    public static void invertWord(String str) {
        String[] strings = str.split(" ");
        System.out.println("Исходная строка: " + str);
        System.out.print("Перевёрнута строка: ");
        for (String s : strings) {
            char[] temp = s.toCharArray();
            for (int i = temp.length - 1; i >= 0; i--) {
                System.out.print(temp[i]);
            }
            System.out.print(" ");
        }
    }

    public static StringBuilder invertWordVariant2(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        return stringBuilder.reverse();
    }

}
