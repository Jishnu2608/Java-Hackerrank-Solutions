import java.util.*;

public class intToString {

public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int num=scan.nextInt();
   
   scan.close();
   
   String convert= Integer.toString(num);
   if(convert.getClass().getName()=="java.lang.String"&&num>=-100 &&num<=100)
   {
       System.out.println("Good job");
   }
   else
   {
       System.out.println("Wrong Answer");
   }
}
}
