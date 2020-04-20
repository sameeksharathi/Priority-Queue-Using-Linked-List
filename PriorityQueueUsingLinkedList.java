public class PriorityQueueUsingLinkedList {
    Node2 front;
    Node2 rear;
    public PriorityQueueUsingLinkedList(){
        front= null;
        rear = null;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public void enqueue(Node2 newnode){
        if(isEmpty() || newnode.priority<front.priority){
            newnode.next = front;
            front = newnode;
        }else{
            Node2 temp = front;
            while(temp.next!=null && newnode.priority>=temp.next.priority){
                  temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
        }else{
            front = front.next;
        }
    }
    public void display(){
        if(front==null){
            System.out.println("Queue is empty");
        }else{
            Node2 temp = front;
            while(temp!=null){
                System.out.print("d="+temp.data+ " p="+ temp.priority+"  ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
