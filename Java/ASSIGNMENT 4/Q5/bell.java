package lambda;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

interface robo {
    char operation(String a);
 }
public class bell {

	public static void main(String[] args) {
		
		ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("hello", "fjshdvf", "aodkadij", "wss", "YTh"));
		
		robo mat=(String a ) -> {
			int n = a.length();
        char first = a.charAt(0);
       return (a.charAt(0));
	
        
       
		};
		for (String i : alphabets) {
			  
            // accessing each element of array
            String x = i;
            System.out.print(mat.operation(x)+"  \n");
        }
	}

}
