package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    private Node<T> head;


    public SinglyLinkedList(Node head){
        this.head = head;
    }

    public void add(T element) {
        Node<T> temp = head;

        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new Node<T>(element));
    }

    public Boolean contains(T element) {
        Boolean result = false;
        Node<T> tempNode = head;

        while (result != null) {
            if (tempNode.getElement().equals(element)) {
                result = true;
                break;
            } else {
                tempNode = tempNode.getNext();
            }
        }
        return result;

    }

    public Integer size() {
        Integer counter = 1;
        Node<T> tempNode = head;

        while (tempNode.getNext() != null) {
            counter++;
            tempNode = tempNode.getNext();
        }
        return counter;
    }

    public Node<T> get(int index) {
        int counter = 0;
        Node tempNode = head;
        while (counter < index && tempNode.getNext() != null) {
            counter++;
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }

    public Integer find(T element){
    Node tempNode= head;
    Integer counter= 1;
    while(tempNode.getNext().getElement()!= element){
        if(tempNode.getNext()==null){
            return -1;
        }
        tempNode = tempNode.getNext();
        counter++;
    }
        return counter;
    }

    public SinglyLinkedList<T> copy(SinglyLinkedList<T> copiedList){
       return this;
    }

    public void remove(T element){
        int index = find(element);
        if(index == -1){
            throw new UnsupportedOperationException();
        } else if(index == 0){
            head = head.getNext();
        }else if(index==size()-1){
                get(index-1).setNext(null);
        }else{
            this.get(index-1).setNext(get(index+1));
        }
    }

    public Node<T> getHead() {
        return head;
    }
}


 class Node<T> {
    private Node<T> next;
    private T element;

    public Node(T element) {
        this.element = element;
        this.next = null;
    }

    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}



