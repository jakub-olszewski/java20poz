package pl.sdacademy.java20poz.programowanie1.algorithms.tree;

import java.util.List;

public class NodeImpl<T> implements Node<T>{

    public NodeImpl(Node<T> parent, T data) {
        // todo implementacja
    }

    @Override
    public Node<T> getParent() {
        return null;
    }

    @Override
    public void setParent(Node<T> parent) {

    }

    @Override
    public T getData() {
        return null;
    }

    @Override
    public void setData(T data) {

    }

    @Override
    public int getDegree() {
        return 0;
    }

    @Override
    public Node<T> getChild(int i) {
        return null;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public Node<T> addChild(Node<T> child) {
        return null;
    }

    @Override
    public Node<T> addChild(T data) {
        return null;
    }

    @Override
    public Node<T> removeChild(int i) {
        return null;
    }

    @Override
    public void removeChildren() {

    }

    @Override
    public Node<T> getLeftMostChild() {
        return null;
    }

    @Override
    public List<Node<T>> getChildren() {
        return null;
    }

    @Override
    public Node<T> getRightSibling() {
        return null;
    }
}
