package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] input, int index) {
        boolean result = true;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[index][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] input, int index) {
        boolean result = true;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i][index] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isWin(char[][] input) {
        boolean result = false;
        for (int index = 0; index < input.length; index++) {
            if ((input[index][index] == 'X') && (monoHorizontal(input, index) || monoVertical(input, index))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
