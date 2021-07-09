class hello
{
     public static void main(String[] args)
     {    	 
          Manager m1 = new Manager("Bharath",20000,3000);
          System.out.println("Salary of Manager= "+m1.getSalary());
          Labour l1 = new Labour("Srinivas",15000,5000);
          System.out.println("Salary of Labour= "+l1.getSalary());
     }
}