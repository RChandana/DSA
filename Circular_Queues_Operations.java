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

