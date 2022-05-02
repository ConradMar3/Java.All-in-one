public class CombiningLogicalOperators {
    public static void main(String[] args) {
        double salesTotal = 999.9;
        double salesClass = 1;
        double CommissionRate = 100;

        if ((salesTotal < 1000.0) || ((salesTotal < 5000.0) &&
                (salesClass == 1)) || ((salesTotal < 10000.0) &&
                (salesClass == 2)))
            CommissionRate = 0.0;
        System.out.println(CommissionRate);
    }
}
