import java.text.DecimalFormat;

public class decimalFormat {

    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat();
        //df.setGroupingSize(3);
        df.applyPattern("0.0\u2030");
        double da=.2222;
        System.out.println(df.format(da));
    }
}