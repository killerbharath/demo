package Treeset;


import java.util.*;
public class hello {
	public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		    HashSet<String> set=new HashSet();  
		    set.add("Volvo");
		    set.add("BMW");
		    set.add("Ford");
		    set.add("BMW");
		    set.add("Mazda");
		           
		    
                   for(String i:set)
                   {
                	  System.out.println(i);
                   }
                   
                   LinkedHashSet<String> sets=new LinkedHashSet();
                   sets.add("A");    
		           sets.add("B");    
		           sets.add("C");   
		           sets.add("D");  
		           sets.add("E");  
		           
		           for(String j:sets)
                   {
                	   System.out.println(j);
                   }
		           
}}