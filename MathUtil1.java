import java.util.Scanner;
class MathUtil1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int Choice=0;
		while(true)
		{
			System.out.printf("1.Check Even%n");
			System.out.printf("2.Check Odd%n");
			System.out.printf("3.Check Prime%n");
			System.out.printf("4.Count Prime%n");
			System.out.printf("5.Rverese Number%n");
			System.out.printf("6.Count Digit%n");
			System.out.printf("7.Exit%n");
			System.out.printf("%n");

			System.out.printf("Enter your Choice.%n");
			Choice=sc.nextInt();
			int num=0;
			switch(Choice)
			{
				case 1:	
			                System.out.printf("Enter Number.%n");
					num=sc.nextInt();
					if(MathUtil.isEven(num))
			                	System.out.printf("Your Number is Even.%n");
					else
			               		 System.out.printf("Your Number is Odd.%n");
					break;
				case  2:
			                System.out.printf("Enter Number.%n");
					num=sc.nextInt();
					if(MathUtil.isOdd(num))
			                	System.out.printf("Your Number is Odd.%n");
					else
			               		 System.out.printf("Your Number is Even.%n");
					break;
				case 3:
			                System.out.printf("Enter Number.%n");
					num=sc.nextInt();
					if(MathUtil.isPrime(num))
			                	System.out.printf("Your Number is Prime Number.%n");
					else
			               		 System.out.printf("Your Number is not prime Number.%n");
					break;
				case 4:
					int first=0;
					int last=0;
					int count=0;
			                System.out.printf("Enter Range:.%n");
					first=sc.nextInt();
					last=sc.nextInt();
					for(int i=first;i<=last;i++)
					{
						count=count+MathUtil.countPrime(i);
					}
			               	System.out.printf("The Total prime Number are:%d%n",count);
					break;
				case 5:
			                System.out.printf("Enter Number.%n");
					num=sc.nextInt();
					System.out.printf("The  reversed number is %d %n",MathUtil.reverse(num));
					break;
				case 6:
			                System.out.printf("Enter Number.%n");
					num=sc.nextInt();
					System.out.printf("The no. of digit are %d %n",MathUtil.digitCount(num));
					break;
				case 7:
					System.exit(0);
				default:
					System.out.printf("Invalid Entry%n");
			}

					
		}		



						



					




	}
}
