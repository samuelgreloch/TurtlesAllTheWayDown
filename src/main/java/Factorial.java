public class Factorial {
    public static int factorial(int i) {

        if (i < 0){

            throw new IllegalArgumentException("Input is non negitive");

        }

        int result = 1;
        for (int j = 1; j <= i; j++){
            result*= i;
        }

        return result;
    }
}
