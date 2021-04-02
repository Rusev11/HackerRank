import java.io.*;
import java.util.*;

public class CompareTwoLinkedLists {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1.data != head2.data) {
            return false;
        }
        SinglyLinkedListNode currentNode1 = head1;
        SinglyLinkedListNode currentNode2 = head2;

        while (currentNode1.next != null && currentNode2.next != null) {

            currentNode1 = currentNode1.next;
            currentNode2 = currentNode2.next;
            if(currentNode1.data != currentNode2.data){
                return false;
            }
        }
        if (currentNode1.next != null || currentNode2.next != null) {
            return false;
        } else {
            return true;
        }

    }

    public static void insertInLinkedList(int[] input, SinglyLinkedList list) {
        for (int i = 0; i < input.length; i++) {
            list.insertNode(input[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist1 = new SinglyLinkedList();
        SinglyLinkedList llist2 = new SinglyLinkedList();

        int[] input1 = {7, 13, 16};
        int[] input2 = {7, 13, 16};

        insertInLinkedList(input1, llist1);
        insertInLinkedList(input2, llist2);

        compareLists(llist1.head, llist2.head);
    }
}