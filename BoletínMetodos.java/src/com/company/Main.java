package com.company;
class Combinatorics {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int choose(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}