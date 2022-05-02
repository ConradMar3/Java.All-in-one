public class ExclusiveOrOperator {
    public static void main(String[] args) {
        int switch1;
        int switch2;

        switch1 = 1;
        switch2 = -1;

        if (switch1 == switch2)
            System.out.println("Trouble, the switches are the same.");
        else
            System.out.println("Ok, the switches are different.");

        if (((switch1 == 1) && (switch2 == -1)) ||
                ((switch1 != 1) && (switch2 != -1)))
            System.out.println("Trouble, the switches are the same.");
        else
            System.out.println("Ok, the switches are the same.");

        if ((switch1 == 1) ^ (switch2 == -1))
            System.out.println("OK, the switches are different.");
        else
            System.out.println("Trouble! The switches are the same");
    }
}
