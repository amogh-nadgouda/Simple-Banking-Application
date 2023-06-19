import java.util.*;


class Bank{
static int account_no = 786594;

static ArrayList<Account> accounts = new ArrayList<Account>();
public static void main(String[] args) {

	createAccount("smith");

	createAccount("smith");

	depositAmount(786599,1000);
	
	displayDetails(786599);
	createAccount("Amogh");

	displayDetails(786599);
}

public static void createAccount(String name){
	System.out.println();System.out.println();
	System.out.println("––––––––––––––––––––––––––––––––––");


	account_no= account_no+1+(account_no % name.length());

	Account account = new Account(account_no,0,name);

	System.out.println("Account created!");
	System.out.println("Your account number is "+account_no);

	accounts.add(account);

		System.out.println("––––––––––––––––––––––––––––––––––");

}

public static void depositAmount(int account_no,double amount ){

	for(Account a:accounts){

		if(a.account_no==account_no){
			a.balance+= amount;
		}
	}
}
public static void withdrawAmount(int account_no,double amount ){

	for(Account a:accounts){

		if(a.account_no==account_no){
			a.balance-= amount;
		}
	}
}

public static void displayDetails(int account_no){
	System.out.println();
	System.out.println();
	System.out.println("–––––––––––––––DETAILS–––––––––––––");

		for(Account a:accounts){

			//System.out.println(a.account_no);
		if(a.account_no==account_no){
			System.out.println("account_no: "+a.account_no);
			System.out.println("Name: "+a.c_name);
			System.out.println("balance: "+a.balance);
			break;
		}


	}
		System.out.println("––––––––––––––––––––––––––––––––––");


}

	

}

//Create Login Page
//Create infinite loop for menu
//Choose appropriate collection