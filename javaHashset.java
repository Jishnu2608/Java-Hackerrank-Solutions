
import java.util.*;

public class javaHashset {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
        Set set =  new HashSet();
        for (int i =0 ; i<t ;i++)
        {
            set.add(pair_left[i]+"_"+pair_right[i]);
            System.out.println(set.size());
        }
        s.close();
   }
}