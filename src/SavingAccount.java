public class SavingAccount 
{
	static int count=0;
	//static long count=98764322l;
	private long accNo;
	private float balence;
	private String accHolderName;
	
   public static double interestRate =5.4;
	public SavingAccount()
	{ 
		count++;
		balence=542.00f;
	}	
	public SavingAccount(String accHolderName)
	{
	    this ();
	    count++;
		accNo=count++;
		this.accHolderName=accHolderName;
	}
	public static void changeInterestRate(double r)
	{
	
		interestRate=r;
	}
	
	 public void ShowAccStatus()
	 {
		System.out.println("Account number is:"+accNo) ;
		System.out.println("Account holder name is:"+accHolderName) ;
		System.out.println("Account interest rate is"+SavingAccount.interestRate);
		System.out.println("total number of object created is:");
	 }
		
}

