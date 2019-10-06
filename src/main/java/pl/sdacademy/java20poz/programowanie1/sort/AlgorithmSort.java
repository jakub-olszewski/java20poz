package pl.sdacademy.java20poz.programowanie1.sort;

import java.util.Arrays;

public abstract class AlgorithmSort {

    protected int[] numbers;

    abstract void sort();

    /**
     * Metoda inicjuje wartości tablicy z wykorzystaniem varargs
     * @param numbers
     * @return
     */
    protected void init(int... numbers){
        this.numbers = numbers;
    }

    public int[] get() {
        return numbers;
    }

    @Override
    public String toString(){
        // wypisz po przecinku za pomocą pętli liczby z tablicy
        // StringBuilder
        StringBuilder result = new StringBuilder();

        // pętla dopisywanie do result liczb
        for(int number: numbers){
            result.append(number).append(" |");
        }

        return result.toString();
    }

    /**
     * Metoda zamienia wartości w indeksach i j
     * @param i indeks
     * @param j indeks
     */
    protected void swap(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public void print(){
        //wersja bez stream
        for(int number: numbers){
            System.out.print("| "+number);
        }
        System.out.println("|");
    }
}
