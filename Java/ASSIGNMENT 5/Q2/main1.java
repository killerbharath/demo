package tree;
import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Comparator;
public class main {
		public static void main(String[] args) {  
			{
				List<Fruit> productsList = new ArrayList<Fruit>();  
				 productsList.add(new Fruit("green apple","green", 20,100)); 
				 productsList.add(new Fruit("strawberry","red", 50,200)); 
				 productsList.add(new Fruit("red apple","red", 50,150)); 
				 productsList.add(new Fruit("watermelon","green", 200,250)); 
				 productsList.add(new Fruit("pineapple","brown", 150,200)); 
		
		//1
			productsList.stream()  
	        //.filter(Fruit -> Fruit.calories<100)
	        .filter(Fruit -> Fruit.color=="green")
	       // .sorted((e1, e2) -> e2.calories.compareTo(e1.calories))

        //  .collect(Collectors.toList())
	      
            //.sorted(Comparator.comparing(Fruit::calories).reversed()).collect(Collectors.toList()) 
	        .forEach(product -> System.out.println("green"+"  "+product.name )); 
		//2	
			productsList.stream()  
	        //.filter(Fruit -> Fruit.calories<100)
	        .filter(Fruit -> Fruit.color=="red")
	        //.sorted((e1, e2) -> e2.calories.compareTo(e1.calories))

        //  .collect(Collectors.toList())
	      
            //.sorted(Comparator.comparing(Fruit::calories).reversed()).collect(Collectors.toList()) 
	        .forEach(product -> System.out.println("red"+"  "+product.name )); 
			
			
			
			productsList.stream()  
	        //.filter(Fruit -> Fruit.calories<100)
	        .filter(Fruit -> Fruit.color=="brown")
	        //.sorted((e1, e2) -> e2.calories.compareTo(e1.calories))

        //  .collect(Collectors.toList())
	      
            //.sorted(Comparator.comparing(Fruit::calories).reversed()).collect(Collectors.toList()) 
	        .forEach(product -> System.out.println("brown"+"  "+product.name )); 
			
			
			
			}

				
	}}