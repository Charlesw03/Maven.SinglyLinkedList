package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void testSinglyLinked() {
        //given
        Node<String> head = new Node<>("Hello");
        SinglyLinkedList<String> list = new SinglyLinkedList<>(head);
        //when
        Node<String> actual = list.getHead();
        //then
        Assert.assertEquals(head, actual);

    }

    @Test
    public void testRemove() {
        //given
        String first = "First";
        Node<String> head = new Node<>(first);
        String second = "Second";
        String third = "Third";
        String fourth = "Fourth";
        String fifth = "Fifth";
        String sixth = "Sixth";

        SinglyLinkedList<String> list = new SinglyLinkedList<>(head);

        list.add(second);
        list.add(third);
        list.add(fourth);
        list.add(fifth);
        list.add(sixth);
        //when
        list.remove(fourth);
        Node<String> actualNext = list.get(2);

        //then
        Assert.assertEquals(actualNext.getNext().getElement(), fifth);
    }




}
