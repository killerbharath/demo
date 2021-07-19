package lambda;
interface MathOperation {
    int operation(int a, int b);
 }
public class user {

	public static void main(String[] args) {
		MathOperation add=( a,  b) -> (a + b);
		MathOperation sub=(int a, int b) -> (a - b);
		MathOperation mul=(int a, int b) -> (a * b);
		MathOperation div=(int a, int b) -> (a / b);

	
	
	 System.out.println("10 + 5 = " + add.operation(10, 5));
	 System.out.println("10 - 5 = " + sub.operation(10, 5));
	 System.out.println("10 * 5 = " + mul.operation(10, 5));
	 System.out.println("10 / 5 = " + div.operation(10, 5));
}
}
