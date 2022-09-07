// Write a Program to implement single linked list and its operations. 

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
  
  boolean search(Node head, int key){
    Node current = head;
    while (current != null){
      if (current.data == key)
        return true;
      current = current.next;
      System.out.println("Searched a node ");
    }
    return false;
  }
  
  void sortLinkedList(Node head){
    Node current = head;
    Node index = null;
    int temp;
    if (head == null){
      return;
    } 
    else{
      while (current != null){
        index = current.next;
        while (index != null){
          if (current.data > index.data) {
            temp = current.data;
            current.data = index.data;
            index.data = temp;
          }
          index = index.next;
        }
        current = current.next;
      }
    }
  }
  
  public void printList(){
    Node tnode = head;
    while (tnode != null){
      System.out.print(tnode.data + " ");
      tnode = tnode.next;
    }
  }
  
  public static void main(String[] args){
    LinkedList linked_list = new LinkedList();
    linked_list.insertAtEnd(1);
    linked_list.insertAtBeginning(2);
    linked_list.insertAtBeginning(3);
    linked_list.insertAtEnd(4);
    linked_list.insertAfter(linked_list.head.next, 5);
    System.out.println("Linked list: ");
    linked_list.printList();
    System.out.println("\nAfter deleting an element: ");
    linked_list.deleteNode(3);
    linked_list.printList();
    System.out.println();
    int item_to_find = 3;
    if (linked_list.search(linked_list.head, item_to_find))
      System.out.println(item_to_find + " is found");
    else
      System.out.println(item_to_find + " is not found");
    linked_list.sortLinkedList(linked_list.head);
    System.out.println("\nSorted List: ");
    linked_list.printList();
  }
}
