package setinterface.performancecompareson;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPerformanceComparison {
    public static void main(String[] args) {
        int numElements = 1_000_000;

        System.out.println();
        System.out.println("time require for add : ");
        long startHashSet = System.currentTimeMillis();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < numElements; i++) {
            hashSet.add(i);
        }
        long endHashSet = System.currentTimeMillis();
        System.out.println("HashSet: " + (endHashSet - startHashSet) + " ml");

        long startLinkedHashSet = System.currentTimeMillis();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < numElements; i++) {
            linkedHashSet.add(i);
        }
        long endLinkedHashSet = System.currentTimeMillis();
        System.out.println("LinkedHashSet: " + (endLinkedHashSet - startLinkedHashSet) + " ml");

        long startTreeSet = System.currentTimeMillis();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < numElements; i++) {
            treeSet.add(i);
        }
        long endTreeSet = System.currentTimeMillis();
        System.out.println("TreeSet: " + (endTreeSet - startTreeSet) + " ml");

        System.out.println();
        System.out.println();
        System.out.println("time require for contains : ");


        long startHashSet1 = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            hashSet.contains(i);
        }
        long endHashSet1 = System.currentTimeMillis();
        System.out.println("HashSet: " + (endHashSet1 - startHashSet1) + " ml");


        long startLinkedHashSet1 = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            linkedHashSet.contains(i);
        }
        long endLinkedHashSet1 = System.currentTimeMillis();
        System.out.println("LinkedHashSet: " + (endLinkedHashSet1 - startLinkedHashSet1) + " ml");


        long startTreeSet1 = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            treeSet.contains(i);
        }
        long endTreeSet1 = System.currentTimeMillis();
        System.out.println("TreeSet: " + (endTreeSet1 - startTreeSet1) + " ml");


        System.out.println();
        System.out.println();
        System.out.println("time require for remove : ");


        long startHashSet2 = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            hashSet.remove(i);
        }
        long endHashSet2 = System.currentTimeMillis();
        System.out.println("HashSet: " + (endHashSet2 - startHashSet2) + " ml");


        long startLinkedHashSet2 = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            linkedHashSet.remove(i);
        }
        long endLinkedHashSet2 = System.currentTimeMillis();
        System.out.println("LinkedHashSet: " + (endLinkedHashSet2 - startLinkedHashSet2) + " ml");


        long startTreeSet2 = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            treeSet.remove(i);
        }
        long endTreeSet2 = System.currentTimeMillis();
        System.out.println("TreeSet: " + (endTreeSet2 - startTreeSet2) + " ml");
    }
}

