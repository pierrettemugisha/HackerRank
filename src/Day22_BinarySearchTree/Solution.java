package Day22_BinarySearchTree;

import java.util.Scanner;

/**
 * Created by PierretteMugisha on 2016-10-30.
 */
public class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }

    private static int getHeight(Node root) {
        if (root != null) {
            int leftDepth = getHeight(root.left);
            int rightDepth = getHeight(root.right);

            return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
        } else {
            return -1;
        }
    }

    private static Node insert(Node root, int data) {
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
}
