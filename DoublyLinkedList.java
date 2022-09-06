public class Lab_2_Doubly_LinkedList {
    Node head;
  
    class Node {
      int data;
      Node prev;
      Node next;
  
      Node(int d) {
        data = d;
      }
    }
  
    public void insertFront(int data) {
      Node newNode = new Node(data);
      newNode.next = head;
      newNode.prev = null;
      if (head != null)
        head.prev = newNode;
      head = newNode;
    }
