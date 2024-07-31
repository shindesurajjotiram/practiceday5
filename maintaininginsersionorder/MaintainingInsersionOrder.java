package maintaininginsersionorder;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class MaintainingInsersionOrder {
    public static void main(String[] args) {
        String[] list={"apple", "banana", "apple", "orange"};
        LinkedHashSet<String> linkedNonDublicateList = new LinkedHashSet<>(Arrays.asList(list));
        System.out.println(linkedNonDublicateList);

    }
}
