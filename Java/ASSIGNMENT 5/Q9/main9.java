package tree;
import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Comparator;
public class main {
		public static void main(String[] args) {  
			{		
				 List<Transaction> trans = Arrays.asList(
			                new Transaction(new Trader("Rafik","Chennai"),2013,100000),
			                new Transaction(new Trader("James","Chennai"),2011,2500000),
			                new Transaction(new Trader("Charlie","Mumbai"),2013,300000),
			                new Transaction(new Trader("Joseph","Bangalore"),2011,500000)			                
			        );
			
				 trans.stream()  
			.filter(Transaction -> Transaction.trader.city=="Chennai")
		        .forEach(product -> System.out.println("Chennai  "+product.trader.name )); 
		        
				 
				 trans.stream()  
					.filter(Transaction -> Transaction.trader.city=="Mumbai")
				        .forEach(product -> System.out.println("Mumbai  "+product.trader.name )); 
				 trans.stream()  
					.filter(Transaction -> Transaction.trader.city=="Bangalore")
				        .forEach(product -> System.out.println("Bangalore  "+product.trader.name )); 
				 
}
			}
		
}