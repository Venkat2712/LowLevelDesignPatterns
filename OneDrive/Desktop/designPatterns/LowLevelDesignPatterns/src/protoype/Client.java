package protoype;

import registry.StudentRegistry;

public class Client {

	public static void main(String[] args) {
		Student st = new Student();
		
		IntelligentStudent iStudent = new IntelligentStudent();
		iStudent.setIq("100");
		iStudent.setBatch("1");
		iStudent.setDob("27");
		iStudent.setId(2);
		iStudent.setName("Venkat");
		
		Student stCopy = st.copy();
		Student iCopy = iStudent.copy();
		System.out.println();
		
		
		
		StudentRegistry sRegistry = new StudentRegistry();
	     
		sRegistry.add("1", iCopy);
		
		System.out.println(sRegistry.get("1"));
		
		Student check = sRegistry.get("1");
		System.out.println(  check.getName()+ check.getDob() + check.getBatch() + check.getId());

	}

}
