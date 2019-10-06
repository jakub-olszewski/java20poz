package pl.sdacademy.java20poz.programowanie1.algorithms.btree;

public class NodeImpl implements Node {

    int key;
    Node left,right,parent;

    public NodeImpl(int value) {
        key = value;
    }

    @Override
    public Node getLeft() {
        return left;
    }

    @Override
    public void setLeft(Node node) {
        left = node;
    }

    @Override
    public Node getRight() {
        return right;
    }

    @Override
    public void setRight(Node node) {
        right = node;
    }

    @Override
    public int getKey() {
        return key;
    }

    @Override
    public Node getParent() {
        return parent;
    }

    @Override
    public void setParent(Node parent) {
        this.parent = parent;
    }
}
