package ru.job4j.array;

public class FindLoop {
    public static int scan(int[] input, int value) {
        int result = -1;
        for (int index = 0; index < input.length; index++) {
            if (input[index] == value) {
                result = index;
                break;
            }
        }
        return result;
    }
}
