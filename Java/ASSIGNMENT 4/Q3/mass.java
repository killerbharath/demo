package lambda;
import java.util.function.*;
public class mass {

	public static void main(String[] args) {
//predicate	
Predicate<String> checkLength=str->str.length()>5;
System.out.println(checkLength.test("checkLength"));
	

//consumer	
person p=new person();
Consumer<person> setname=t->t.setName("BHARATH");
setname.accept(p);
	System.out.println(p.getName());
//function
	Function<Integer,String> getint=t->t*10+"value multiplied by 10";
	System.out.println(getint.apply(2));
	//supplier
	Supplier<Double> getRandomDouble=()->Math.random();
	System.out.println(getRandomDouble.get());
}}
class person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}