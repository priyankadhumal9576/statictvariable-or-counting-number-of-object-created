
public class Bank {

	public static void main(String[] args) 
	{
	 SavingAccount s=new SavingAccount("Riya");
	 s.ShowAccStatus();
	 SavingAccount s1=new SavingAccount("priya");
	 s1.ShowAccStatus();
	 
	 s.changeInterestRate(5.9);
    s.ShowAccStatus();
    s1.ShowAccStatus();
    System.out.println("no of onject is:"+SavingAccount.count);
	}

}
