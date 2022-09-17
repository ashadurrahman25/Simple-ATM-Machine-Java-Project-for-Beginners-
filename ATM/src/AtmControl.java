
public class AtmControl implements AtmInterface {
	
	Atm_Operator operator = new Atm_Operator();

	
	
	@Override
	public void ViewBlance()
	{
		System.out.println("your Account Blance: $"+operator.getBlance());
		
	}
	
	@Override
	public void DepositAomount(double DepositAmount)
	{
		System.out.println("Deposit sccesfully : $"+DepositAmount);
		operator.setBlance(DepositAmount + operator.getBlance());
		ViewBlance();
	}
	
	@Override
	public void WithdreawAmount(double WithdrawAmount)
	{
		if(operator.getBlance()>= WithdrawAmount)
		{
			System.out.println("Withdraw succes : $"+WithdrawAmount);
			operator.setBlance(operator.getBlance()-WithdrawAmount);
			ViewBlance();
		}else
		{
			System.out.println("Your Account does not have sufficient Blacne");
		}
		
		
	}
	
	
}
