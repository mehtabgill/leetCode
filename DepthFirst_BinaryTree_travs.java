
  
public class BinaryTree{
    Node root;

    BinaryTree(){
        root=null;
    }


    void printPostorder(Node root){

        if(root == null){
            return;
        }
        printPostorder(root.left);

        printPostorder(root.right);

        System.out.println(root.key);

    }

    void printInorder(Node root){

        if(root == null){
            return;
        }

        printInorder(root.left);

        System.out.println(root.key);

        printInorder(root.right);

    }

    void printPreorder(Node root){
        if(root == null){
            return;
        }

        System.out.println(root.key);
        printPreorder(root.left);
        printPreorder(root.right);

    }


    // Wrappers over above recursive functions 
    void printPostorder()  {     printPostorder(root);  } 
    void printInorder()    {     printInorder(root);   } 
    void printPreorder()   {     printPreorder(root);  } 

    public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
        System.out.println("Preorder traversal of binary tree is "); 
        tree.printPreorder(); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.printPostorder(); 
    } 
}

public class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 