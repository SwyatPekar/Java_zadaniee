package org.example;

public class SecondTask {

    public static long a(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        return 3 * a(n - 1) - a(n - 2);
    }
}
