import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lambda();

	}
	
	public static void lambda(){
		//List
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("klm");
		list.add("pqr");
		list.forEach((x) -> System.out.println(x));
		
		//filter on list
		System.out.println("Filter on list");
		list.stream().filter(x->(x.equals("pqr"))).forEach(System.out::print);
		
		//Map
		Map<String, String> map= new HashMap<String, String>();
				map.put("key1","value1");
				map.put("key2","value2");
				map.put("key3","value3");
				map.put("key4","value4");
		map.forEach((k,v)->System.out.println(k+" "+v));	
		
		//Iterate normal map
		System.out.println("Iterating map normally");
		for(Map.Entry<String, String> entry:map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//Predicate functional interface having only one abstract method test
		Predicate<Integer> p = x->(x>15);
		System.out.println(p.test(12));
		System.out.println(p.test(20));
		
		//Function- functional interface having only one abstract method apply
		Function<String, Integer> f= s->s.length();
		System.out.println(f.apply("abc"));
		System.out.println(f.apply("abcasdasd"));
		
		
		List<String> l2 = list.stream().filter(x->(x.equals("klm"))).collect(Collectors.toList());
		System.out.println(l2);
		
		List<String> l3 = list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(l3);
		
		System.out.println(list.stream().map(x->x.toUpperCase()).count());
		
		List<String> l4 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted ---------- "+l4);
		
		Comparator<String> comp = (s1,s2)->s2.compareTo(s1);
		
		List<String> l5 = list.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(l5);
		
		System.out.println(list.stream().max(comp).get());
		System.out.println(list.stream().min(comp).get());
		
		System.out.println("------------------------------------ ");
		List<String> names = Arrays.asList("Sam", "James", "Selena", "James", "Joe", "Sam", "James");
		Map<String, Long> countOfwordsMap =names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		countOfwordsMap.forEach((k,v) -> System.out.println(k + " "+ v));
		
		
	}

}


