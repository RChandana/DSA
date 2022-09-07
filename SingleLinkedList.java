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
  
  void deleteNode(int position){
    if (head == null)
      return;
    Node temp = head;
    if (position == 0){
      head = temp.next;
      return;
    }
    for (int i = 0; temp != null && i < position - 1; i++)
      temp = temp.next;
    if (temp == null || temp.next == null)
      return;
    Node next = temp.next.next;
    temp.next = next;
  }

  
  
