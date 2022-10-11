public class BinaryTreeTraversal {
    int item;
    BinaryTreeTraversal left, right;
  
    public BinaryTreeTraversal(int key) {
    item = key;
    left = right = null;
    }
  }

  class BinaryTree {
    BinaryTreeTraversal root;
  
    BinaryTree() {
    root = null;
    }
  
    void post_order(BinaryTreeTraversal node) {
    if (node == null)
      return;
        
         post_order(node.left);
    post_order(node.right);
    System.out.print(node.item + "  ");
    }
  
    void inorder(BinaryTreeTraversal node) {
    if (node == null)
      return;
        
            inorder(node.left);

    System.out.print(node.item + "  ");

    inorder(node.right);
    }
  
    void pre_order(BinaryTreeTraversal node) {
    if (node == null)
      return;
  

    System.out.print(node.item + "  ");

    pre_order(node.left);
   
    pre_order(node.right);
    }
