import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class hcl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Sam", "James", "Selena", "James", "Joe", "Sam", "James");
		
		//count of each element
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		map.forEach((k,v) -> System.out.println(k + " "+ v));
		System.out.println("-------------------------");

		// remove duplicates
		List<String> list1 = list.stream().distinct().collect(Collectors.toList());
		list1.forEach(x-> System.out.println(x));
		System.out.println("-------------------------");
		
		//count of letter 'e' in String
		String str = "elephant";
		System.out.println(str.chars().filter(x-> (x=='e')).count());
		
		System.out.println("-------------------------");
		//sort list
		List<String> list3 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		list3.forEach(x-> System.out.println(x));
		
		System.out.println("-------------------------");
		List<Integer> list4 = Arrays.asList(1,2,4,5,5,6);
		Comparator<Integer> comp = (s1,s2)-> s1.compareTo(s2);
		System.out.println(list4.stream().max(comp).get());
		//forEach(s->System.out.println(s));
		
		
		
		
	}

}
