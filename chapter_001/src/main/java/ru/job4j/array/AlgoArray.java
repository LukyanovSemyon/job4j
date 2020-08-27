package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4, 8, 6, 7};
        for (int j = 0; j < array.length; j++) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i - 1] > array[i]) {
                int temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
            }
        }
            System.out.println(array[j]);
        }
    }
}
