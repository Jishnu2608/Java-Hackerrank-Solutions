import java.util.*;

public class javaEOD {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int i=0;
        do
        {
            System.out.println(i+1 + " " + s);
            if(sc.hasNextLine())
            {
               s=sc.nextLine(); 
            }
            else
            s=null;
            i=i+1;
            
        }while(s!=null);
        sc.close();
    }
}
