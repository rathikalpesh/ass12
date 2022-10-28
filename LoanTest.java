import hr.*;
import java.util.*;
class LoanTest{
	private static double compute(Loan info){
		if( info instanceof Taxable){
		var p=(Taxable)info;
		return info.getEMI()+info.getEMI()*p.getTax();
		}
		if(info instanceof Discountable){
			var h=(Discountable)info;
			return info.getEMI()-info.getEMI()*h.getDiscount();

		}
		return 0;
	}

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int choice=0;
		System.out.println("Enter the amount:");
		double amount=sc.nextDouble();
		System.out.println("Enter Period:");
		int period=sc.nextInt();
		System.out.println("1.Personal Loan");
		System.out.println("2.Home Loan");
		System.out.println("Enter choice");
		choice=sc.nextInt();
		switch(choice){
			case 1:
				var pl=FactoryLoan.forPersonalLoan();
				pl.setPrinciple(amount);
				pl.setPeriod(period);
				System.out.printf("Your Monthly EMI without tax is %.2f%n",pl.getEMI());
				System.out.printf("Your Monthly EMI is with tax is %.2f%n",compute(pl));		
				break;

			case 2:
				var hl =FactoryLoan.forHomeLoan();
				hl.setPrinciple(amount);
				hl.setPeriod(period);
				System.out.printf("Your Monthly EMI without Discount is %.2f%n",hl.getEMI());
				System.out.printf("Your Monthly EMI with Discount is  %.2f%n",compute(hl));
				break;

		}

	}

}


