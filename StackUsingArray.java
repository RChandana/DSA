class Stack_2{
    private int arr[];
    private int top;
    private int capacity;

    Stack_2(int size) {
      arr = new int[size];
      capacity = size;
      top = -1;
    }
    
   public void push(int x) {
      if (isFull()) {
        System.out.println("OverFlow\nProgram Terminated\n");
        System.exit(1);
      }
  
      System.out.println("Inserting " + x);
      arr[++top] = x;
    }
    public int pop() {
      if (isEmpty()) {
        System.out.println("STACK EMPTY");
        System.exit(1);
      }
      return arr[top--];
    }

