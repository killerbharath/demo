package Treeset;
import java.util.*;

class main{
	


public static void main(String args[]){  
	  //Creating HashSet and adding elements  
	 List<String> list=new ArrayList<String>();  
	 //Adding elements in the List  
	 list.add("Mango");  
	 list.add("Apple");  
	 list.add("Banana");  
	 list.add("Grapes");  
	 ListIterator<String> itr = list.listIterator(list.size());
	 while (itr.hasPrevious()) {
         System.out.println(itr.previous());
     }        
}}