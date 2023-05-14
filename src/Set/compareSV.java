package Set;

import java.util.Comparator;

public class compareSV implements Comparator<SV> {
    @Override
    public int compare(SV sv1, SV sv2) {
        return sv1.getName().compareTo(sv2.getName());
    }
}
