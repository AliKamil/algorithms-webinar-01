package demo;

public class PrintPairs {

    public static void main(String[] args) {
        printPairs(new int[]{1, 2, 3, 4, 5});
    }


    static void printPairs(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                System.out.println(j);
            }
            System.out.printf(input[i] + "-" + input[0] + '\n');

        }


    }
}
