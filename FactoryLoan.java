package hr;
public class FactoryLoan{
	public static Loan forHomeLoan(){
		Loan hloan=new HomeLoan();
		return hloan;
	}
	public static Loan forPersonalLoan(){
		Loan ploan=new PersonalLoan();
		return ploan;
	}
}
