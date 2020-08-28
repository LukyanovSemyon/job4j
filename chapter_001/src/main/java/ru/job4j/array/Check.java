package ru.job4j.array;

public class Check {
    public static boolean scan(boolean[] input) {
        boolean result = true;
                for (int cell = 0; cell <= input.length - 1; cell++) {
                    if (input[0] != input[cell]) {
                        result = false;
                        break;
                    }
                }
        return result;
    }
}
