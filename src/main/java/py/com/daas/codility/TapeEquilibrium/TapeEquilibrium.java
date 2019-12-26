package py.com.daas.codility.TapeEquilibrium;

/**
 * @author Ing. Derlis Argüello <derlisarguello01@gmail.com>
 */
public class TapeEquilibrium {

    public static int solution(int[] A) {
        int N = A.length;
        int left = 0;
        int rigth = 0;
        int difference = 0;
        int minDifference = 0;
        for (int i = 0; i < N; i++) {
            left += A[i];
            rigth += A[(N-1)-i];
            difference = Math.abs(left - rigth);
            if (difference < minDifference) {
                minDifference = difference;
            }
        }
        return minDifference;
    }

    public static void main(String[] args) {
        //int[] A = {7, 5, 2, 1, 3, 6};
        //int[] A   = {2, 3, 1, 5};
        int[] A   = {3, 1, 2, 4, 3};
        int   sol = solution(A);
        System.out.println("solution " + sol);
    }

}
