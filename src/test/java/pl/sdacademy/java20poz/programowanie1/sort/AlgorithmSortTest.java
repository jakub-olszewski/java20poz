package pl.sdacademy.java20poz.programowanie1.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmSortTest {

    int[] numbers;
    int[] sortedNumbers;
    AlgorithmSort algorithmSort;

    @BeforeEach
    void setUp() {
        // kod wykonuje się przed każdym testem
        // zainicjować liczby
        numbers = initNumbers(1, 3, 80, 5, 67, 3, 2, 57, 32, 79);
        sortedNumbers = initNumbers(1, 2, 3, 3, 5, 32, 57, 67, 79, 80);
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

        System.out.println("Before: " + algorithmSort);

        // when
        algorithmSort.sort();
        System.out.println("Sorting");
        System.out.println("After: " + algorithmSort);

        // then
        algorithmSort.get();
        // wypisz liczby
        assertTable("Nie posortowane poprawnie!",numbers,sortedNumbers);
    }

    @Test
    void selectionSortTest() {
        // zainicjować algorytm sortujący
        // wstawić liczby 'numbers'
        // posortować
        // zweryfikować czy są takie jak w 'sortedNumbers'

        // given
        algorithmSort = new SelectionSort();
        algorithmSort.init(numbers);

        System.out.println("Before: " + algorithmSort);

        // when
        algorithmSort.sort();
        System.out.println("Sorting");
        System.out.println("After: " + algorithmSort);

        // then
        algorithmSort.get();
        // wypisz liczby
        assertTable("Nie posortowane poprawnie!",numbers,sortedNumbers);
    }

    /**
     * Metoda asertuje nam tablice
     *
     * @param message wiadomosc asercji
     * @param table1  tablica wejsciowa 1
     * @param table2  tablica wejsciowa 2 ktora porownujemy
     */
    protected void assertTable(String message, int[] table1, int[] table2) {
        assertTrue(message, table1.length == table2.length);
        // wersja pętla
        for (int i = 0; i < table1.length; i++) {
            assertTrue(message + " "+table1[i]+" != "+table2[i], table1[i] == table2[i]);
        }
    }
}