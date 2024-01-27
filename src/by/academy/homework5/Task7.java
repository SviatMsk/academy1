package by.academy.homework5;

import java.io.IOException;
import java.util.Scanner;

public class Task7 {
    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) throws IOException {
        while (node != null) {
            System.out.print(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode tail) {
        DoublyLinkedListNode rev = tail;
        while (null != rev) {
            DoublyLinkedListNode next = rev.next;
            rev.next = rev.prev;
            rev.prev = next;
            rev = rev.next;
        }
        return tail;
    }

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {

        DoublyLinkedList llist = new DoublyLinkedList();
        System.out.print(" введите количество(n) элменетов, n<1000 ! " + "\n");
        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (llistCount < 0 || llistCount > 1000) {
            System.err.println("n вне диапазона !");
            return;
        }
        System.out.println("Введите числа от 0 до 1000 ");
        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            if (llistItem >= 0 && llistItem <= 1000) {
                llist.insertNode(llistItem);
            } else {
                System.err.println("число вне диапазона");
                return;
            }
        }
        System.out.print("Обратный список ");
        DoublyLinkedListNode llist1 = reverse(llist.tail);

        printDoublyLinkedList(llist1, " ");
        scanner.close();
    }
}
