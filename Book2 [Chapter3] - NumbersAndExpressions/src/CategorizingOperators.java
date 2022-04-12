public class CategorizingOperators {
    public static void main(String[] args) {

        // Divide two int values, result is an integer.

       /* int a = 21, b = 6;
        double answer = a / b // answer = 3.0
       */

        // You can cast one of the operands to a double before the division.

        int a = 21;
        int b = 6;
        double answer = (double) a / b; // answer = 3.5

        System.out.println(answer);
    }
}
