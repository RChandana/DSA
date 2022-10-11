public class Lab_2_Queue { 
    private Node front, rear; 
    private int queueSize; 
    
    private class Node { 
        int data;
        Node next;
    }
    public Lab_2_Queue(){
        front = null;
        rear = null;
        queueSize = 0;
    }
    public boolean isEmpty(){
        return (queueSize == 0);
    }
    public int dequeue(){
        int data = front.data;
        front = front.next;
        if (isEmpty()){
            rear = null;
        }
        queueSize--;
        System.out.println("Element " + data+ " removed from the queue");
        return data;
    }
