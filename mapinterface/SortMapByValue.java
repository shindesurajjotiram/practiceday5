package mapinterface;

import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        map.put('a',22);
        map.put('g',4);
        map.put('e',5);
        map.put('b',6);
        map.put('o',8);
        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
        Collections.sort(list ,(o1, o2) -> ((o1.getValue()) - o2.getValue()));
        System.out.println(list);
        for(Map.Entry<Character,Integer> entry:list) {
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }
}
