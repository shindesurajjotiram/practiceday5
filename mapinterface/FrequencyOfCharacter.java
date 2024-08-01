package mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
         String string=new String("surjajotiramshindesuraj");
         Map<Character,Integer> map=new HashMap<>();
         for(Character character:string.toCharArray()) {
             if(map.containsKey(character)) map.put(character,map.get(character)+1);
             else map.put(character,1);
         }
         System.out.println(map);
    }
}
