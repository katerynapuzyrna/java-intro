package lesson04;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {
    public static void main(String[] args) {
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
        Iterator iter = colors.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
        java.util.Collections.sort(colors);
        System.out.println("List after sorting: " +colors);
        iter = colors.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
