public class LoopDetect {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static class Link {
        Node head;

        void addNode(int val) {
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
        
        void display() {
            Node temp=head;

            while (temp != null) {
                System.out.print(temp.val + " --> ");
                temp = temp.next;
            }
            System.out.println("Null");
        }

        static boolean loopDetect(Node head) {
            Node slow = head;
            Node fast = head;

            while (slow != null && fast != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
                return false;
            }
        }

        static void createLoop(int position) {
            if (position <= 0) {
                // invalid
            }

            Node temp = head;
            Node loopPosition=null;
            int counter = 1;

            while (temp != null && temp.next != null) {
                if(counter == looppo)
            }
        }
    }
}
