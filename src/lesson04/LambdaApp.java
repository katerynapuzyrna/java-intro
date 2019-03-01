package lesson04;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;

public class LambdaApp {
    public static void main(String[] args) {
        //Classwork part
        System.out.println("Classwork part:");
        int[] array = {-5, -4,-3,-2,-1,0,1,2,3,4,5};
        ExpressionUtils expressionUtils = new ExpressionUtils();
        Expression exp1 = expressionUtils::isEven;
        Expression exp2 = ExpressionUtils::isNegative;
        Expression exp3 = (int i)-> i>=0;//isPositive

        System.out.println(sumOf(array, exp1));
        System.out.println(sumOf(array, exp2));
        System.out.println(sumOf(array, exp3));
        System.out.println(sumOf(array, (int i)-> i%2!=0));//isOdd

        System.out.println(sumOf(array, new Expression(){
            @Override
            public boolean isEqual(int i) {
                return i>=0;
            }
        }));

        //Homework part
        System.out.println("Homework part:");
        ArrayList<String> colors = new ArrayList<>(4);
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Orange");
        colors.remove("Yellow");
        System.out.println("List contains 'Yellow': " + colors.contains("Yellow"));
        System.out.println("List before sorting: " +colors);
        Collections.sort(colors);
        System.out.println("List after sorting: " +colors);

    }
    private static int sumOf(int[] arr, Expression expression) {
        int result=0;
        for (int i : arr){
            if (expression.isEqual(i))
                result+=i;
        }
        return result;
    }
}
