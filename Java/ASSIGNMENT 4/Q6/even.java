package lambda;
import java.util.function.UnaryOperator;
import java.util.ArrayList;
import java.util.Arrays;

public class even {

	
	 
	
	    public static void main(String[] args) throws CloneNotSupportedException 
	    {
	        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("hello", "fjshdvf", "aodkadij", "wss", "YTh"));
	         
	        System.out.println(alphabets);
	         
	        alphabets.replaceAll( new MyOperator() );  
	         
	        System.out.println(alphabets);
	        System.out.println();
	    }
	}
	 
	class MyOperator implements UnaryOperator<String> 
	{
	    @Override
	    public String apply(String t) {
	        return t.toUpperCase();
	    }
	}

	


