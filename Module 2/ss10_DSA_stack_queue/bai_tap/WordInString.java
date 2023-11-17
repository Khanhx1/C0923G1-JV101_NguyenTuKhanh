package ss10_DSA_stack_queue.bai_tap;

import java.util.Map;
import java.util.TreeMap;

public class WordInString {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        String string = "Mo no ku Ro Boo no nO";
        String upperCaseString = string.toUpperCase();
        String[] arrayOfString = upperCaseString.split(" ");
        for (int i = 0; i < arrayOfString.length; i++) {
            if (!map.containsKey(arrayOfString[i])) {
                map.put(arrayOfString[i], 1);
            } else {
                map.replace(arrayOfString[i], map.get(arrayOfString[i]) + 1);
            }
        }
        for (String word : map.keySet()) {
            System.out.println(word + " - appear: " + map.get(word) + " time(s)");
        }
    }
}
