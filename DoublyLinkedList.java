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
    
    public void insertAfter(Node prev_node, int data) {
      if (prev_node == null) {
        System.out.println("Previous node cannot be null");
        return;
      }
  
      Node new_node = new Node(data);
      new_node.next = prev_node.next;
      prev_node.next = new_node;
      new_node.prev = prev_node;
      if (new_node.next != null)
        new_node.next.prev = new_node;
    }
    void insertEnd(int data) {
      Node new_node = new Node(data);
      Node temp = head;
      new_node.next = null;
      if (head == null) {
        new_node.prev = null;
        head = new_node;
        return;
      }
