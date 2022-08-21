package demo;

public class Recursion {

    public static void main(String[] args) {
        System.out.print(fun(4));
    }

    static int fun(int n) {
        if (n <= 1) {
            return 1;
        }
        return fun(n - 1) + fun(n - 1);
    }
}
