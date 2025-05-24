class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

class LinkList {

    Node head;

    public void add(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    
    public void display() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void loopchecking() {
        
    }


}


public class Loopdetection {
 public static void main(String[] args) {
    
 }   
}
