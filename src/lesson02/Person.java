package lesson02;

public class Person {
    String firstName;
    String secondName;
    int age;
    private static int count = 0;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
       // count++;
    }

    void DoSomething () {
        String end = " is doing something.";

        System.out.println(firstName + " " + secondName + end);
    }

    static {
        System.out.println("First class loading");
    }

    {
        System.out.println(++count + " class loading.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
