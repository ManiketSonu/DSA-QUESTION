package Advanced_DSA.LinkedList;

import java.util.HashMap;

public class Copy_OfLL {
    public static void main(String[] args) {
        Node head = new Node(5,null,null);
        head.next = new Node(3,null, null);
        head.next.next = new Node(0, null, null);
        head.next.next.next = new Node(5, null, null);
        head.next.next.next.next = new Node(6, null, null);

        head.random = head.next.next;
        head.next.random = head.next.next.next.next;
        head.next.next.random = head.next;
        head.next.next.next.random = head;
        head.next.next.next.next.random = head.next.next;

        Node copywalNode = copyoflinkedlist(head);
        System.out.println("Original linked list:");
        printNode(head);
        System.out.println("Duplicate linked list:");
        printNode(copywalNode);
    }
    public static Node copyoflinkedlist(Node head) {
        if (head == null) {
            return null;
        }
        HashMap<Node, Node> hs = new HashMap<>();
        Node h2 = new Node(-1,null, null);
        Node h1 = head;
        Node tail = h2;
        while (h1 != null) {
            Node temp = new Node(h1.x, null, null);
            tail.next = temp;
            hs.put(h1, temp);
            tail = tail.next;
            h1 = h1.next;
        }
        h1 = head;
        Node newhead = h2.next;
        while (h1 != null) {
            Node copynode = hs.get(h1);
            copynode.random = hs.get(h1.random);
            h1 = h1.next;
            tail = tail.next; 
        }
        return newhead;
    }
    public static void printNode(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.x);
            if (temp.random != null) {
                System.out.print(" (random -> " + temp.random.x + ")");
            }
            System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
class Node {
    int x;
    Node next;
    Node random;
    Node(int x, Node next, Node random) {
        this.x = x;
        this.next = next;
        this.random = random;
    }
}
