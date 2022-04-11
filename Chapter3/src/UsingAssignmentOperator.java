public class UsingAssignmentOperator {
    public static void main(String[] args) {
        int b = 10;
        int c = 20;
        int a = (b * c) / 4;

        System.out.println(a);

        /* Can use assignment operators n the middle of other expressions.
        int a;
        int b;
        a = (b = 3) * 2; // a is 6, b is 3
         */

        /* Now consider a more complicated case:
        int a;
        int b = 2;
        a = (b = 3) * b; // a is 9, b is 3
         */

        /* The parentheses are important in the previous example, without the parentheses
        the assignment operator is the last operator to be evaluated in Java’s order of precedence.
        int a;
        int b = 2;
        a = b = 3 * b; // a is 6, b is 6
         */

    }
}
