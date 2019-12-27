package py.com.daas.codility.TapeEquilibrium;

/**
 * @author Ing. Derlis Argüello <derlisarguello01@gmail.com>
 */
public class TapeEquilibrium {

    public static int solution(int[] A) {
        int   N    = A.length;//must have least two elements
        int leftSum       = 0;
        int rigthSum      = A[0];
        int minDifference = Integer.MAX_VALUE;

        for (int i = 1; i < N; i++) {
            leftSum += A[i];
        }

        minDifference = getDifference(minDifference, leftSum, rigthSum);

        for (int i = 1; i < N - 1; i++) {
            rigthSum += A[i];
            leftSum -= A[i];
            minDifference = getDifference(minDifference, leftSum, rigthSum);
        }

        return minDifference;
    }

    public static int getDifference(int minDifference, int a, int b) {
        int difference = Math.abs(a - b);
        if (difference < minDifference) {
            minDifference = difference;
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
