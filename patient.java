package edu.met.banking;
public class Patient{
	 static int patientID;
	static String patientName;
	static int bedType;
	static int noOfDays;
	public static void bedType(int b){
		bedType=b;
	}
	public static void setPatientID(int pid){
		patientID=pid;
	}
	public static void setDays(int d){
		noOfDays=d;
	}
	static{
		patientID=101;
		patientName="Kalpesh";
		bedType=1;
		noOfDays=10;
	}
	public static double getPriceDay(){
		double price=0;
		switch(bedType)
		{
			case 1 :
				price= 500;
				break;
			case 2:
				price=350;
				break;
			case 3:
				price=200;
			default:
				System.out.printf("Invalid Entry:");
				System.exit(0);
		}
		return price;
		}
	public static double getBillAmount(){
		return noOfDays*getPriceDay();
	}
}
