public class IfElseStatements {
    public static void main(String[] args) {
        double commissionRate;
        // double salesTotal = 10001.0;
        double salesTotal = 9999.0;

        if (salesTotal <= 10000.0)
            commissionRate = 0.02;
        else
            commissionRate = 0.05;
        System.out.println(commissionRate);
    }
}
