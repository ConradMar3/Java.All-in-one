public class ifSyntax {
    public static void main(String[] args) {
        {
            int i, j;
            i = 100;
            j = 200;

            if(i > 0) {
                String s = "The value of i is " + i;
                System.out.println(s);
            }
        }
    }
}
