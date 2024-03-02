package question1;


public class RegiatrationThread extends Thread{
	RegistrationPortal registrationPortal;
	int threadValue;
	int studentCount;
	
	String name;
	public RegiatrationThread(RegistrationPortal registrationPortal, int threadValue, int studentCount) {
		super();
		this.registrationPortal = registrationPortal;
		this.threadValue=threadValue;
		this.studentCount = studentCount;
	}

	@Override
	public void run() {
		for (int j = 0; j < studentCount; j++) {
            String studentName = "id-"+(threadValue+1)+"-"+(j+1)+"name-" + (j + 1);
            Student student = new Student(studentName);
            registrationPortal.register(student);
        }
	}
	

}
