package solutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CountWords {

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("A");
        input.add("B");
        input.add("AA");
        input.add("BB");
        input.add("A");
        input.add("BB");
        input.add("A");

        Map<String, Integer> output = countWords(input);

        System.out.println(output);
    }

    private static Map<String, Integer> countWords(List<String> input) {
        Map<String, Integer> map = new HashMap<>();
        for (String element : input) {
            int count = map.getOrDefault(element, 0);
            count++;
            map.put(element, count);
        }
        return map;
    }
}
