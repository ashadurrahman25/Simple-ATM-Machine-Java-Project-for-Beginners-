
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		ATM_subClass subClass = new ATM_subClass();
		AtmControl atm_control = new AtmControl();
		
		int Number_one = 12345678;
		int pin_one = 1234;
		
		int Number,pin,chouse;
		
		Scanner input = new Scanner(System.in);
		
	   System.out.print("Enter your Account Number: ");
	   Number = input.nextInt();
	   System.out.print("Enter your Pin Number: ");
	   pin = input.nextInt();
		
	   if((Number_one == Number) && (pin_one == pin))
	   {
		   System.out.println("Wellcome to ATM Meching");
		   
		   while(true)
		   {
			   subClass.subClass();
			   
			   System.out.print("Enter your Chouse Numebr: ");
			   chouse = input.nextInt();
			  
			   
			   if(chouse==1)
			   {
				   atm_control.ViewBlance();
				   
			   }else if(chouse == 2)
			   {
				   System.out.print("Enter Deposit Amount: $");
				   double deposit = input.nextDouble();
				   atm_control.DepositAomount(deposit);
				   
			   }else if(chouse == 3)
			   {
				   System.out.print("Enter Withdraw Amount: $");
				   double withdraw = input.nextDouble();
				   atm_control.WithdreawAmount(withdraw);
				   
			   }else if(chouse == 4)
			   {
				
				   System.out.println("Thank you for Using ATM Meching.");
				   
			   }else 
				   
			   {
				   System.out.println("worng passworld and number please try again");
				   subClass.subClass();
				   System.out.print("Enter your Chouse Numebr: ");
				   chouse = input.nextInt();
			   }
		   
	   }
	   
	   
	}else
	{
		System.out.println("worng passworld and number please try again");
				   
	}
	
	   
	   
	}
}
