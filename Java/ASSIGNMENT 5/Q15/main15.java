package tree;
import java.util.*;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Comparator;
public class main15 {
		public static void main(String[] args) {  
			{		
				 List<Transaction> trans = Arrays.asList(
			                new Transaction(new Trader("Rafik","Delhi"),2013,100000),
			                new Transaction(new Trader("James","Chennai"),2011,2500000),
			                new Transaction(new Trader("Charlie","Delhi"),2013,300000),
			                new Transaction(new Trader("Joseph","Delhi"),2011,500000)			                
			        );
			
				 
				  //trans.stream()  
					//.filter(Transaction -> Transaction.trader.city=="Delhi")
					
				        //.forEach(product -> System.out.println("  "+product.value ));
				 
				
				  Transaction mintransaction = trans.stream()
				            .min(Comparator.comparing(Transaction::getValue))
				            .get();
				  System.out.println("Min value is "+mintransaction.getValue());
}
			}
		
}