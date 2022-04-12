import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class WordsCount {

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

    private static Collection<String> distinct(List<String> input) {
        int i = 0;

        for (Iterator<String> it = input.iterator(); it.hasNext(); ) {
            String element = it.next();
            boolean unique = true;
            for (int j = i + 1; j < input.size(); j++) {
                if (element.equals(input.get(j))) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                i++;
            } else {
                it.remove();
            }


        }
        return input;
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
