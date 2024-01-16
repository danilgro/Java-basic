package Port;

public class Container {

    private String type;
    private float capacity;
    private float length;
    private float wight;
    private float height;
    private float tareWeight;
    private float availableLoad;
    private float weightAllContainer;

    public Container(Type type) {
        this.type = type.getType();
        this.capacity = type.getCapacity();
        this.length = type.getLength();
        this.wight = type.getWight();
        this.height = type.getHeight();
        this.tareWeight = type.getTareWeight();
        this.availableLoad = type.getAvailableLoad();
        this.weightAllContainer = type.getTareWeight() + type.getAvailableLoad();
    }

    public Container(String type, float capacity, float tareWeight, float availableLoad) {
        this.type = type;
        this.capacity = capacity;
        this.length = length;
        this.wight = wight;
        this.height = height;
        this.tareWeight = tareWeight;
        this.availableLoad = availableLoad;
    }

    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder("Контейнер типа " + this.type + " (макс. вес контейнера: " + (availableLoad + tareWeight) + " тн."
                                                + ", oбъём контейнера: " + capacity + " м3.)" );
        return info;
    }

    public float getWeightAllContainer() {
        return weightAllContainer;
    }

    public String getType() {
        return type;
    }


}
