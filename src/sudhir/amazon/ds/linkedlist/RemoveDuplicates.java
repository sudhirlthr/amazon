package sudhir.amazon.ds.linkedlist;

import sudhir.amazon.ds.Node;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(20);
        node.next.next = new Node(10);
        node.next.next.next = new Node(30);
        node.next.next.next.next = new Node(30);
        node.next.next.next.next.next = new Node(10);
        node.next.next.next.next.next.next = new Node(40);
        node.next.next.next.next.next.next.next = new Node(40);
        node.next.next.next.next.next.next.next.next = new Node(60);
        printList(node);
        removedDuplicates(node);
        printList(node);
    }
    static void removedDuplicates(Node head){
         // usingBuffer(head);
        withoutBuffer(head);
    }

    static void withoutBuffer(Node head) {
        // TC = O(N^2)
        while (head != null ){
            Node runner = head;
            while (runner.next != null){
                if (runner.next.data == head.data)
                    runner.next = runner.next.next;
                else
                    runner = runner.next;
            }
            head = head.next;
        }
    }

    static void usingBuffer(Node node){
        // TC = O(N)
        Set<Integer> lists = new HashSet<Integer>();
        Node previous = null;
        while (node != null) {
            if (lists.contains(node.data))
                previous.next = node.next;
            else {
                lists.add(node.data);
                previous = node;
            }
            node = node.next;
        }
    }
    static void printList(Node head){
        System.out.println();
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

}
