package lesson03;

public abstract class Car {
    private String manufacturer;
    private int produceYear;
    private String color;
    private Engine engine;

    public Car(String manufacturer, int produceYear, String color) {
        this.manufacturer = manufacturer;
        this.produceYear = produceYear;
        this.color = color;
    }

    public Car(String manufacturer, int produceYear, String color, Engine engine) {
        this.manufacturer = manufacturer;
        this.produceYear = produceYear;
        this.color = color;
        this.engine = engine;
    }

    protected abstract String getName();

    public void gas(){
        engine.startEngine();//composition
        System.out.println(getName() + " started to move");
    }

    public void stop() {
        engine.stopEngine();//composition
        System.out.println(getName() + " started to stop");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + getName() + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", produceYear=" + produceYear +
                ", color='" + color + '\'' +
                '}';
    }
}
