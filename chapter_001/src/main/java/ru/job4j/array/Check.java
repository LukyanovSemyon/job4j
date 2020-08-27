package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
                for (int j = 0; j <= data.length - 1; j++) {
                    if (data[0] != data[j]) {
                        result = false;
                    }
                }
        return result;
    }
}
