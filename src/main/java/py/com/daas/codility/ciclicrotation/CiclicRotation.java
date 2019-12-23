package py.com.daas.codility.ciclicrotation;

/**
 * @author Ing. Derlis Argüello <derlisarguello01@gmail.com>
 */
public class CiclicRotation {

    public static int[] solution(int[] A, int K) {
        int length = A.length;
        if (K == 0 || length == 0 || length == 1) {
            return A;
        }
        K = getK(length, K);
        int[] tmpA = new int[length];
        for (int j = 0; j < length; j++) {
            int newIndex = getIndex(length, j, K);
            tmpA[newIndex] = A[j];
        }
        return tmpA;
    }

    private static int getK(int max, int K) {
        int newK = K;
        if (K > max) {
            newK = K/max;
            newK = K - (newK*max);
        }
        return newK;
    }

    private static int getIndex(int max, int currentIndex, int K) {
        int newIndex = (currentIndex + K) - max;
        if (newIndex < 0)
            newIndex = max + newIndex;

        return newIndex;
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int[] sol = solution(A, 12);
        System.out.println("solution " + sol.toString());
    }

}
