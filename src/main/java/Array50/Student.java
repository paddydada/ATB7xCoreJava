package Array50;

public class Student implements Comparable<Student> {

	int id;
	String name;

	Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}

	@Override
	public String toString() {
		return "Student{id=" + id + ", name='" + name + "'}";
	}

}
