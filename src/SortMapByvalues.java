import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortMapByvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 10);
		map.put("xyz", 1);
		map.put("klm", 13);
		map.put("pqr", 18);
		map.put("dss", 2);
		
		map.forEach((k,v) -> System.out.println(k+ " "+ v));
		
		// sortMap(map);
		
		map.entrySet()
		  .stream()
		  .sorted(Map.Entry.<String, Integer>comparingByKey())
		  .forEach(System.out::println);
	}

//	private static void sortMap(HashMap<String, Integer> map) {
//		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
//		
//		Collections.sort(list, );
//		
//	}
	
	
}
