package protoype;

public class IntelligentStudent extends Student {
	
	private String iq;
	
	
	public IntelligentStudent() {
		
	}
	
	
	public  IntelligentStudent(IntelligentStudent iStudent) {
		super(iStudent);
		this.iq=iStudent.iq;
		
	}
	
	
	public String getIq() {
		return iq;
	}


	public IntelligentStudent copy() {
		IntelligentStudent iStudent = new IntelligentStudent(this);
		return iStudent;
		
	}
	
	
	public void setIq(String iq) {
		this.iq=iq;
	}
	

}
