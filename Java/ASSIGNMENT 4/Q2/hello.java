package lambda;

interface process {
    int app(int a, String b);
 }

public class hello {

	public static void main(String[] args) {
		process test1=(int a, String b) ->{
			if( a>=10000 && b=="ACCEPTED" || a>=10000 && b=="COMPLETED")
			{
				System.out.println("Printing your order");
			}
			else {
				System.out.println("Required criteria not met");
			}
			return a;
			
		};
	System.out.println(test1.app(10000,"COMPLEE"));
	}
	
}
