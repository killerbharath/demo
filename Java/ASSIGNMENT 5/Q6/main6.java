package tree;
import java.util.*;
import java.util.stream.Collectors;
public class main6 {
		public static void main(String[] args) {  
			{		
				
				List<News> newslist = new ArrayList<News>();  
				 newslist.add(new News(2,"Bharath","Bharath","goodnews")); 
				 newslist.add(new News(2,"Harocky","Harocky","budget")); 
				 newslist.add(new News(3,"MSI","Messi","news")); 
				 newslist.add(new News(2,"Alex","Harocky", "badnews")); 
				 newslist.add(new News(1,"Wong","Harocky", "budget")); 
			
		
			//int i;
			
			  String result = newslist
		                .stream()
		               
		                .collect(Collectors.groupingBy(News::getCommentbyuser,Collectors.counting()))
		               
		                .entrySet()
		                
		                .stream()
		                
		                .max(Map.Entry.comparingByValue())
		                .get().getKey();
				
			  System.out.println("User posted max comments : "+result);
}
			}
		
}