package pl.sdacademy.java20poz.programowanie1.algorithms.heaptree;


/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 26.05.2019 13:56
 **/
public class Main {

    public static void main(String[] args) {
        //5 3 17 10 84 19 6 22 9
        HeapTree heapTree = new HeapTree();

        heapTree.insert(5);
        HeapTreePrinter.print(heapTree.getRoot());

        heapTree.insert(3);
        HeapTreePrinter.print(heapTree.getRoot());

        heapTree.insert(17);
        HeapTreePrinter.print(heapTree.getRoot());

        heapTree.insert(10);
        HeapTreePrinter.print(heapTree.getRoot());

        heapTree.insert(84);
        HeapTreePrinter.print(heapTree.getRoot());

        heapTree.insert(19);
        HeapTreePrinter.print(heapTree.getRoot());

        heapTree.insert(6);
        HeapTreePrinter.print(heapTree.getRoot());

        heapTree.insert(22);
        HeapTreePrinter.print(heapTree.getRoot());

        heapTree.insert(9);
        HeapTreePrinter.print(heapTree.getRoot());

        heapTree.insert(34);
        HeapTreePrinter.print(heapTree.getRoot());

        heapTree.insert(99);
        HeapTreePrinter.print(heapTree.getRoot());



        HeapTreePrinter.print(heapTree.getRoot());
    }
}
