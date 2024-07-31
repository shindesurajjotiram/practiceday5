package classspecificsetbehavior;

import java.util.*;

public class ClassSpecificSetBehavior {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>(Arrays.asList(5, 3, 5, 1, 2));
        HashSet<Integer> hashSetList = new HashSet<>(list);
        LinkedHashSet<Integer> linkedHashSetList = new LinkedHashSet<>(list);
        TreeSet<Integer> treeSetList = new TreeSet<>(list);
        System.out.println("HashSet : " + hashSetList);
        System.out.println("LinkedHashSet : " + linkedHashSetList);
        System.out.println("TreeSet : " + treeSetList);
    }
}
