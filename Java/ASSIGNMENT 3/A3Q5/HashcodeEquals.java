package Treeset;

import java.util.HashSet;

public class HashcodeEquals {

    public static void main(String[] args) {
        trial alex1 = new trial(1, "Alex");
        trial alex2 = new trial(1, "Alex");

        HashSet < trial > Employee = new HashSet < trial > ();
        Employee.add(alex1);
        Employee.add(alex2);

        System.out.println("HashSet size = " + Employee.size());
        System.out.println("HashSet contains Alex = " + Employee.contains(new trial(1, "Alex")));
        
    }
  
}