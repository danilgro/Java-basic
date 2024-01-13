package L7;

public class Airplane {
    private String model;
    private String brand;
    private float length;
    private float width;
    private float payLoad;
    private int numbersOfEngine;
    private int flightRange;

    public Airplane(String model, String brand, float length, float width, float payLoad, int numbersOfEngine, int flightRange) {
        this.model = model;
        this.brand = brand;
        this.length = length;
        this.width = width;
        this.payLoad = payLoad;
        this.numbersOfEngine = numbersOfEngine;
        this.flightRange = flightRange;
    }

    public class Wing {
        float weightWing;
        float wingArea;

        public Wing(float weightWing, float wingArea) {
            this.weightWing = weightWing;
            this.wingArea = wingArea;
        }

        public void setWeightWing(float weightWing) {
            this.weightWing = weightWing;
        }

        public void setWingArea(float wingArea) {
            this.wingArea = wingArea;
        }

        public void getWeightWing() {
            System.out.println(model + " Вес крыла составляет: " + weightWing + " кг");
        }

        public float getWingArea() {
            System.out.println("Площадь крыла составляет: " + wingArea + " м2");
            return wingArea;
        }

    }

}
