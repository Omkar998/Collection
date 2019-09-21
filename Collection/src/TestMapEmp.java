import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Set;

public class TestMapEmp {

	public static void main(String[] args) {
		Map<String,Employee> emp=accept();
		display(emp);		
	}
	public static Map<String,Employee> accept()
	{
		Map<String,Employee> emp=new HashMap<String,Employee>();
		emp.put("emp111",new Employee("Ramesh",40000));
		emp.put("emp101",new Employee("Aanesh",50000));
		emp.put("emp102",new Employee("Suresh",1000));

		return emp;

	}
	public static void display(Map<String,Employee>map){
		Set<String> st=map.keySet();

		for(String s:st){
			Employee e=map.get(s);
			System.out.println(s+"\t==>"+e.getEname()+"\t"+e.getEsal());
		}
	}


}


