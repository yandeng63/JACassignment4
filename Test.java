import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws BankAccountException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		BankAccount B = new BankAccount("Yan", 100);
		
		System.out.println("Please enter the amount you would like to deposit");
		
		double add = 0;
        try {// to catch invalid input other than double
            add = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid double value.");
            input.nextLine(); // Consume the invalid input
        }
	 
	    try {
			B.deposit(add);
		} catch (BankAccountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Exit");
		}
		
		
	    double withdraw = 0;
		System.out.println("Please enter the amount you would like to withdraw");
		
		try {// to catch invalid input other than double
			withdraw = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid double value.");
            input.nextLine(); // Consume the invalid input
        }
		
		
		try {
			B.withdraw(withdraw);
		} catch (BankAccountException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}finally {
			System.out.println("Exit");
		}
		
	}

}
