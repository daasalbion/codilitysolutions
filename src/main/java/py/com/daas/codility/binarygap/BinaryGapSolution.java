package py.com.daas.codility.binarygap;

/**
 * @author Ing. Derlis Argüello <derlisarguello01@gmail.com>
 */
public class BinaryGapSolution {

    public static int solution(int n) {
        if (n == 0) {
            return 0;
        }
        String binary = Integer.toBinaryString(n);
        System.out.println("binary " + binary);
        char [] binaryArray = binary.toCharArray();
        int nCounter = 0;//counter
        int maxNCounter = 0;//counter
        int oneFirst = 0;//first one
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == "1".charAt(0)) {
                if (i > oneFirst) {
                    nCounter = i - oneFirst - 1;
                    oneFirst = i;
                }
                if (nCounter > maxNCounter) {
                    maxNCounter = nCounter;
                }
            }
        }
        return maxNCounter;
    }

}
