class myQueueMain{
    public static void main(String[] args) {
        PriorityQueueUsingLinkedList obj = new PriorityQueueUsingLinkedList();
        Node2 n1 = new Node2(100,3);
        Node2 n2 = new Node2(208,2);
        Node2 n3 = new Node2(316,5);
        Node2 n4 = new Node2(432,4);
        Node2 n5 = new Node2(564,1);
        obj.display();
        obj.enqueue(n1);
        obj.display();
        obj.enqueue(n2);
        obj.display();
        obj.enqueue(n3);
        obj.display();
        obj.enqueue(n4);
        obj.display();
        obj.dequeue();
        obj.display();
        obj.enqueue(n5);
        obj.display();
    }
}
