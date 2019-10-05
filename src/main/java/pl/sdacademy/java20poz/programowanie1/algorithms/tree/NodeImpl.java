package pl.sdacademy.java20poz.programowanie1.algorithms.tree;

import java.util.LinkedList;
import java.util.List;

public class NodeImpl<T> implements Node<T>{

    private T data;
    private List<Node<T>> children;
    private Node<T> parent;

    public NodeImpl(){
        parent = null;
        children = new LinkedList<>();
    }

    public NodeImpl(Node<T> parent){
        this();
        this.parent = parent;
    }

    public NodeImpl(Node<T> parent, T data) {
        this(parent);
        this.data = data;
    }

    @Override
    public Node<T> getParent() {
        return parent;
    }

    @Override
    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    /**
     * zwracamy rozmiar listy przechowującej
     * potomków węzła
     * @return
     */
    @Override
    public int getDegree() {
        return children.size();
    }

    @Override
    public Node<T> getChild(int i) {
        return children.get(i);
    }

    @Override
    public boolean isLeaf() {
        return children.isEmpty();
    }

    @Override
    public Node<T> addChild(Node<T> child) {
        child.setParent(this);
        children.add(child);
        return child;
    }

    @Override
    public Node<T> addChild(T data) {
        NodeImpl<T> child = new NodeImpl<T>(this, data);
        children.add(child);
        return child;
    }

    public String toString() {
        return data.toString();
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
        return children;
    }

    @Override
    public Node<T> getRightSibling() {
        return null;
    }
}
