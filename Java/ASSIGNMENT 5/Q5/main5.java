package tree;
import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Comparator;
public class main5 {
		public static void main(String[] args) {  
			{		
			List<News> newslist = new ArrayList<News>();  
			 newslist.add(new News(1,"Bharath","hi","goodnews")); 
			 newslist.add(new News(2,"Harocky","bye","budget")); 
			 newslist.add(new News(3,"MSI","great","news")); 
			 newslist.add(new News(1,"Alex","hi", "badnews")); 
			 newslist.add(new News(1,"Wong","good", "budget")); 
		
			long counta=newslist.stream()  .filter(News -> News.comment=="budget") .count();
			System.out.println(" "+counta);
		}
	}
}
