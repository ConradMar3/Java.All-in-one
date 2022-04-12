public class UsingIncrementAndDecrementOperators {
    public static void main(String[] args) {
        // Traditional way to increment a var
        // int a = a + 1;

        // Easier increment
        // a++

        // increment or decrement operator in an assignment statement
        int a = 5;
        int b = a--;
        System.out.println(a + b);

        // expression that uses a postfix increment
        a = 5;
        b = 3;
        int c = a * b++; // c is set to 15
        System.out.println(c);

        // separate statement either before or after the expression
        b++;
        c = a * b;
        System.out.println(c);
    }
}
