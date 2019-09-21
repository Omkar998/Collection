import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Student {

	public static void main(String[] args) {
		Grade g1=new Grade(2019,2020,2021);
		Grade g2=new Grade(2018,2019,2017);
		Grade g3=new Grade(206,2015,2014);

		Map<String, Grade> map=new HashMap<String, Grade>();
		map.put("Ramesh",g1);
		map.put("Suresh",g2);
		map.put("Ganesh",g3);
		//Using Treemap For sorted order
		Map<String, Grade> tmap=new TreeMap<String, Grade>(map);

		print(map);
		print(tmap);
	}	
	public static void print(Map<String, Grade> map)
	{
		System.out.println("------------------------");
		Set<String> set=map.keySet();
		for(String g:set)
		{
			Grade g1=(Grade)map.get(g);
			System.out.println("Key:"+g+"\tAvg is:"+g1.getAverage());
		}
		/*Set set=map.entrySet();
		  Iterator it=set.iterator();
		  while(it.hasNext())
		  {
		  		Map.Entry entry=(Map.Entry)it.next();
		  		String key=(String)entry.getKey();
		  		Grade g=(Grade)entry.getValue();
		  		System.out.println("For key:"+key+"Avg is:"+g.getAverage());
		 }*/


	}

}
