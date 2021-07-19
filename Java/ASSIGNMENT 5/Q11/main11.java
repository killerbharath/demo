package tree;
import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Comparator;
public class main11 {
		public static void main(String[] args) {  
			{		
				 List<Transaction> trans = Arrays.asList(
			                new Transaction(new Trader("Rafik","pune"),2013,100000),
			                new Transaction(new Trader("James","Chennai"),2011,2500000),
			                new Transaction(new Trader("Charlie","Mumbai"),2013,300000),
			                new Transaction(new Trader("Joseph","pune"),2011,500000)			                
			        );
			
				 trans.stream()  
					//.filter(Transaction -> Transaction.trader.city=="pune")
					.sorted((e1, e2) -> e1.trader.name.compareTo(e2.trader.name))
				        .forEach(product -> System.out.println("  "+product.trader.name )); 
		        
				 
				
				 
}
			}
		
}