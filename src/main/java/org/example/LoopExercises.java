package org.example;

public class LoopExercises {

    public int sum(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        return total;
    }

    public int sumUntilEven(int n) {
        int total = 0;
        int i = 1;

        while (i <= n) {
            total += i;

            // stop when total becomes even
            if (total % 2 == 0) {
                break;
            }

            i++;
        }

        return total;
    }
}