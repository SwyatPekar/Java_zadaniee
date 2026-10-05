package org.example;

public class FirstTask {

    public static int gcd(int a, int b) {
        if (a <= 0 || b < 0) {
            throw new IllegalArgumentException("a должно быть > 0, b должно быть >= 0");
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}