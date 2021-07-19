package lambda;
import java.util.*;
public class odd {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(Arrays.asList("1234","wsxw","qaz","qwertyui","q","qwe","qwerty","qwqw"));
		set.removeIf(p -> p.length() %2 != 0);
for(String i:set)
{
	System.out.println(i);
}
	}

}
