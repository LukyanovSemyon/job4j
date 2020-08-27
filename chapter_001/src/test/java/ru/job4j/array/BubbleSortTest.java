package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BubbleSortTest {

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        int[] input = {5, 3, 2, 1, 4, 8, 6, 7};
        int[] result = BubbleSort.sort(input);
        int[] expect = {1, 2, 3, 4, 5, 6, 7, 8};
        assertThat(result, is(expect));
            }
    }
