package setisasubsetofanotherset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIsASubsetOfAnotherSet {
    public static boolean isSubset(Set<Integer> setA, Set<Integer> setB) {
        return setB.containsAll(setA);
    }

    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> setB = new HashSet<>(Set.of(1, 2, 3, 4));

        boolean isSubsetHashSet = isSubset(setA, setB);
        System.out.println("Is SetA a subset of SetB (HashSet)? " + isSubsetHashSet);

        Set<Integer> setC = new LinkedHashSet<>(Set.of(1, 2, 5));
        Set<Integer> setD = new LinkedHashSet<>(Set.of(1, 2, 3, 4));

        boolean isSubsetLinkedHashSet = isSubset(setC, setD);
        System.out.println("Is SetC a subset of SetD (LinkedHashSet)? " + isSubsetLinkedHashSet);

        Set<Integer> setE = new TreeSet<>(Set.of(1, 2, 3));
        Set<Integer> setF = new TreeSet<>(Set.of(1, 2, 3, 4));

        boolean isSubsetTreeSet = isSubset(setE, setF);
        System.out.println("Is SetE a subset of SetF (TreeSet)? " + isSubsetTreeSet);
    }
}

