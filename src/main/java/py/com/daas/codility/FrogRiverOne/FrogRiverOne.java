package py.com.daas.codility.FrogRiverOne;

import java.util.HashSet;

/**
 * @author Ing. Derlis Argüello <derlisarguello01@gmail.com>
 */
public class FrogRiverOne {

    public static int solution(int X, int[] A) {
        int              N   = A.length;
        HashSet<Integer> set = new HashSet<>();
        int returnValue = -1;

        for (int i = 1; i <= X; i++) {
            set.add(i);
        }

        for (int i = 0; i < N; i++) {
            if (A[i] <= X) {
                insertOrReturn(set, A[i]);
                if (set.isEmpty()) {
                    return i;
                }
            }
        }

        return returnValue;
    }

    public static void insertOrReturn(HashSet<Integer> set, Integer value) {
        if (set.contains(value)) {
            set.remove(value);
        }
    }

    public static void main(String[] args) {
        int[] A   = {1, 3, 1, 4, 2, 3, 5, 4};
        int   sol = solution(5, A);
        System.out.println("solution " + sol);
    }

}
