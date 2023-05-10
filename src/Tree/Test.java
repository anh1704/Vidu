package Tree;

public class Test {
    public static void main(String[] args) {
//        MyBinaryTree myBinaryTree = new MyBinaryTree();
//        myBinaryTree.init();
//
//        System.out.println("Done");

//        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
//
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 5);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 1);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 6);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 0);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 3);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 7);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 2);
//        myBinarySearchTree.mRoot = myBinarySearchTree.insert(myBinarySearchTree.mRoot, 4);
//
//        System.out.println("DONE");

        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();

        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 5);
        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 1);
        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 6);
        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 0);
        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 3);
        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 7);
        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 2);
        myBinarySearchTree.mRoot = myBinarySearchTree.insertIntoBST(myBinarySearchTree.mRoot, 4);

        System.out.println("DONE");
    }
}
