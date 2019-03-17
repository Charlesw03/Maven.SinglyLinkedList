package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {
    @Test
    public void testConstructor1() {
        //given
        Object obj = new Object();
        Node<Object> node = new Node(obj);
        Node<Object> next = null;
        //when
        Object actual = node.getElement();
        Object expected = node.getNext();
        //then
        Assert.assertEquals(obj,actual);
        Assert.assertEquals(next,expected);
    }





}
