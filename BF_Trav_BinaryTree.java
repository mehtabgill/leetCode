
  
public class BinaryTree 
{ 
    // Root of the Binary Tree 
    Node root; 
  
    public BinaryTree() 
    { 
        root = null; 
    }

    int height(Node root){
        if(root == null){
            return 0;
        }

        int lhs = height(root.left);
        int rhs = height(root.right);

        if(lhs >= rhs){
            return lhs+1;
        }else{
            return rhs+1;
        }
    }

    void printLevel(Node root, int level){

        if(root == null){
            return ;
        }else if(level == 1){
            System.out.println(root.data);
        }else{
            printLevel(root.left, level-1);
            printLevel(root.right, level-1);
        }
    }

    void printLevelOrder(){
        int h = height(root);
        for(int i=1; i<=h ;i++){
            printLevel(root, i);
        }
    }

    /* Driver program to test above functions */
    public static void main(String args[]) 
    { 
       BinaryTree tree = new BinaryTree(); 
       tree.root= new Node(1); 
       tree.root.left= new Node(2); 
       tree.root.right= new Node(3); 
       tree.root.left.left= new Node(4); 
       tree.root.left.right= new Node(5); 
         
       System.out.println("Level order traversal of binary tree is "); 
       tree.printLevelOrder(); 
    } 

}


public class Node 
{ 
    int data; 
    Node left, right; 
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 