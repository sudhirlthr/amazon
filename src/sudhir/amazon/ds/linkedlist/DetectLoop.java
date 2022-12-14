package sudhir.amazon.ds.linkedlist;

import sudhir.amazon.ds.Node;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DetectLoop {
    public static void main(String[] args) throws IOException {
        Node head = new Node(1);
        Node copy = head;
        String line = "73 39 71 24 28 71 31 14 35 60 3 48 45 43 76 33 5 75 44 59 47 41 39 40 23 63 4 2 9 44 5 33 3 75 56 62 18 6 28 52 17 30 19 62 24 14 14 28 40 9 7 38 1 45 29 55 59 32 57 19 76 13 52 30 40 27 11 57 65 70 60 1 19 30 14 42 75 59 70 67 68 28 24 68 72 53 43 2 36 51 20 31 15 71 12 54 18 55 62 2 44 41 34 63 22 48 56 17 26 45 3 13 72 58 33 15 62 27 16 18 29 36 80 43 58 44 17 75 18 30 28 13 23 62 27 44 61 3 12 6 47 46 51 71 24 35 37 37 61 53 6 9 40 6 51 17 1 19 44 18 49 23 62 71 36 9 66 16 11 78 54 9 43 24 31 18 58 68 7 70 72 12 30 31";
        String[] inputs = line.split(" ");
        for (String input : inputs) {
            Node temp = new Node(Integer.parseInt(input));
            head.next = temp;
            head = head.next;
        }
        printNode(copy);
    }

    private static void printNode(Node copy) {
        int count = 0;
        while (copy.next != null){
            System.out.print(copy.data+",");
            copy = copy.next;
            count++;
        }
        System.out.println("\nTotal # elements are: "+count);
    }

    private static boolean detectLoop(Node head){
        return false;
    }
}
