package question3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMaximumProfit  maxProfit = new findMaximumProfit();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items: ");
		int n=sc.nextInt();
		int[] category=new int[n];
		for(int i=0;i<n;i++) {
			category[i]=sc.nextInt();
		}
		
		int[] price = new int[n];
		for(int i=0;i<n;i++) {
			price[i]=sc.nextInt();
		}
		long result = maxProfit.findMax(category,price);
		
		System.out.println("Total Profit: "+result);
		
		

	}

}
