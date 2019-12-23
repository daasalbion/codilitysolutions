package py.com.daas.codility.frogjmp;

/**
 * @author Ing. Derlis Argüello <derlisarguello01@gmail.com>
 */
public class FrogJmp {

    public static int solution(int X, int Y, int D) {
        int stepCounter = 0;
        if (X == Y) {
            return stepCounter;
        }
        return getStep(X, Y, D);
    }

    private static int getStep(int X, int Y, int D) {
        int sustraction = Y - X;
        int division = sustraction / D;
        int module = sustraction % D;
        if (module == 0) {
            return division;
        } else {
            return division + 1;
        }
    }

    public static void main(String[] args) {
        int sol = solution(10, 85, 30);
        System.out.println("solution " + sol);
    }

}
