package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int max2 = first >= second ? first : second;
        return max2 >= third ? max2 : third;
    }

    public static void main(String[] args) {
        int num = MultiMax.max(33, 40, 45);
        System.out.println(num);
    }
}
