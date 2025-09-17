package protoype;

public class Student {
	
	private int id;
	private String name;
	private String batch;
	private String dob;
	
	
	public Student(){
		
	}
	
	public Student(Student student) {
		this.id=student.id;
		this.name=student.name;
		this.batch=student.batch;
		this.dob=student.dob;
	}
	
	
	public Student copy() {
		Student copy = new Student(this);
		return copy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	

}
