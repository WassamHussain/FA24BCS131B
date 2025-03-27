public class Teacher extends Person{
	private String subject;

	Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;

	}

	
	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}


	@Override
	public String toString(){
		return super.toString() + "Subject: " + subject + "\n";

	}

}