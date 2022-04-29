public class ElseIfStatements {
    public static void main(String[] args) {
        double commissionRate;
        //double salesTotal = 10001.0;
        //double salesTotal = 999.9;
        double salesTotal = 5000.0;

        if (salesTotal >= 10000.0)
            commissionRate = 0.05;
        else if (salesTotal >= 5000.0)
            commissionRate = 0.035;
        else if (salesTotal >= 1000.0)
            commissionRate = 0.02;
        else
            commissionRate = 0.0;
        System.out.println(commissionRate);
    }
}
