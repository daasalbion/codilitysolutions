package py.com.daas.codility.PermCheck;

import java.util.HashSet;

/**
 * @author Ing. Derlis Argüello <derlisarguello01@gmail.com>
 */
public class PermCheck {

    public static int solution(int[] A) {
        int              N   = A.length;
        HashSet<Integer> set = new HashSet<>();
        int result = 0;
        for (int i = 0; i < N; i++) {
            insertOrReturn(set, A[i]);
            insertOrReturn(set, i + 1);
        }
        if (set.isEmpty()) {
            result = 1;
        }
        return result;
    }

    public static void insertOrReturn(HashSet<Integer> set, Integer value) {
        if (set.contains(value)) {
            set.remove(value);
        } else {
            set.add(value);
        }
    }

    public static void main(String[] args) {
        //int[] A = {7, 5, 2, 1, 3, 6};
        //int[] A   = {2, 3, 1, 5};
        int[] A   = {4, 1, 3};
        int   sol = solution(A);
        System.out.println("solution " + sol);
    }

}
