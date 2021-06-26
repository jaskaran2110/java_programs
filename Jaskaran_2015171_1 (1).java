import java.util.Scanner;
public class Jaskaran_2015171_1 {
	public static void main(String[] args) 
	{
		int n, ch;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of customer : ");
		n = input.nextInt();
		Bank customer[] = new Bank[n];
		for(int i = 0; i < n; i++) 
		{
			customer[i] = new Bank();
			customer[i].Enter();
		}
		do
		{
			System.out.println("-MAIN MENU");
			System.out.println("1. Deposit amount");
			System.out.println("2. Withdraw amount");
			System.out.println("3. Change address");
			System.out.println("4. Display details");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			ch = input.nextInt();

			System.out.println("\nEnter customer account number : ");
			int acc = input.nextInt();
			
			int i, index=0;
			for (i = 0; i < n; ++i) {
				if (customer[i].account_no == acc){
					index = i;
					break;
				}
			}
			if (i == n){
				System.out.println("Customer do not exist ...");  
			}
			else{
				if(ch == 1){
					customer[index].Deposit();
				}
				else if(ch == 2){
					customer[index].Withdraw();
				}
				else if(ch == 3){
					customer[index].changeAddress();
				}
				else if(ch == 4){
					customer[index].Display();
				}
				else if(ch != 5){
					System.out.println("Wrong Input");
				}
			
			}
		}while(ch !=  5);
		input.close();
	}

}
class Bank{
	Scanner input = new Scanner(System.in);
	static int counter = 1001;
	String name, address;
	int account_no;
	double amount;

	void Enter(){

		System.out.print("Enter Your Name : ");
		this.name = input.nextLine();
		System.out.print("Enter Your Address : ");
		this.address = input.nextLine();
		this.account_no = counter;
		counter++;
		System.out.print("Enter Amount : ");
		this.amount = input.nextDouble();
		System.out.println("Your Account Number is : " + account_no);
		
		
	}
	void Display(){
		System.out.println("------ Depositer's Infromation -----");
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Account Number : " + account_no);
		System.out.println("Balance Amount : " + amount);
	}
	void Deposit(){

		double deposit;
		System.out.print("Enter amount : ");
		deposit = input.nextDouble();
		amount = amount + deposit;
		this.Display();
	}
	void Withdraw(){

		double deposit;
		System.out.print("Enter amount : ");
		deposit = input.nextDouble();
		amount = amount - deposit;
		this.Display();
	}
	void changeAddress(){
		

		System.out.print("Enter your address : ");
		address = input.nextLine();
		this.Display();
	}
}