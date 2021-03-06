import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PrintTheElementsOfLinkedList {

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

        public SinglyLinkedList() {
            this.head = null;
        }

    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) throws IOException {
        while (node != null) {
            System.out.println(node.data);

            node = node.next;

        }
    }

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null) {
            head = new SinglyLinkedListNode(data);
            return head;
        }
        SinglyLinkedListNode tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = new SinglyLinkedListNode(data);
        return head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();
        int[] input = {141, 302, 164, 530, 474};

        for (int i = 0; i < input.length; i++) {

            int llistItem = input[i];

            SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);

            llist.head = llist_head;

        }


        printSinglyLinkedList(llist.head, "\n");


        scanner.close();
    }
}
