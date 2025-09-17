package registry;

import java.util.HashMap;

import protoype.Student;

public class StudentRegistry {
	
	private HashMap<String,Student> students;
	
	
	
	public StudentRegistry() {
		students = new HashMap<>();
	}
	
	
	
	public void add(String name,Student s) {
		students.put(name, s);
	}
	
	



	public Student get(String name) {
		return students.get(name);
		
		
	}
	
	
	
//	public HashMap<String, Student> getStudents() {
//		return students;
//	}
//
//
//
//	public void setStudents(HashMap<String, Student> students) {
//		this.students = students;
//	}

}
