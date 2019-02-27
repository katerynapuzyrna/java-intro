package lesson03;

public class Fibonacci {
    public static void printFibonacciNumbers(int n) {
        if (n <= 0)
            System.out.println("Please enter a positive number more than 0");
        else {
            int[] resultArray = new int[n];
            for (int i = 0; i <= n - 1; i++) {
                if (i <= 1) {
                    resultArray[i] = i;
                }
                else {
                    resultArray[i] = resultArray[i - 2] + resultArray[i - 1];
                }
                if (i == 0)
                    System.out.print(resultArray[i]);
                else System.out.print(", " + resultArray[i]);
            }
            System.out.println();
        }
    }
}
