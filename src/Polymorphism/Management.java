package Polymorphism;

class Hinh{
    void print(){
    }
}
class Hinhtron extends Hinh{
    void print(){
        System.out.println("Hinh tron");
    }
}
class Hinhtamgiac extends Hinh{
    void print(){
        System.out.println("Hinh tam giac");
    }
}

public class Management {
    public static void main(String[] args) {
        Hinh hinhtron = new Hinhtron();
        hinhtron.print();
        Hinh hinhtamgiac = new Hinhtamgiac();
        hinhtamgiac.print();

    }
}
