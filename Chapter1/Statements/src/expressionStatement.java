public class expressionStatement {
    public static void main(String[] args) {
        int i, a, b;

        a = 0;
        b = 1;

        i = a + b;

        double salesTax = 9.99;
        double invoiceTotal = 0.8;
        int taxRate = 1;

        salesTax = invoiceTotal * taxRate;
        System.out.println(i + "" + salesTax + "" + invoiceTotal + "" + taxRate);
    }
}
