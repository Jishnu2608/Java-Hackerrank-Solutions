import java.util.*;

public class stdinStdout2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        double num2 = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();
        
        sc.close();
        
        System.out.println("String: "+str);
        System.out.println("Double: "+num2);
        System.out.println("Int: "+num1);
    }
}
