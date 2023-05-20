package LinkedList;

public class ReverseLL_2 {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) {
            this.data = d;
            this.next = null;
        }
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



    public void IterativeAppr() {

        if(head == null || head.next == null) 
            return;

        Node prev = head;
        Node curr = head.next;

        while(curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }

        head.next = null;
        head = prev;

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
        ReverseLL_2 llist = new ReverseLL_2();

        for (int i = 5; i > 0; i--) {
            llist.addFirst(i);
        }

        llist.IterativeAppr();
        llist.printList();

    }
}
