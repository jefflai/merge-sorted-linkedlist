package com;

public class Node {
    Node next;
    int data;

    public Node() {

    }

    public Node(int[] values) {
        if (values != null) {
            Node current = this;
            for (int i = 0; i < values.length; i++) {
                current.data = values[i];
                if (i < values.length - 1) {
                    current.next = new Node();
                    current = current.next;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current = this;
        while (current != null) {
            builder.append(current.data);
            current = current.next;
            if (current != null) {
                builder.append(",");
            }
        }

        return builder.toString();
    }

    public static Node merge(Node nodeOne, Node nodeTwo) {
        if (nodeOne == null)
            return nodeTwo;
        if (nodeTwo == null)
            return nodeOne;

        Node head;
        if (nodeOne.data < nodeTwo.data) {
            head = nodeOne;
        } else {
            head = nodeTwo;
            nodeTwo = nodeOne;
            nodeOne = head;
        }

        while (nodeOne.next != null) {
            if (nodeOne.next.data > nodeTwo.data) {
                Node tmp = nodeOne.next;
                nodeOne.next = nodeTwo;
                nodeTwo = tmp;
            }
            nodeOne = nodeOne.next;
        }
        if (nodeOne.next == null) {
            nodeOne.next = nodeTwo;
        }
        return head;
    }

}
