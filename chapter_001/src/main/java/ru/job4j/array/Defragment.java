package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j] == null) {
                    String temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
            System.out.print(input[i] + " ");
        }
        return input;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
