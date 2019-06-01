package areSimilar;

import java.util.ArrayList;
import java.util.List;

public class areSimilarAlgorithm {

    public static boolean areSimilar(int[] a, int[] b) {
        List<Integer> diff = new ArrayList<>();
        for(int i = 0; i < a.length; ++i) {
            if(a[i] != b[i]) diff.add(i);
        }
        int diffCount = diff.size();
        if(diffCount == 0) return true;
        if(diffCount == 2) {
            int index1 = diff.get(0);
            int index2 = diff.get(1);
            if(a[index1] == b[index2] && a[index2] == b[index1]) return true;
        }
        return false;
    }
}
