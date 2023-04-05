package Polymorphism;

import java.util.Scanner;

class Hinhhh{
    static double dienTich(double r){
        return r*r*3.14;
    }
    static double chuVi(double r){
        return 2*3.14*r;
    }
    static int dienTich(int a, int b, int c){
        return 0;
    }
    static int chuVi(int a, int b, int c){
        return a+b+c;
    }
}
public class napchong {
    public static void main(String[] args) {
        System.out.print("Nhap ban kinh: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(Hinhhh.dienTich(r));
        System.out.println(Hinhhh.chuVi(r));
        System.out.println("Nhap 3 canh tam giac: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Hinhhh.chuVi(a,b,c));

    }
}
