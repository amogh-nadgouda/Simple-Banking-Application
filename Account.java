class Account{
	
	int account_no;
	double balance;
	String c_name;
	String password

	public Account(int account_no, int balance, String c_name){
		this.account_no = account_no;
		this.balance = balance;
		this.c_name = c_name;
	}

	public void deposit(int amount){

		balance += amount;
		System.out.println("new balance: "+balance);

	}

	public void withdraw(int amount){
		balance -= amount;
		System.out.println("new balance: "+balance);

	}

	public int hashCode(){
		return account_no;
	}


}