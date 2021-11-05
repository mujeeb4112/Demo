import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Students1{
	private int age;
	private String name;
	
	public Students1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Students1 s2 = (Students1)obj;
		return  s2.age == age && s2.name.equals(name);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.age;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}	
}

class Main{
	public static void main(String args[]){
		List<Students1> list = new ArrayList<Students1>();
		list.add(new Students1(10, "abc"));
		list.add(new Students1(10, "abc"));
		list.add(new Students1(12, "abc"));
		list.add(new Students1(5, "xyz"));
		list.add(new Students1(102, "klm"));
		list.add(new Students1(102, "klm"));
		
		// list.forEach((Students1 s) -> System.out.println(s.toString()));
				// Comparator<Students1> comp = (s1,s2)->s2.compareTo(s1); 
//		
//		list.sort(comp);
		List<Students1> l2 = list.stream().sorted(Comparator.comparingInt(Students1::getAge)).collect(Collectors.toList());
		// List<Students1> l2 = list.stream().sorted((o1, o2)-> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
		l2.forEach((Students1 s) -> System.out.println(s.toString()));
		
		List<String> list1 = new ArrayList<String>();
		list1.add("abc");
		list1.add("abc");
		list1.add("xyz");
		list1.add("xyzsa");
		list1.stream().sorted().forEach(x->System.out.println("--------- "+x));
//		Set<String> s = new LinkedHashSet<>(list1);
//		list1.clear();
//		list1.addAll(s);
//		s.forEach(x-> System.out.println(x));
		
		List<String> deduped = list1.stream().distinct().collect(Collectors.toList());
		deduped.forEach(x-> System.out.println(x));
		
		l2 = l2.stream().distinct().collect(Collectors.toList());
		l2.forEach((Students1 s) -> System.out.println(s.toString()));
		
	}
}

