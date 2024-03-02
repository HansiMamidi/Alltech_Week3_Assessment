package question2;

public interface IBankAccountOperation {
	void deposit( double d);
	void withdraw(double d);
	double processOperation(String[] requests);
	

}
