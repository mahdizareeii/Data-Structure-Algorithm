package com.example.datastructurealgorithm.datastructure.nolinear.treesdatastructure;

public class TreesDataStructure {
    public static void main(String[] args) {
        // Creating a binary tree with integer data
        TreeNode<Integer> root = new TreeNode<>(10);
        root.left = new TreeNode<>(5);
        root.right = new TreeNode<>(15);

        // Creating a binary tree with string data
        TreeNode<String> stringRoot = new TreeNode<>("Hello");
        stringRoot.left = new TreeNode<>("World");
        stringRoot.right = new TreeNode<>("Java");

        // Traversing the binary tree with integer data
        System.out.println("In-order traversal (Integer tree):");
        inOrderTraversal(root);

        // Traversing the binary tree with string data
        System.out.println("\nIn-order traversal (String tree):");
        inOrderTraversal(stringRoot);
    }

    // In-order traversal: left-root-right
    public static <T> void inOrderTraversal(TreeNode<T> node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }
}
