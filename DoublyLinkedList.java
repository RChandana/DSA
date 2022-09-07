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
        
        while (temp.next != null)
        temp = temp.next;
      temp.next = new_node;
      new_node.prev = temp;
    }
    void deleteNode(Node del_node) {
      if (head == null || del_node == null) {
        return;
      }
      if (head == del_node) {
        head = del_node.next;
      }
      if (del_node.next != null) {
        del_node.next.prev = del_node.prev;
      }
      if (del_node.prev != null) {
        del_node.prev.next = del_node.next;
      }
  
    }
    
    public void printlist(Node node) {
      Node last = null;
      while (node != null) {
        System.out.print(node.data + "->");
        last = node;
        node = node.next;
      }
      System.out.println();
    }
  
