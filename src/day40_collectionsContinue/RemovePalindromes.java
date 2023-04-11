package day40_collectionsContinue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "METU", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );
        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String each = it.next();
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reverse)) {
                // names.remove(each); in the we cannot use remove method
                it.remove();
            }
        }


        System.out.println(names);

        System.out.println("-------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "METU", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );
        names2.removeIf(p -> StringUtility.reverse(p).equalsIgnoreCase(p));
        System.out.println(names2);
    }
}
