package setinterface.firstnondublicateelement;


import java.util.LinkedHashSet;
import java.util.List;

public class FirstNonDuplicateElement {

    public static void main(String[] args) {
        List<Integer> inputList = List.of(4, 5, 4, 6, 4, 7, 8, 5);
        LinkedHashSet<Integer> seen = new LinkedHashSet<>();

        for (int num : inputList) {
            if (!seen.contains(num)) {
                seen.add(num);
            } else {
                seen.remove(num);
            }
        }

        System.out.println("First non-duplicate element: " + seen.iterator().next());
    }
}
