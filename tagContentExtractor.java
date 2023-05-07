import java.util.*;
import java.util.regex.*;

public class tagContentExtractor{
	public static void main(String[] args){
		String pattern = "<([^>]+)>([^<>]+)</\\1>";
        Pattern r = Pattern.compile(pattern);
        
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
              Matcher m = r.matcher(line);
            boolean findMatch = true;
            while(m.find( )){
                System.out.println(m.group(2));
                findMatch = false;
            } 
            if(findMatch) {
                System.out.println("None");
            }
			
			testCases--;
		}
        in.close();
	}
}



