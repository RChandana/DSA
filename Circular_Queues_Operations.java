public class CircularQueue {
    int SIZE = 5;
    int front, rear;
    int items[] = new int[SIZE];

    CircularQueue(){
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if(front == 0 && rear == SIZE - 1){
            return true;
        }
        if(front == rear + 1){
            return true;
        }
        return false;
    }
    
    boolean isEmpty(){
        if(front == -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    void enQueue(int element){
        if(isFull()){
            System.out.println("Queue is Full!!");
        }
        else{
            if(front == -1){
                front = 0;
                rear = (rear + 1) % SIZE;
                items[rear] = element;
                System.out.println("Inserted : " + element);
            }
        }
    }
    
    int deQueue(){
        int element;
        if(isEmpty()){
            System.out.println("The queue is empty!!");
            return (-1);
        }
        else{
            element = items[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
                front = (front + 1) % SIZE;
            }
            return (element);
        }
    }

