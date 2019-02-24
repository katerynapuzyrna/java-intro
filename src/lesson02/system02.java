package lesson02;

public class system02 {
    public static void main(String[] args) {
        //classwork part
        System.out.println("Classwork part:");
        Person myPerson1 = new Person ("Puzyrna", "Kateryna",24);
        Person myPerson2 = new Person ("Ivanova", "Mariya",21);
        myPerson1.DoSomething();
        System.out.println(myPerson2.toString());

        //homework part
        System.out.println("Homework part:");
        MyString String1= new MyString();
        System.out.println(String1.eachNth("0123456789", 3));
        System.out.println(String1.eachNth("0123456789",-5));
        System.out.println(String1.eachNth("",3));
        System.out.println(String1.eachNth("0123456789",110));
        System.out.println(String1.eachNth("0123456789",10));
        System.out.println(String1.eachNth("Hello world",2));
        System.out.println(String1.eachNth("Miracle",2));
        System.out.println(String1.eachNth("abcdefg",2));
        System.out.println(String1.eachNth("abcdefg",3));
    }
}
