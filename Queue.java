 class Node {
    int data;
    Node next;
    
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}


class Queue {
    Node front, rear;

    public Queue()
    {
        this.front = this.rear = null;
    }

    
    void enqueue(int data)
    {
        
        Node newNode = new Node(data);
        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
            return;
        }

        this.rear.next = newNode;
        this.rear = newNode;
    }


    void dequeue()
    {
        if (this.front == null)
            return;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }
}

 class Test {
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + q.front.data);
        System.out.println("Queue Rear : " + q.rear.data);
    }
}
