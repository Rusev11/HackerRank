import java.io.BufferedWriter;
import java.io.IOException;

public class MergeTwoSortedLinkedLists {

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

    public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
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
            if (currentNode1.data != currentNode2.data) {
                return false;
            }
        }
        if (currentNode1.next != null || currentNode2.next != null) {
            return false;
        } else {
            return true;
        }

    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedList mergedList = new SinglyLinkedList();
        SinglyLinkedListNode currentNode1 = head1;
        SinglyLinkedListNode currentNode2 = head2;
        if (head1 == null) {
            if (head2 != null) {
                return head2;
            }
        }
        if (head2 == null) {
            if (head1 != null) {
                return head1;
            }
        }
        while (currentNode1 != null && currentNode2 != null) {
            if (currentNode1.data <= currentNode2.data) {
                mergedList.insertNode(currentNode1.data);
                currentNode1 = currentNode1.next;
            } else {
                mergedList.insertNode(currentNode2.data);
                currentNode2 = currentNode2.next;
            }
        }

        if (currentNode1 != null) {
            mergedList.tail.next = currentNode1;
        }
        if (currentNode2 != null) {
            mergedList.tail.next = currentNode2;
        }
        return mergedList.head;
    }

    public static void insertInLinkedList(int[] input, SinglyLinkedList list) {
        for (int i = 0; i < input.length; i++) {
            list.insertNode(input[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist1 = new SinglyLinkedList();
        SinglyLinkedList llist2 = new SinglyLinkedList();

        int[] input1 = {4, 5, 6};
        int[] input2 = {1, 2, 10};

        insertInLinkedList(input1, llist1);
        insertInLinkedList(input2, llist2);

        SinglyLinkedListNode head = mergeLists(llist1.head, llist2.head);
        printSinglyLinkedList(head);
    }
}