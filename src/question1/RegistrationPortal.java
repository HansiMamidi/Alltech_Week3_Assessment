package question1;

import java.util.ArrayList;
import java.util.List;

public class RegistrationPortal {
	private static RegistrationPortal instance;
	List<Student> registeredStudents = new ArrayList<>();;
	
	

	public List<Student> getRegisteredStudents() {
		return registeredStudents;
	}

	public void setRegisteredStudents(List<Student> registeredStudents) {
		this.registeredStudents = registeredStudents;
	}

	public void register(Student student) {
		// TODO Auto-generated method stub
        registeredStudents.add(student);
		
	}

	public static RegistrationPortal getRegistrationPortal() {
		// TODO Auto-generated method stub
		if (instance == null) {
            instance = new RegistrationPortal();
        }
        return instance;
	}
	

}
