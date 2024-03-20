import java.util.*;

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


    // Inserting,

    public void insert(int key){
        root = insertRec(root,key);
    }

    private TreeNode insertRec(TreeNode root,int key){
        //TreeNode node = new TreeNode(key);

        if(root == null){
            System.out.println("Insert value to the Root");
            root = new TreeNode(key);
            return root;
        }
        
        if(root.key > key){
            System.out.println("Insert value to the left of " + root.key);
            root.left = insertRec(root.left, key);
        }
        else if(root.key < key){
            System.out.println("Insert value to the right of " + root.key);
            root.right = insertRec(root.right, key);
        }
        else{
            System.out.println("Insert value already has");
        }
        return root;

    }


    // Searching

    public TreeNode search(int key){
        return searchRec(root, key);
    }

    private TreeNode searchRec(TreeNode root,int key){
        if(root == null || root.key == key){
            return root;
        }

        if(root.key > key){
            return searchRec(root.left,key);
        }
        
        return searchRec(root.right,key);
    }
}


public class Example{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("Insert value for Search : (Do you want to end -> No)");
        String val = input.nextLine();

        while(!val.equals("No")){
            // bst.insert(Integer.parseInt(val));
            
            System.out.println(bst.search(Integer.parseInt(val)) == null ? "not found" : "found");

            System.out.println("Insert value for Search : (Do you want to end -> No)");
            val = input.nextLine();
        }

        // bst.insert(8);
        // bst.insert(3);
        // bst.insert(6);
        // bst.insert(2);
        // bst.insert(10);
        // bst.insert(4);
        // bst.insert(3);

        // System.out.println(bst.search(7) == null ? "not found" : "found");





        // int[] arr = new int[5];

        // for(int i=0;i<arr.length;i++){
        //     arr[i] = i;
        // }

        // int j=0;
        // while(j<arr.length){
        //     System.out.println(arr[j]);
        //     j++;
        // }
    }
}