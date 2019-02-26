package lesson03;

public class Truck extends Car implements Climatable{

    public Truck(String manufacturer, int produceYear, String color, Engine engine) {
        super(manufacturer, produceYear, color, engine);
    }

    @Override
    protected String getName() {
        return "Truck";
    }
}
