package Tree;

public class MyBinarySearchTree {
    public TreeNode mRoot;

    public MyBinarySearchTree() {

    }

    // tao cay
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

    // dung de quy
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

    // tim phan tu trong cay
    public TreeNode searchBST(TreeNode root, int value){
        if(root == null){
            return null;
        }
        if(value < root.value){
            return searchBST(root.left, value);
        }else if(value > root.value){
            return searchBST(root.right, value);
        }else{  // root.value = value
            return  root;
        }
    }

    // Node - Left - Right
    public static void PreOder(TreeNode curentNode){
        if(curentNode == null){
            return;
        }

        //Duyet currentNode truoc
        System.out.print(curentNode.value + " ");

        //Duyet ben trai
        PreOder(curentNode.left);
        //Duyet ben phai
        PreOder(curentNode.right);
    }

    // Left - Node - Right
    public static void InOder(TreeNode currentNode){
        if(currentNode == null){
            return;
        }
        //Duyet ben trai
        InOder(currentNode.left);

        //Duyet currentNode truoc
        System.out.print(currentNode.value + " ");

        //Duyet ben phai
        InOder(currentNode.right);
    }

    // Left - Right - Node
    public static void PostOder(TreeNode currentNode){
        if(currentNode == null){
            return;
        }
        //Duyet ben trai
        PostOder(currentNode.left);

        //Duyet ben phai
        PostOder(currentNode.right);


        //Duyet currentNode truoc
        System.out.print(currentNode.value + " ");
    }

    public int maxDepth(TreeNode root){
        // b1: dieu kien dungf
        if(root == null){
            return 0;
        }

        // b2: Cong thuc de quy
        int chieuCaoCayBenTrai = maxDepth(root.left);
        int chieuCaoCayBenPhai = maxDepth(root.right);

        int result = Math.max(chieuCaoCayBenPhai, chieuCaoCayBenTrai) + 1;
        return result;
    }



}

