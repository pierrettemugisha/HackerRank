package Day23_BSTLevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by PierretteMugisha on 2016-10-31.
 */
public class Solution {
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }

    private static void levelOrder(Node root) {
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        Node node;

        do {
            node = nodes.remove();
            System.out.print(node.data + " ");
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        } while (!nodes.isEmpty());
    }
}
