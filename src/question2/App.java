package question2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of requests: ");
		int n=sc.nextInt();
		sc.nextLine();
		
		String[] requests = new String[n];
		
		BankOperations op = new BankOperations();

		for(int i=0;i<n;i++){
            System.out.print("Enter operation "+i+": ");
            requests[i]=sc.nextLine();;
        }
        op.processOperation(requests);

        sc.close();

	}

}
