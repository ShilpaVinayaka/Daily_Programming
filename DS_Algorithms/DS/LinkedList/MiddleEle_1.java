package LinkedList;

public class MiddleEle_1 {

    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void push(int new_data) {
        Node newNode = new Node(new_data);

        //Insert Front
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node tNode = head;
        while(tNode != null) {
            System.out.print(tNode.data +"->");
            tNode = tNode.next;
        }
        System.out.println("NULL");
    }

    public void printMiddle() {
        Node slowPtr = head;
        Node fastPtr = head;

        while(fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }

        System.out.println("Middle Element = " + slowPtr.data);
    }



    public static void main(String[] args) {
        MiddleEle_1 llist = new MiddleEle_1();

        for (int i = 5; i >0; i--) {
            llist.push(i);
        }
        llist.printList();
        llist.printMiddle();
    }
    
}
