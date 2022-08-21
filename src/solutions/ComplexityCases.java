package solutions;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ComplexityCases {

    public static void main(String[] args) {
        printPairs(new int[]{1, 2, 3, 4});
    }

    static void printPairs(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                System.out.printf(input[i] + "-" + input[j] + '\n');
            }
        }
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

}
