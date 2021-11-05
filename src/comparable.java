import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	private int age;
	private String name;
	
	public Student(int age, String name) {
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
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (o.age >= this.age) {
			return -1;
		} else if (o.age < this.age) {
			return 1;
		} else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}	
}

public class comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student(21, "abc");
		Student stud1 = new Student(22, "xyz");
		Student stud2 = new Student(18, "klm");
		List<Student> list = new ArrayList<Student>();
		list.add(stud);
		list.add(stud1);
		list.add(stud2);
		Collections.sort(list);
		list.forEach((Student s) -> System.out.println(s.toString()));	
	}
}
