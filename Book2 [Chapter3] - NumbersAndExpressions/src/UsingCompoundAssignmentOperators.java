public class UsingCompoundAssignmentOperators {
    public static void main(String[] args) {
        /* The statement
        int a += 10;
         */

        /* Is equivalent to
        a = a + 10;
         */

        /* Also, the statement
        int z *= 2;
         */

        /* Is equivalent to
        z = z * 2;
         */

        /* To prevent confusion, use compound assignment expressions by themselves, not
        in combination with other expressions.
         */

        int a = 2;
        int b = 3;
        a *= b + 1;
        System.out.println(a);
    }
}
