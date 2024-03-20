import java.util.Scanner;

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

    // insert -> without Recursion
    // public void insert(int key){
    //     TreeNode node = new TreeNode(key);

    //     if(root == null){
    //         System.out.println("Insert value to the Root");
    //         root = node;
    //         return;
    //     }

    //     TreeNode current = root;

    //     while(true){
    //         if(key < current.key){
    //             if(current.left == null){
    //                 System.out.println("Insert value to the left of " + current.key);
    //                 current.left = node;
    //                 return;
    //             }
    //             else{
    //                 current = current.left;
    //             }
    //         }
    //         else if(key > current.key){
    //             if(current.right == null){
    //                 System.out.println("Insert value to the right of " + current.key);
    //                 current.right = node;
    //                 return;
    //             }
    //             else{
    //                 current = current.right;
    //             }
    //         }
    //         else{
    //             System.out.println("Insert value already has");
    //         }
    //     }

    // }


    // insert -> with Recursion
    public void insert(int key){
        root = insertRec(root, key);
    }

    private TreeNode insertRec(TreeNode root,int key){
        if(root == null){
            System.out.println("Insert value to the Root");
            root = new TreeNode(key);
            return root;
        }

        if(key < root.key){
            System.out.println("Insert value to the left of " + root.key);
            root.left = insertRec(root.left, key);
        }
        else if(key > root.key){
            System.out.println("Insert value to the right of " + root.key);
            root.right = insertRec(root.right, key);
        }
        else{
            System.out.println("Insert value already has");
        }
        return root;
    }


    // search -> without Recursion
    // public TreeNode search(int key){
    //     if(root == null || root.key == key){
    //         return root;
    //     }

    //     TreeNode current = root;

    //     while(true){
    //         if(key < current.key){
    //             current = current.left;
    //         }
    //         else if(key > current.key){
    //             current = current.right;
    //         }
    //         else{
    //             return current;
    //         }
    //     }

    // }


    // search -> with Recursion
    public TreeNode search(int key){
        return searchRec(root, key);
    }

    private TreeNode searchRec(TreeNode root,int key){
        if(root == null || root.key == key){
            return root;
        }

        if(key < root.key){
            return searchRec(root.left, key);
        }
        
        return searchRec(root.right, key);
    }
}

public class Example{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("Input value for Insert(Do you want to end -> 'End') : ");
        String var1 = input.nextLine();

        while(!var1.equals("End")){
            bst.insert(Integer.parseInt(var1));

            System.out.println("Input value for Inserted(Do you want to end -> 'End') : ");
            var1 = input.nextLine();
        }

        System.out.println("Input value for Search(Do you want to end -> 'End') : ");
        String var2 = input.nextLine();

        while(!var2.equals("End")){
            System.out.println(bst.search(Integer.parseInt(var2)) == null ? "not fond" : "found");

            System.out.println("Input value for Search(Do you want to end -> 'End') : ");
            var2 = input.nextLine();
        }
    }
}