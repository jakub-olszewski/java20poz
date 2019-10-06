package pl.sdacademy.java20poz.programowanie1.sort;

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
        return null;
    }
}
