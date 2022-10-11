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
