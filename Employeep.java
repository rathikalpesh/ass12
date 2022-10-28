class Employeep{
	public static void main(String[] args){
		int eid = Integer.parseInt(args[0]);
		int hours = Integer.parseInt(args[1]);
		int age = Integer.parseInt(args[2]);
		double rate = Double.parseDouble(args[3]);
		
		Employee Emp =  new Employee (eid, hours, age, rate);
		Emp.printEmployee();
		System.out.printf("Net income is: %.2f%n", Emp.getNetIncome());
	}
}
