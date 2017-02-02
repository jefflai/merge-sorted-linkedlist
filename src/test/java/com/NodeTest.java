package com;

import org.junit.Test;

import org.junit.Assert;

public class NodeTest {

    @Test
    public void convertNodeToString() {
        Node node = new Node(new int[] { 1, 2, 3 });
        String expectedResult = "1,2,3";
        String actualResult = node.toString();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mergeTwoValidLists() {
        Node nodeOne = new Node(new int[] { -5, -4, 0, 4, 100 });
        Node nodeTwo = new Node(new int[] { 1, 3, 5, 500 });
        String expectedResult = "-5,-4,0,1,3,4,5,100,500";
        String actualResult = Node.merge(nodeOne, nodeTwo).toString();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mergeTwoListsWithDuplicates() {
        Node nodeOne = new Node(new int[] { 1, 2, 3, 4, 5, 5, 5 });
        Node nodeTwo = new Node(new int[] { 0, 1, 1, 2, 3, 9, 10 });
        String expectedResult = "0,1,1,1,2,2,3,3,4,5,5,5,9,10";
        String actualResult = Node.merge(nodeOne, nodeTwo).toString();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mergeTwoSingleItemLists() {
        Node nodeOne = new Node(new int[] { 1 });
        Node nodeTwo = new Node(new int[] { -1 });
        String expectedResult = "-1,1";
        String actualResult = Node.merge(nodeOne, nodeTwo).toString();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mergeWithNullList() {
        Node nodeOne = new Node(new int[] { 1, 2, 3, 5 });
        Node nodeTwo = null;
        String expectedResult = "1,2,3,5";
        String actualResult = Node.merge(nodeOne, nodeTwo).toString();
        Assert.assertEquals(expectedResult, actualResult);
    }

}
