import java.util.*;

public class discreate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.addNode(val);
        }
        Node newHead = list.segregate(list.head);
        list.display(newHead);
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Function to segregate even and odd nodes
    Node segregate(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node oddStart = null, oddEnd = null;
        Node evenStart = null, evenEnd = null;
        Node temp = head;

        // Separate even and odd nodes
        while (temp != null) {
            if (temp.data % 2 == 0) { // Even
                if (evenStart == null) {
                    evenStart = temp;
                    evenEnd = temp;
                } else {
                    evenEnd.next = temp;
                    evenEnd = evenEnd.next;
                }
            } else { // Odd
                if (oddStart == null) {
                    oddStart = temp;
                    oddEnd = temp;
                } else {
                    oddEnd.next = temp;
                    oddEnd = oddEnd.next;
                }
            }
            temp = temp.next;
        }

        // If no even numbers, return odd list
        if (evenStart == null) {
            return oddStart;
        }

        // If no odd numbers, return even list
        if (oddStart == null) {
            return evenStart;
        }

        // Connect even list to odd list
        evenEnd.next = oddStart;
        oddEnd.next = null; // Important: Prevent cycles

        return evenStart; // Return head of modified list
    }

    // Add a node to the linked list
    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Display linked list
    void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


