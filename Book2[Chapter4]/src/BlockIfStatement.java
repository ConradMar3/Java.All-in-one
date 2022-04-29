public class BlockIfStatement {
    public static void main(String[] args) {
        double commissionRate = 0.0;
        double salesTotal = 10001.0;

        if (salesTotal > 10000.0) {
            commissionRate = 0.05;
            double commission = salesTotal * commissionRate;
            System.out.println(commission);
        }
    }
}
