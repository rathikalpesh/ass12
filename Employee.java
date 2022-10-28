class Employee{
	private int eid;
	private int hours;
	private int age;
	private double rate;
	public Employee(int eid, int hours , int age, double rate)
	{
	   this.eid = eid;
	   this.hours = hours;
	   this.age = age;
	   this.rate = rate;
	}
	public double getNetIncome()
	{
		if(hours>180)
			return hours*rate+(hours-180)*300;
		else 
			return hours*rate;
	
	}
	public void printEmployee()
	{
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee Age:"+age);
		System.out.println("Employee Working Hours:"+hours);
		System.out.println("Employee Rate:"+rate);
	}
}
