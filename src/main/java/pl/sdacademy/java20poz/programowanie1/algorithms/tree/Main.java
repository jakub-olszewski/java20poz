package pl.sdacademy.java20poz.programowanie1.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //List<Object> lista = new ArrayList<>();
        Node<String> root = new NodeImpl<>(null, "Adam");

        // dodajemy do niego kolejne węzły
        Node<String> n1 = root.addChild("Ewa");
        Node<String> n2 = root.addChild("Jarek");
        Node<String> n3 = root.addChild("Marta");

        n1.addChild("Jurek");
        n1.addChild("Max");
        n1.addChild("Iza");

        n2.addChild("Iwona");

        n3.addChild("Rafał");
        n3.addChild("Ola");


        TreePrinter.print(root);


    }
}
