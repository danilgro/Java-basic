package L10;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        //--------------------------------< ЗАДАЧА №1 >------------------------------
//        File dataOne = new File("resource/dataOne");
//        ArrayList<String> arrayList = getStringFromFile(dataOne);
//        for (String arr : arrayList) {
//            System.out.println(arr);
//        }
        //--------------------------------< ЗАДАЧА №2 >------------------------------
//        File output = new File("resource/output");
//        setStringInFile(output, "Логически связанный текст");
        //--------------------------------< ЗАДАЧА №3 >------------------------------
//        File dataOne = new File("resource/dataOne");
//        File dataTwo = new File("resource/dataTwo");
//        File dataOnePlusTwo = new File("resource/dataOnePlusTwo.txt");
//        addStringAndWriteInFile(dataOne,dataTwo,dataOnePlusTwo);
        //--------------------------------< ЗАДАЧА №4 >------------------------------
//        File dataOnePlusTwo = new File("resource/dataOnePlusTwo.txt");
//        replaceSymbol(dataOnePlusTwo, "$");

    }

    public static ArrayList<String> getStringFromFile(File file) {
        ArrayList<String> array = new ArrayList<>();
        String str;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((str = bufferedReader.readLine()) != null) {
                array.add(str);
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
        return array;
    }

    public static void setStringInFile(File file, String str) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.append("");
            bufferedWriter.write(str);
            bufferedWriter.append("\n");
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }

    public static void addStringAndWriteInFile(File dataOne, File dataTwo, File dataOnePlusTwo) {
        ArrayList<String> listOne = (getStringFromFile(dataOne));
        ArrayList<String> listTwo = (getStringFromFile(dataTwo));
        listOne.addAll(listTwo);
        for (String s : listOne) {
            setStringInFile(dataOnePlusTwo, s);
        }
    }

    public static void replaceSymbol(File dataOnePlusTwo, String symbol) {
        File out = new File("resource/out");
        List<String> allowedSymbols = Arrays.asList("а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т",
                "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "\n");
        String content;
        int value;
        boolean print = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(dataOnePlusTwo));
             BufferedWriter writer = new BufferedWriter(new FileWriter(out))) {
            while ((value = reader.read()) != -1) {
                content = String.valueOf((char) value);
                for (String str : allowedSymbols) {
                    if (content.equalsIgnoreCase(str)) {
                        print = true;
                    }
                }
                if (print == true) {
                    writer.write(content);
                    print = false;
                } else {
                    writer.write(symbol);
                }
            }
        } catch (
                IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}




