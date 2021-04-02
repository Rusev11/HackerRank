import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReverseLinkedList {

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
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }


    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        if (llist == null) {
            llist = new SinglyLinkedListNode(data);
            return llist;
        }
        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
        newHead.next = llist;
        return newHead;
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        if (position == 0) {
            SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
            newHead.next = head;
            return newHead;
        }
        SinglyLinkedListNode tempNode = head;
        for (int i = 1; i < position; i++) {
            tempNode = tempNode.next;
        }
        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
        newHead.next = tempNode.next;
        tempNode.next = newHead;
        return head;
    }

    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if (head == null) {
            return head;
        }
        if (position == 0) {
            return head.next;
        }

        SinglyLinkedListNode tempNode = head;
        for (int i = 1; i < position; i++) {
            tempNode = tempNode.next;
        }
        if (tempNode.next.next == null) {
            tempNode.next = null;
            return head;
        }
        tempNode.next = tempNode.next.next;
        return head;
    }

    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if (head.next == null) {
            return head;
        }

        SinglyLinkedListNode currentNode = head;
        SinglyLinkedListNode nextNode = currentNode.next;
        SinglyLinkedListNode previousNode;

        while (nextNode != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            nextNode = currentNode.next;
            currentNode.next = previousNode;
        }
        return currentNode;
    }

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();

        int[] input = {7, 13, 16};

        for (int i = 0; i < input.length; i++) {

            int llistItem = input[i];

            SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem);

            llist.head = llist_head;
        }

//        insertNodeAtPosition(llist.head, 1, 2);


        reverse(llist.head);
        printSinglyLinkedList(llist.head);

    }
}
