package py.com.daas.codility.permmissingelem;

import java.util.HashSet;

/**
 * @author Ing. Derlis Argüello <derlisarguello01@gmail.com>
 */
public class PermMissingElem {

    public static int solution(int[] A) {
        int N = A.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            insertOrDelete(set, i + 1);
            insertOrDelete(set, A[i]);
        }
        insertOrDelete(set, N + 1);
        return set.iterator().next();
    }

    public static void insertOrDelete(HashSet<Integer> set, Integer value) {
        if (set.contains(value)) {
            set.remove(value);
        } else {
            set.add(value);
        }
    }

    public static void main(String[] args) {
        //int[] A = {7, 5, 2, 1, 3, 6};
        //int[] A   = {2, 3, 1, 5};
        int[] A   = {1};
        int   sol = solution(A);
        System.out.println("solution " + sol);
    }

}
