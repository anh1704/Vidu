package Polymorphism;

import java.util.Scanner;

class Hinhh{
    double dienTich(){
        return 0;
    }
    double chuVi(){
        return 0;
    }
}

class Hinhtronn extends Hinhh{

    double r, S, V;

    public Hinhtronn(double r) {
        this.r = r;
    }

    double dienTich(){
        S = r*r*3.14;
        return S;
    }
    double chuVi(){
        V = 2*3.14*r;
        return V;
    }
}

class Hinhtamgiacc extends Hinhh{
    int a, b, c, V;
    double S,p;

    public Hinhtamgiacc(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double dienTich(){
        p = (a+b+c)/2;
        S =  Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }

    double chuVi(){
        V = a + b +c;
        return V;
    }
}

public class Management2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        double r = sc.nextDouble();
        Hinhh hinhtron = new Hinhtronn(r);
        System.out.println("Dien tic hinh tron la: "+ hinhtron.dienTich());
        System.out.println("Chu vi hinh tron la: "+ hinhtron.chuVi());

        System.out.println("Nhap 3 canh tam giac: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Hinhh hinhtamgiac = new Hinhtamgiacc(a,b,c);
        System.out.println("Dien tich tam giac la: "+ hinhtamgiac.dienTich());
        System.out.println("Chu vi hinh tam giac la: " +(int)hinhtamgiac.chuVi());
    }
}
