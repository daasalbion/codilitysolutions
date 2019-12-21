package py.com.daas.codility.oddOccurrencesInArray;

import java.util.HashSet;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        int middle = A.length/2;
        HashSet<Integer> set = new HashSet<>();
        set.add(A[middle]);
        return doRecursiveSolution(set, A, 0, A.length - 1);
    }

    private static Integer doRecursiveSolution(HashSet<Integer> set, int[] A, int start, int ends) {
        if ((ends - start) > 1) {
            insertOrDelete(set, A[start]);
            insertOrDelete(set, A[ends]);
            return doRecursiveSolution(set, A, start+1, ends-1);
        }

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
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        int sol = solution(A);
        System.out.println("solution " + sol);
    }

}
