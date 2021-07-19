package Treeset;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDob {

	public static void main(String[] args) {

		Date empDob1=new Date(5,8,1998);
		Date empDob2=new Date(2,7,1998);
		Date empDob3=new Date(1,7,2000);
		Date empDob4=new Date(5,8,1999);
		Map<Date,String >  EmpDobMap = new HashMap<>();
		EmpDobMap.putIfAbsent(empDob1,"Bharath");	
		EmpDobMap.putIfAbsent(empDob2,"Harocky");	
		EmpDobMap.putIfAbsent(empDob3,"Yogi");	
		EmpDobMap.putIfAbsent(empDob4,"Rick");	
		System.out.println(EmpDobMap);

	}

}