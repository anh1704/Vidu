package Set;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Management {
    public static void main(String[] args) {
        SortedSet<SV> set = new TreeSet<>(new compareSV());

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();

        for( int i=1; i<=n; i++){
            System.out.print("Nhap ten sinh vien " + i + " : ");
            String name = sc.next();
            System.out.print("Nhap diem trung binh cua sinh vien thu " + i + " : ");
            double dtb = sc.nextDouble();

            SV sv = new SV(name,dtb);
            set.add(sv);
        }
        System.out.println("Danh sach sinh vien: ");
        for( SV sv : set){
            System.out.println(sv.getName() + "\t" + sv.getDtb());
        }

        SortedSet<SV> dtbSet = set.headSet(new SV("",5));
        System.out.println("Danh sach sinh vien co dtb < 5: ");
        for(SV sv : dtbSet){
            System.out.println(sv.getName() + "\t" + sv.getDtb());
        }
    }
}
