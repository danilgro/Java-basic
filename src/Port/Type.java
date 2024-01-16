package Port;

public enum Type {
    cont_20DC("20'DC", 33.1f, 6.058f, 2.438f, 2.581f, 2.330f, 21.610f),
    cont_40DC("40'DC", 67.5f, 12.192f, 2.438f, 2.591f, 4.000f, 26.480f),
    cont_40HC("40'НС", 76.4f, 12.192f, 2.438f, 2.896f, 3.840f, 26.640f),
    cont_20OT("20'OT", 32.5f, 6.058f, 2.438f, 2.591f, 2.300f, 28.180f),
    cont_40OT("40'OT", 65.9f, 12.192f, 2.438f, 2.591f, 4.300f, 26.680f),
    cont_20RF("20'RF", 28f, 6.058f, 2.438f, 2.896f, 3.325f, 23.675f),
    cont_40RF("40'RF", 58f, 12.192f, 2.438f, 2.591f, 3.700f, 25.000f);

    private String type;
    private float capacity;
    private float length;
    private float wight;
    private float height;
    private float tareWeight;
    private float availableLoad;
    private float weightAllContainer;
    private Type(String type, float capacity, float length, float wight, float height, float tareWeight, float availableLoad) {
        this.type = type;
        this.capacity = capacity;   // в м3
        this.length = length;  // в метрах
        this.wight = wight;   // в метрах
        this.height = height;  // в метрах
        this.tareWeight = tareWeight;   // в тоннах
        this.availableLoad = availableLoad;  // в тоннах
        this.weightAllContainer = tareWeight + availableLoad;
    }

    public String getType() {
        return type;
    }

    public float getCapacity() {
        return capacity;
    }

    public float getLength() {
        return length;
    }

    public float getWight() {
        return wight;
    }

    public float getHeight() {
        return height;
    }

    public float getTareWeight() {
        return tareWeight;
    }

    public float getAvailableLoad() {
        return availableLoad;
    }

    public float getWeightAllContainer() {
        return weightAllContainer;
    }
}
