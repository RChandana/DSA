Class Node{
    int key, height;
    Node left, right;
 
    Node(int d) {
        key = d;
        height = 1;
    }
}

class AVL{
 
    Node root;
    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }
    
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    Node right_Rotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
        return x;
    }
    
        Node left_Rotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return y;
    }

    int get_Balance(Node N) {
        if (N == null)
            return 0;
 
        return height(N.left) - height(N.right);
    }
    
        Node insert(Node node, int key) {
        if (node == null)
            return (new Node(key));
 
        if (key < node.key)
            node.left = insert(node.left, key);

        else if (key > node.key)
            node.right = insert(node.right, key);

        else 
            return node;
        node.height = 1 + max(height(node.left), height(node.right));
        int balance = get_Balance(node);

        if (balance > 1 && key < node.left.key)
            return right_Rotate(node);

        if (balance < -1 && key > node.right.key)
            return left_Rotate(node);

        if (balance > 1 && key > node.left.key) {
            node.left = left_Rotate(node.left);
            return right_Rotate(node);
        }

        if (balance < -1 && key < node.right.key) {
            node.right = right_Rotate(node.right);
            return left_Rotate(node);
        }
        return node;
    }
    
    void pre_Order(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            pre_Order(node.left);
            pre_Order(node.right);
        }
    }
    public static void main(String[] args) {
        AVL avl_tree = new AVL();
        avl_tree.root = avl_tree.insert(avl_tree.root, 3);
        avl_tree.root = avl_tree.insert(avl_tree.root, 2);
        avl_tree.root = avl_tree.insert(avl_tree.root, 1);
        avl_tree.root = avl_tree.insert(avl_tree.root, 4);
        avl_tree.root = avl_tree.insert(avl_tree.root, 5);
        avl_tree.root = avl_tree.insert(avl_tree.root, 6);
        avl_tree.root = avl_tree.insert(avl_tree.root, 7);
        avl_tree.root = avl_tree.insert(avl_tree.root, 8);
        avl_tree.root = avl_tree.insert(avl_tree.root, 9);
        System.out.println("The AVL Tree is : ");
        avl_tree.pre_Order(avl_tree.root);
    }
}
