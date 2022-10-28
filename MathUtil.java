class MathUtil{
	public static boolean isEven(int num){
		return num%2==0;
	}
	public static boolean isOdd(int num){
		return num%2==1;
	}
	public static boolean isPrime(int num){
		if(num==2)
			return true;
		if(num==3)
			return true;
		for(int i=3;i<num;i++)
		{
			if(num%i==0)
			return false;
		}
			return true;
	}
	public static int countPrime(int num){

		if(num==2)
			return 1;
		if(num==3)
			return 1;
		for(int i=3;i<num;i++)
		{
			if(num%i==0)
			return 0;
		}
			return 1;
	}
	 public static int reverse(int num){
		 int sum=0;
		 int temp=num;
		 while(num>0)
		 {
			 int r=0;
			 r=num%10;
			 sum=sum*10+r;
			 num=num/10;
		 }
		 return sum;
	 }
	 public static int digitCount(int num){
		 int count=0;
		 while(num>0)
		 {
		        int r=0;
			r=num%10;
			count++;
			num=num/10;
		 }
		 return count;
	 }
}


