package lesson03;

public class Program03 {
    public static void main(String[] args) {
       //Classwork part
       System.out.println("Classwork part:");
       Truck truck = new Truck("Renault", 2001, "White", new Engine(5.6));
       PassengerCar passengerCar = new PassengerCar("Daewoo", 2005, "Silver", new Engine(1.2));
       System.out.println(truck);
       System.out.println(passengerCar);
       truck.gas();
       truck.climateControl(27);
       passengerCar.gas();
       passengerCar.climateControl(21);
       passengerCar.stop();
       passengerCar.climateStop();
       truck.climateStop();
       truck.stop();

        //Homework part
        System.out.println("Homework part:");
        Fibonacci.printFibonacciNumbers(1);
        Fibonacci.printFibonacciNumbers(2);
        Fibonacci.printFibonacciNumbers(3);
        Fibonacci.printFibonacciNumbers(5);
        Fibonacci.printFibonacciNumbers(10);
        Fibonacci.printFibonacciNumbers(0);
        Fibonacci.printFibonacciNumbers(-1);
    }
}
