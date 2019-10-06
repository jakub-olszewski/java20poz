package pl.sdacademy.java20poz.programowanie1.sort;

public class BubbleSort extends AlgorithmSort{

    @Override
    void sort() {
        numbers[1] = 3;
        // implementacja sortowania
        for(int i=0;i<numbers.length;i++) {
               if(i<9) {
                   swap(i, i+1);
               }
        }
    }
}
