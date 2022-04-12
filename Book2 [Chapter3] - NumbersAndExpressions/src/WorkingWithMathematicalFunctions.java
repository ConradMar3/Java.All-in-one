public class WorkingWithMathematicalFunctions {
    public static void main(String[] args) {
        int a = 27;
        int b = -32;
        a = (int) (Math.abs(a) * Math.signum(b)); // a is now -27
        System.out.println(a + " " + b);

        // pow method
        double x = 4.0;
        double y = Math.pow(x, 2); // a is now 16;
        System.out.println(x + " " + y);

        // Simply multiplying the number by itself  is often just as easy and jus as readable
        double x1 = 4.0;
        double y1 = x1 * x1; // a is now 16;
        System.out.println(x1 + " " + y1);

    }
}
