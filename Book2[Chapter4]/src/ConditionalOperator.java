public class ConditionalOperator {
    public static void main(String[] args) {
        double salesTotal = 10000.0;
        int tier = (salesTotal > 10000.0) ? 1 : 0;

        int appleCount = 2;
        String msg = "You have " + appleCount + " apple"
                + ((appleCount > 1) ? "s." : ".");

        System.out.println(tier);
        System.out.println(msg);
    }
}

