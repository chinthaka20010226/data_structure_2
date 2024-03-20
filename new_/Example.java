import java.util.*;


/*
public class Example {
    public static int fact(int x){
        int fact = 1;

        while(x > 0){
            fact = fact * x;
            x = x - 1;
        }

        return fact;
    }

    public static void main(String[] args) {
        // System.out.println("Hello world !");

        Scanner input = new Scanner(System.in);

        System.out.println("Input the number : ");
        int number = input.nextInt();

        if(number >= 0){
            System.out.println("Result is "+fact(number));
        }
        else{
            System.out.println("Input number is Invalid");
        }
    }
}
*/







class TreeNode{
    int key;
    TreeNode left,right;

    public TreeNode(int key){
        this.key = key;
        left = right = null;
    }
}


class BinarySearchTree{
    TreeNode root;

    public BinarySearchTree(){
        root = null;
    }

    public void insert(int key){

        TreeNode node = new TreeNode(key);
        
        if(root == null){
            System.out.println("Insert value to the Root");
            root = node;
            return;
        }

        TreeNode current = root;

        while(true){
            if(current.key > key){
                if(current.left == null){
                    System.out.println("Insert value to the left of " + current.key);
                    current.left = node;
                    return;
                }
                else{
                    current = current.left;
                }
            }
            else if(current.key < key){
                if(current.right == null){
                    System.out.println("Insert value to the right of " + current.key);
                    current.right = node;
                    return;
                }
                else{
                    current = current.right;
                }
            }
            else{
                System.out.println("This value already inserted");
                return;
            }
        }

    }


    public boolean search(int val){
        TreeNode current = root;

        while(true){
            if(current.key > val){
                System.out.println("Searching value from left of " + current.key);
                current = current.left;
            }
            else if(current.key < val){
                System.out.println("Searching value from right of " + current.key);
                current = current.right;
            }
            else{
                return true;
            }
        }
    }
}


public class Example{
    public static void main(String args[]){
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(8);
        bst.insert(6);
        bst.insert(3);
        bst.insert(12);

        System.out.println("Searching vlaue is " + bst.search(3));
    }
}