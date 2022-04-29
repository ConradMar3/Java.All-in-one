public class BlockIfElseStatement {
    public static void main(String[] args) {
        double commissionRate;
        double salesTotal = 10001.0;

        if (salesTotal <= 10000.0) {
            commissionRate = 0.02;
            // level1Count++;
            commissionRate++;
        } else {
            commissionRate = 0.05;
            //level2Count++;
            commissionRate++;
        }
        System.out.println(commissionRate);
    }
}
