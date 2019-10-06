package pl.sdacademy.java20poz.programowanie1.algorithms.btree;

/**
 * Aby rozpocząć implementacje tej klasy nalezy ukończyć NodeImpl
 */
public class BTree {

    Node root;

    private boolean isEmpty() {
        return root == null;
    }

    public Node getRoot() {
        return root;
    }

    public void insert(int value) {
        // TODO jeśli jest pusty utwórz nowy węzeł i przypisz do korzenia
        if (isEmpty()) {
            root = new NodeImpl(value);
        } else {
            // TODO jeśli nie jest pusty to szukamy odpowiedniego rodzinca
            Node marker = root;
            Node parent = null;
            while (marker != null) {

                parent = marker;
                // TODO dopuki jest zajęty węzeł, szukamy odpowiednio: jeśli nasza wartość
                //  jest mniejsza od węzła idziemy w lewo w przeciwnym wypadku w prawo
                if(value < marker.getKey() ){
                    marker = marker.getLeft();
                }else{
                    marker = marker.getRight();
                }
            }

            // TODO tworzymy nowy węzeł z wartością którą chcemy ustawić
            Node newNode = new NodeImpl(value);

            // TODO gdy pojawi się wolny węzeł to zapiszmy sobie jego rodzica

            // TODO pobieramy wartość klucza tego rodzica
            if( value < parent.getKey()){
                parent.setLeft(newNode);
            }else{
                parent.setRight(newNode);
            }

            // TODO jeśli nasza wartość jest mniejsza to na rodzicu ustawiamy nowo stworzony węzeł jako lewy
            // w przeciwnym wypadku ustawiamy jako prawy
        }

    }
}