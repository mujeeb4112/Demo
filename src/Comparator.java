import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students{
	private int age;
	private String name;
	
	public Students(int age, String name) {
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
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}	
}

class NameComparator implements java.util.Comparator<Students>{
	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}

public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stud = new Students(21, "abc");
		Students stud1 = new Students(22, "xyz");
		Students stud2 = new Students(18, "klm");
		List<Students> list = new ArrayList<Students>();
		list.add(stud);
		list.add(stud1);
		list.add(stud2);
		list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		list.forEach((Students s) -> System.out.println(s.toString()));
		Collections.sort(list, new NameComparator());
		list.forEach(student -> System.out.println("-------------- "+ student.toString()));
	}
}
