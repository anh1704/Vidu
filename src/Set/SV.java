package Set;

public class SV implements Comparable<SV> {
    private String name;
    private double dtb;

    public SV(String name, double dtb) {
        this.name = name;
        this.dtb = dtb;
    }

    public String getName() {
        return name;
    }

    public double getDtb() {
        return dtb;
    }

    @Override
    public int compareTo(SV o) {
        return 0;
    }
}
