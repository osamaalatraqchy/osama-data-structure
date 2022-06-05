public class DoubleLinkedList {

    static class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }


    public void printNodes() {
        Node current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
class Main{
    public static void main(String[] args) {
        DoubleLinkedList dl_List = new DoubleLinkedList();
        dl_List.addNode(10);
        dl_List.addNode(20);
        dl_List.addNode(30);
        dl_List.addNode(40);
        dl_List.addNode(50);
        dl_List.addNode(77);

        dl_List.printNodes();
    }
}  