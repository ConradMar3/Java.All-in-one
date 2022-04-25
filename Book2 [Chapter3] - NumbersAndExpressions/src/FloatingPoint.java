import java.text.NumberFormat;

public class FloatingPoint {
    public static void main(String[] args) {
        float x = 0.1f;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(10);
        System.out.println(nf.format(x));
    }
}
