import java.util.Queue; 
import java.util.LinkedList;
  
// public class BinaryTree 
// { 
//     // Root of the Binary Tree 
//     Node root; 
  
//     public BinaryTree() 
//     { 
//         root = null; 
//     }

//     int height(Node root){
//         if(root == null){
//             return 0;
//         }

//         int lhs = height(root.left);
//         int rhs = height(root.right);

//         if(lhs >= rhs){
//             return lhs+1;
//         }else{
//             return rhs+1;
//         }
//     }

//     void printLevel(Node root, int level){

//         if(root == null){
//             return ;
//         }else if(level == 1){
//             System.out.println(root.data);
//         }else{
//             printLevel(root.left, level-1);
//             printLevel(root.right, level-1);
//         }
//     }

//     void printLevelOrder(){
//         int h = height(root);
//         for(int i=1; i<=h ;i++){
//             printLevel(root, i);
//         }
//     }

//     /* Driver program to test above functions */
//     public static void main(String args[]) 
//     { 
//        BinaryTree tree = new BinaryTree(); 
//        tree.root= new Node(1); 
//        tree.root.left= new Node(2); 
//        tree.root.right= new Node(3); 
//        tree.root.left.left= new Node(4); 
//        tree.root.left.right= new Node(5); 
         
//        System.out.println("Level order traversal of binary tree is "); 
//        tree.printLevelOrder(); 
//     } 

// }

public class BinaryTree
{

        // Root of the Binary Tree 
    Node root; 

    public BinaryTree() 
    { 
        root = null; 
    }

    void printLevelOrder(){
        Queue<Node> queue = new LinkedList<Node>(); 
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.println(temp.data);
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.left != null){
                queue.add(temp.right);   
            }
        }
    }

    
    public static void main(String args[])  
    { 
        /* creating a binary tree and entering  
         the nodes */
        BinaryTree tree_level = new BinaryTree(); 
        tree_level.root = new Node(1); 
        tree_level.root.left = new Node(2); 
        tree_level.root.right = new Node(3); 
        tree_level.root.left.left = new Node(4); 
        tree_level.root.left.right = new Node(5); 
  
        System.out.println("Level order traversal of binary tree is - "); 
        tree_level.printLevelOrder(); 
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