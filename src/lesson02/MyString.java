package lesson02;

public class MyString {

    public StringBuilder eachNth(String line, int n) {
        StringBuilder resultString = new StringBuilder();
        if (n <= 0) {
            System.out.print("Error: can't generate output string: n must be a natural number");
        } else if (line.equals("")) {
            System.out.print("Error: can't generate output string: input string must be not empty");
        }
        else {
            for (int i = 0; i <= line.length()-1; i = i + n) {
                resultString.append(line.charAt(i));
            }
        }
        return resultString;
    }
}