package pl.sdacademy.java20poz.programowanie1.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //List<Object> lista = new ArrayList<>();
        Node<String> root = new NodeImpl<>(null,"Adam");

        Node<String> wezelEwa = new NodeImpl<>(root,"Ewa");
        root.addChild(wezelEwa);

        root.addChild("Jarek");

        //uzupelniamy ze slajdu




    }
}
