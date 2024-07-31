package sorteduniqueelements;

import java.util.List;
import java.util.TreeSet;

public class SortedUniqueElements {
    public static void main(String[] args) {
        TreeSet<Integer> sortedUniqueElements=new TreeSet<>(List.of(3,4,3,2,1,2,3,4,5,6));
        System.out.println(sortedUniqueElements);
    }
}
