
public class BankAccount {

	private String name; // your name
	private double balance; // current amount of money you save in the bank account
	private final static double depositLimit = 500;
	private final static double withdrawLimit = 500;

	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
		}

		/** constructor */
		public BankAccount(String name) {
		this(name,0);
		}	

		/** return balance */
		public double getbalance() {
		return balance;
		}

		/** return name */
		public String getName() {
		return name;
		}

		public String toString() {
		return "Name: " + name + "\n" + "balance: " + balance ;
		}

		/** deposit money into the account */
		public void deposit(double depositAmount) throws BankAccountException{
		// TODO
			if (depositAmount < 0) {
            
				throw new InvalidAmountException("The amount cannot be negative");
		
			}else if(depositAmount > depositLimit){
			
				throw new DepositLimitException("The amount you entered exceeds the deposit limit of 500");
		}else {
			balance += depositAmount;
			
			System.out.println(depositAmount + " has been added to your account. Your account balance is " + this.getbalance());
		}
}


		/** withdraw money from the account */
		public void withdraw(double withdrawAmount) throws BankAccountException {
		// TODO
			if (withdrawAmount < 0) {
	            
				throw new InvalidAmountException("The amount cannot be negative");
		
			}else if(withdrawAmount > withdrawLimit){
			
				throw new WithdrawLimitException("The amount you entered exceeds the deposit limit of 500");
		
			}else if(withdrawAmount > balance ){
			
			    throw new NotEnoughBalanceException("There is not enough balance in your account");
		}
			balance -= withdrawAmount;
			System.out.println(withdrawAmount + " has been withdrawn to your account. Your account balance is " + this.getbalance());
		}
		
		


	
}
