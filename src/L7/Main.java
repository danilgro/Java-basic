package L7;

public class Main {
    public static void main(String[] args) {
        Airplane cy57 = new Airplane("СУ-57", "ОКБ Сухого", 19.6f, 14.0f, 10000, 2, 4300);
        Airplane.Wing wingCy57 = cy57.new Wing(1530.0f, 82.0f);
        Airplane mig29 = new Airplane("МИГ-29", "ОКБ им. А.И. Микояна", 17.32f, 11.36f, 3000, 2, 2100);
        Airplane.Wing wingMig29 = mig29.new Wing(1150f, 38f);
        wingCy57.getWeightWing();
        wingMig29.getWeightWing();
    }
}
