package tree;
import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Comparator;
public class main8 {
		public static void main(String[] args) {  
			{		
			List<Transaction> translist = new ArrayList<Transaction>();  
			 translist.add(new Transaction(2011,100000)); 
			 translist.add(new Transaction(2011,20000)); 
			 translist.add(new Transaction(2015,200000)); 
			 translist.add(new Transaction(2011,2000000)); 
			 translist.add(new Transaction(2021,2000)); 
			 
			translist.stream()  
		       
		        .filter(Transaction -> Transaction.year==2011)
		        .sorted((e1, e2) -> e1.value.compareTo(e2.value))
		        .forEach(product -> System.out.println(""+"  "+product.value )); 
		        
}
			}
		
}