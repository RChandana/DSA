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
      
          public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new BinaryTreeTraversal(4);
    tree.root.left = new BinaryTreeTraversal(23);
    tree.root.right = new BinaryTreeTraversal(13);
    tree.root.left.left = new BinaryTreeTraversal(7);
    tree.root.left.right = new BinaryTreeTraversal(11);
  
    System.out.println("The Inorder traversal of the Binary Tree is  : ");
    tree.inorder(tree.root);
    System.out.println("  ");
  
    System.out.println("\nThe Preorder traversal of the Binary Tree is  : ");
    tree.pre_order(tree.root);
    System.out.println("  ");
  
    System.out.println("\nThe Postorder traversalof the Binary Tree is  : ");
    tree.post_order(tree.root);
    System.out.println("  ");
    }
  }
