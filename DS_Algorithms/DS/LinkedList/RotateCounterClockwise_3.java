package LinkedList;

public class RotateCounterClockwise_3 {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void rotate(int k) {
        if(k==0)
            return;

        Node current = head;

        int count = 1;
        while(count<k && current!=null) {
            current = current.next;
            count++;
        }

        if(current == null)
            return;

        Node kthNode = current;

        while (current.next != null)
            current = current.next;

        current.next = head;

        head = kthNode.next;

        kthNode.next = null;
    }

        public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        RotateCounterClockwise_3 llist = new RotateCounterClockwise_3();

        for (int i = 60; i >= 10; i -= 10)            
            llist.addFirst(i);
        

        llist.rotate(7);
        llist.printList();

    }

}
