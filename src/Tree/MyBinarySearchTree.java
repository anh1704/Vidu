package Tree;

public class MyBinarySearchTree {
    public TreeNode mRoot;

    public MyBinarySearchTree() {

    }

    public TreeNode insert(TreeNode root, int value){
        TreeNode newNode = new TreeNode(value);
        //TH1: root == null
        if(root == null){
            root = new TreeNode(value);
            return root;
        }else {
            TreeNode temp = root;
            while(true){
                if(value > temp.value){
                    if(temp.right == null) {
                        temp.right = newNode;
                        break;
                    }else{
                        temp = temp.right;
                    }
                }else{  // value < temp.value
                    if(temp.left == null){
                        temp.left = newNode;
                        break;
                    }else {
                        temp = temp.left;
                    }
                }
            }
            return root;
        }
    }

    // de quy
    public TreeNode insertIntoBST(TreeNode root, int value){
        if(root == null){
            return new TreeNode(value);
        }

        if(value < root.value){
            if(root.left == null){
                root.left = new TreeNode(value);
            }else{
                insertIntoBST(root.left, value);
            }
        }else{
            if(root.right == null){
                root.right = new TreeNode(value);
            }else{
                insertIntoBST(root.right, value);
            }
        }
        return root;
    }
}
