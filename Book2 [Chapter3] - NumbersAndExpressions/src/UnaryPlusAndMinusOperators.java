public class UnaryPlusAndMinusOperators {
    public static void main(String[] args) {
        int a = 5; // a is 5
        int b = -a; // b is -5
        int c = -b; // c is +5

        System.out.println(a + " " + b + " " + c);

        // Unary plus operator doesn't actually do anything.
        a = -5;
        b = +a; // b is -5
        a = 5; // a is now 5
        c = +a; // c is 5

        System.out.println(a + " " + b + " " + c);

        // Operators with complex expressions
        a = 3;
        b = 4;
        c = 5;
        int d = a * -(b + c); // d is -27

        System.out.println(d);

    }

}
