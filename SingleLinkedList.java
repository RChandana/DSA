class LinkedList{
  Node head;
  class Node{
    int data;
    Node next;

    Node(int d){
      data = d;
      next = null;
    }
  }
  
  public void insertAtBeginning(int new_data){
    
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
  }

  public void insertAfter(Node prev_node, int new_data){
    if (prev_node == null){
      System.out.println("The given previous node cannot be null");
      return;
    }
    Node new_node = new Node(new_data);
    new_node.next = prev_node.next;
    prev_node.next = new_node;
  }
  
  public void insertAtEnd(int new_data){
    Node new_node = new Node(new_data);

    if (head == null){
      head = new Node(new_data);
      return;
    }
    new_node.next = null;

    Node last = head;
    while (last.next != null)
      last = last.next;

    last.next = new_node;
    return;
  }
  
  
