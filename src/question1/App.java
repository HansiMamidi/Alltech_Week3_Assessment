package question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
//		RegistrationPortal registrationPortal = RegistrationPortal.getRegisteredStudents();
		RegistrationPortal registrationPortal = RegistrationPortal.getRegistrationPortal();

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of threads: ");
		int n= sc.nextInt();
		
		List<Thread> threads = new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the number of students to register for Thread "+(i+1)+": ");
			int studentCount=sc.nextInt();
			int threadId=i;
			threads.add(new RegiatrationThread(registrationPortal,threadId,studentCount));
		}
		
		threads.forEach(Thread::start);

        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        List<Student> registeredStudents = registrationPortal.getRegisteredStudents();
        System.out.println("Registered Students Details:");

        for (Student student : registeredStudents) {
            System.out.println(student.getName());
        }
	

	}

}
