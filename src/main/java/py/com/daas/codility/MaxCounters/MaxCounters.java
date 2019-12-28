package py.com.daas.codility.MaxCounters;

/**
 * @author Ing. Derlis Argüello <derlisarguello01@gmail.com>
 */
public class MaxCounters {

    public static int[] solution(int N, int[] A) {
        int              n   = A.length;
        int [] b = new int[N];
        int max = 0;
        int maxFill = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] >= 1 && A[i] <= N) {
                if (b[A[i]-1] < maxFill) {
                    b[A[i]-1] = maxFill;
                }
                b[A[i]-1] += 1;
                if (b[A[i]-1] > max) {
                    max = b[A[i]-1];
                }
            } else if(A[i] > N) {
                maxFill = max;
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (b[i] < maxFill) {
                b[i] = maxFill;
            }
        }

        return b;
    }

    public static void main(String[] args) {
        int[] A   = {3, 4, 4, 6, 1, 4, 4};
        int[]   sol = solution(5, A);
        for (int i = 0; i < sol.length; i++) {
            System.out.println("solution " + sol[i]);
        }
    }
}
