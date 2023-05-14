package Tree;

import java.util.Scanner;

public class Baitap {

    // dinh nghia nut tren cay
    public class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value){
            this.value = value;
        }
    }

    // khai bao cay nhi phan tim kiem
    public class BinarySearchTree{
        public Node Root;

        public BinarySearchTree(){

        }

        // tao cay nhi phan
        public Node insert(Node root, int value){
            if(root == null){
                return new Node(value);
            }

            if(value < root.value){
                if(root.left == null){
                    root.left = new Node(value);
                }else{
                    insert(root.left, value);
                }
            }else{
                if(root.right == null){
                    root.right = new Node(value);
                }else{
                    insert(root.right, value);
                }
            }
            return root;
        }

        // in gia tri cac nut tren cay
        public static void preOder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.value + " ");
            preOder(root.left);
            preOder(root.right);
        }

        //tinh tong cac nut chan
        public int sumEven(Node root){
            if(root == null){
                return 0;
            }
            int sum = 0;
            if(root.value % 2 == 0){
                sum += root.value;
            }
            sum += sumEven(root.left) + sumEven(root.right);
            return sum;
        }

        // dem xem co bao nhieu nut la nut la
        public int countLeaf(Node root){
            if(root == null){
                return 0;
            }
            if(root.left == null && root.right == null){
                return 1;
            }

            return countLeaf(root.left) + countLeaf(root.right);
        }

        // tinh gia tri trung binh cua cac nut tren cay
        private int sum(Node root){
            if(root == null){
                return 0;
            }
            return root.value + sum(root.left) + sum(root.right);
        }

        private int count(Node root){
            if(root == null){
                return 0;
            }
            return 1 + count(root.right) + count(root.left);
        }

        private double average(Node root){
            if(root == null){
                return 0;
            }
            double sum = sum(root);
            int count = count(root);
            return sum/count;
        }

        // nut chia het cho x ma khong chia het cho y
        public void printDivisible( int x, int y, Node root){
            if(root == null){
                return;
            }

            if((root.value % x == 0) && (root.value % y != 0)){
                System.out.print(root.value + " ");
            }

            printDivisible(x,y,root.left);
            printDivisible(x,y,root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Baitap baitap = new Baitap();
        BinarySearchTree binarySearchTree = baitap.new BinarySearchTree();

        System.out.print("Nhap so nut ban muon tao: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Nhap gia tri cho nut thu " + i + " :");
            int value = sc.nextInt();
            binarySearchTree.Root = binarySearchTree.insert(binarySearchTree.Root, value);
        }

        System.out.print("Cac nut tren cay: ");
        BinarySearchTree.preOder(binarySearchTree.Root);
        System.out.println();

        System.out.println("Tong cac nut chan tren cay: " + binarySearchTree.sumEven(binarySearchTree.Root));
        System.out.println("So nut la tren cay: " + binarySearchTree.countLeaf(binarySearchTree.Root));
        System.out.println("Gia tri trung binh cua cac nut tren cay: " + binarySearchTree.average(binarySearchTree.Root));

        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        System.out.print("Nhay y: ");
        int y = sc.nextInt();
        System.out.print("Nut chia het cho " + x + " ma khong chia het cho " + y + " la: ");
        binarySearchTree.printDivisible(x,y, binarySearchTree.Root);

    }

}
