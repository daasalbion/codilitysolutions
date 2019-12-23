package py.com.daas.codility.permmissingelem;

/**
 * @author Ing. Derlis Argüello <derlisarguello01@gmail.com>
 */
public class PermMissingElem {

    public static int solution(int[] A) {
        int n = A.length;
        return getFactorial(A, n);
    }

    private static int getFactorial(int[] A, int n) {
        int fact0 = 1;
        int fact1 = 1;
        int nplusOne = n + 1;
        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                A[i] = 1;
                nplusOne = 1;
            }
            fact0 = fact0 * A[i];
            fact1 = fact1 * (i + 1);
        }
        fact1 = fact1 * (nplusOne);
        int r = fact1/fact0;
        return r;
    }

    public static void main(String[] args) {
        //int[] A = {7, 5, 2, 1, 3, 6};
        int[] A = {2, 3, 1, 5};
        int sol = solution(A);
        System.out.println("solution " + sol);
    }

}
