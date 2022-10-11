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
