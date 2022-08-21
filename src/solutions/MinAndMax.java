package solutions;

import java.util.List;

public class MinAndMax {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 10, -12, 85, 4, 5};

        int min = input[0];
        int max = input[0];

        for (int x : input) {
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }

        System.out.printf("Min: " + min + ", max: " + max);
    }
}