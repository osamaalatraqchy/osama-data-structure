public class Stack {

    Node root;

    static class Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data)
    {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
        }
        else {
            Node temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop()
    {
        if (root == null) {
            System.out.println("Stack is Empty");
        }
        else {
            int popped = root.data;
            root = root.next;
            return popped;
        }
        return 0;
    }

    public int peek()
    {
        if (root == null) {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            return root.data;
        }
    }

    // Driver code
    public static void main(String[] args)
    {

        Stack sll = new Stack();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop()
                + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}