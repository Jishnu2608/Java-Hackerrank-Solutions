import java.util.*;
import java.text.*;

public class currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat u=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat i=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat c=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f=NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us=u.format(payment);
        String in=i.format(payment);
        String ch=c.format(payment);
        String fr=f.format(payment);

        System.out.println("US: " +us );
        System.out.println("India: " + in );
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);
    }
}
