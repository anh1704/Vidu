package Tree;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        MyBinaryTree myBinaryTree = new MyBinaryTree();
//        myBinaryTree.init();
//
//        System.out.println("Done");

        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();

//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 5);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 1);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 6);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 0);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 3);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 7);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 2);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 4);

//        System.out.println("DONE");

//        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();

        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 5);
        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 3);
        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 9);
        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 5);
        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 12);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 7);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 2);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 4);

//        System.out.println("DONE");


//        TreeNode n0 = new TreeNode(5);
//        TreeNode n1 = new TreeNode(3);
//        TreeNode n2 = new TreeNode(9);
//        TreeNode n3 = new TreeNode(5);
//        TreeNode n4 = new TreeNode(12);
//        TreeNode n5 = new TreeNode(5);
//        TreeNode n6 = new TreeNode(6);
//        TreeNode n7 = new TreeNode(7);

//        n0.left = n1; n0.right = n2;
//        n1.left = n3; n1.right = n4;
//        n2.right = n5;
//        n4.left = n6; n4.right = n7;

        MyBinarySearchTree.PreOder(myBinarySearchTree.mRoot);
        System.out.println();
        MyBinarySearchTree.InOder(myBinarySearchTree.mRoot);
        System.out.println();
        MyBinarySearchTree.PostOder(myBinarySearchTree.mRoot);
        System.out.println();

//        myBinarySearchTree.maxDepth(myBinarySearchTree.mRoot);
        System.out.println(myBinarySearchTree.maxDepth(myBinarySearchTree.mRoot));


    }
}
