package pl.sdacademy.java20poz.programowanie1.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmSortTest {

    int[] numbers;
    int[] sortedNumbers;
    AlgorithmSort algorithmSort;

    @BeforeEach
    void setUp() {
        // kod wykonuje się przed każdym testem
        // zainicjować liczby
        numbers = initNumbers(1,3,80,5,67,3,2,57,32,79);
        sortedNumbers = initNumbers(1,2,3,3,5,32,57,67,79,80);
    }

    private int[] initNumbers(int... numbers) {
        return numbers;
    }

    @Test
    void bubbleSortTest() {
        // zainicjować algorytm sortujący
        // wstawić liczby 'numbers'
        // posortować
        // zweryfikować czy są takie jak w 'sortedNumbers'

        // given
        algorithmSort = new BubbleSort();
        algorithmSort.init(numbers);

        // when
        algorithmSort.sort();

        // then
        algorithmSort.get();
        // wypisz liczby
        System.out.println(algorithmSort);
    }
}