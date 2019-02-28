package lesson03;
import lesson02.Person;

public class PassengerCar extends Car implements Climatable{

    private Person[] persons;//aggregation

    public PassengerCar(String manufacturer, int produceYear, String color, Engine engine) {
        super(manufacturer, produceYear, color, engine);
        sum(1.1, 2.2);//will invoke method for doubles
        sum(1, 2);//will invoke method for integers
    }

    //Overload
    static void sum(int i1, int i2) {
        int res = i1 + i2;
        System.out.println("Sum is: " + res);
    }

    //Overload
    static void sum(double d1, double d2) {
        double res = d1 + d2;
        System.out.println("Sum is: " + res);
    }

    @Override
    public void climateControl(int temp) {
        System.out.println("Climate control tries to make temp: " + temp);
    }

    @Override
    protected String getName() {
        return "Passenger car";
    }
}
