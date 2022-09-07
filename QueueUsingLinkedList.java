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
