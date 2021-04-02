import java.io.*;


public class InsertNodeAtTheHeadOfLinkedList {

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

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();

        int[] input = {141, 302, 164, 530, 474};

        for (int i = 0; i < input.length; i++) {

            int llistItem = input[i];

            SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem);

            llist.head = llist_head;

        }
        printSinglyLinkedList(llist.head);
    }
}
