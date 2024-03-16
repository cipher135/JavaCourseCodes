package t.collection;

public class Student implements Comparable<Student>{
	int id;
	String name;
	
	public Student (int id, String name){
		this.id = id;
		this.name = name;
	}
	
	/* sort() method is applicable to the class which 
	 * implements the Comparable Interface and overrides the
	 * compareTo() method 
	*/
	@Override
	public int compareTo(Student otherStudent) {
		return this.name.compareTo(otherStudent.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
