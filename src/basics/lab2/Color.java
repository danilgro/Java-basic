package basics.lab2;

public enum Color {
    BLACK("чёрный"),
    RED("красный"),
    WHITE("белый"),
    YELLOW("жёлтый");
    private String translate;

    private Color(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }
}
