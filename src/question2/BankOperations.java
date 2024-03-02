package question2;

public class BankOperations implements IBankAccountOperation {

	private double balance = 0;

	@Override
	public void deposit(double d) {
		if(d<=0) {
			System.out.println("Enter a number greater than Zero to deposit");
			return;
			
		}
		
		balance += d;
		System.out.println(balance);

	}

	@Override
	public void withdraw(double d) {
		if(d<=0) {
			System.out.println("Enter a number greater than Zero to withdraw");
			return;
			
		}
		
		if(balance==0 || balance<d) {
			System.out.println("Not enough balance. Remaining balance:"+balance);
			return;
			
		}
		balance -= d;
		System.out.println(balance);

	}

	@Override
	public double processOperation(String[] requests) {
		
		for(int j=0;j<requests.length;j++) {
			String[] words = requests[j].split(" ");
			String action = "";
			double amount = 0;

			for (int i = 0; i < words.length; i++) {
				words[i] = words[i].toLowerCase();
				if (words[i].equals("see") || words[i].equals("show")) {
					action = "show";
					break;
				} else if (words[i].equals("deposit") || words[i].equals("put") || words[i].equals("invest")
						|| words[i].equals("transfer")) {
					action = "deposit";
					try {
						amount = Double.parseDouble(words[i + 1]);
					}catch(Exception e) {
						System.out.println("Enter a valid deposit amount");
						action="";
						return balance;
					}
					break;
				} else if (words[i].equals("withdraw") || words[i].equals("pull")) {
					action = "withdraw";
					try {
						amount = Double.parseDouble(words[i + 1]);
					}catch(Exception e) {
						System.out.println("Enter a valid deposit amount");
						action="";
						return balance;
					}
					break;
				}

			}
			switch (action) {
			case "show":
				System.out.println(balance);
				break;
			case "deposit":
				this.deposit(amount);
				break;
			case "withdraw":
				this.withdraw(amount);
				break;
			default:
				System.out.println("Invalid action.");
				break;

			}

		}
		return balance;
	}

}
