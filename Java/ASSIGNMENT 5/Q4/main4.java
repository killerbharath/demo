package tree;
import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Comparator;
public class main4 {
		public static void main(String[] args) {  
			{
//				List<News> newslist = new ArrayList<News>();  
//				 newslist.add(new News("green apple","green", 20,100)); 
//				 newslist.add(new News("strawberry","red", 50,200)); 
//				 newslist.add(new News("red apple","red", 50,150)); 
//				 newslist.add(new News("watermelon","green", 200,250)); 
//				 newslist.add(new News("pineapple","brown", 150,200)); 
		
				;

      
			
			}

				
			List<News> newslist = new ArrayList<News>();  
			 newslist.add(new News(2,"Bharath","hi","goodnews")); 
			 newslist.add(new News(2,"Harocky","bye","budget")); 
			 newslist.add(new News(3,"MSI","great","news")); 
			 newslist.add(new News(2,"Alex","hi", "badnews")); 
			 newslist.add(new News(1,"Wong","good", "budget")); 
		
	
		int i;
		
		  Integer result = newslist
	                .stream()
	               
	                .collect(Collectors.groupingBy(News::getNewsid,Collectors.counting()))
	               
	                .entrySet()
	                
	                .stream()
	                
	                .max(Map.Entry.comparingByValue())
	                .get().getKey();
			
		  System.out.println("News id with maximum comments : "+result);
		
		
		
		}
		
		
		





}
