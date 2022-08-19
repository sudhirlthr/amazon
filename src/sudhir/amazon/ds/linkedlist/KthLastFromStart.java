package sudhir.amazon.ds.linkedlist;

import sudhir.amazon.ds.Node;

public class KthLastFromStart {
    public static void main(String[] args){
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
        Index idx = new Index();
        Node kthNode = findKthLastFromStart(node, idx, 5);
        System.out.println("Kth Node value = "+kthNode.data);
    }
    private static Node findKthLastFromStart(Node head, Index idx, int k){
        if(head == null) return null;
        Node node = findKthLastFromStart(head.next, idx, k);
        idx.value = idx.value + 1;
        if(idx.value == k){return head;}
        return node;
    }
    private static void printList(Node head){
        Node root = head;
        if(root == null) return;
        while(root != null){
            System.out.println(root.data+" ");
            root = root.next;
        }
    }
}

class Index{
    public int value = 0;
}