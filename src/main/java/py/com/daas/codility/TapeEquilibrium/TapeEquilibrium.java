package py.com.daas.codility.TapeEquilibrium;

/**
 * @author Ing. Derlis Argüello <derlisarguello01@gmail.com>
 */
public class TapeEquilibrium {

    public static int solution(int[] A) {
        int   N    = A.length;//must have least two elements
        int[] tmpA = new int[N - 1];
        tmpA[tmpA.length-1] = A[N - 1];
        int leftSum       = A[0];
        int rigthSum      = tmpA[tmpA.length-1];
        int difference    = 0;
        int minDifference = Integer.MAX_VALUE;
        int j             = 0;
        for (int i = 1; i < (N - 1); i++) {
            j = (N - 1) - i;
            leftSum += A[i];
            rigthSum += A[j];
            if (i >= j) {
                minDifference = getDifference(minDifference, rigthSum, A[i - 1]);
                minDifference = getDifference(minDifference, leftSum, tmpA[i]);
            }
            A[i] = leftSum;
            tmpA[j-1] = rigthSum;
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
