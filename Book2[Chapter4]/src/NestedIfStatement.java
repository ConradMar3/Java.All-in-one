public class NestedIfStatement {
    public static void main(String[] args) {
        double commissionRate;
        // int salesClass = 1;
        int salesClass = 2;
        double salesTotal = 10001.0;

        if (salesClass == 1)
            if (salesTotal < 10000.0)
                commissionRate = 0.02;
            else
                commissionRate = 0.04;
        else if (salesTotal < 10000.0)
            commissionRate = 0.025;
        else
            commissionRate = 0.05;
        System.out.println(commissionRate);
    }
}
