package py.com.daas.codility.TapeEquilibrium;

/**
 * @author Ing. Derlis Argüello <derlisarguello01@gmail.com>
 */
public class TapeEquilibrium {

    public static int solution(int[] A) {
        int N = A.length;
        int leftSum = 0;
        int rigthSum = 0;
        int difference = 0;
        int minDifference = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 1; i < (N - 1); i++) {
            j = (N-1)- i;
            leftSum = (A[i] + A[i - 1]);
            rigthSum = (A[j] + A[j + 1]);
            if (i >= j) {
                difference = Math.abs(leftSum - A[j+1]);
                if (difference < minDifference) {
                    minDifference = difference;
                }
            } else {
                A[i] = leftSum;
                A[j] = rigthSum;
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
