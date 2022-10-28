package edu.met.banking;
public class InHousePatient extends Patient{
	private static double discount=0;
	static{
		discount=5;
	}
	public static double getBillAmount(){
		if (Patient.getBillAmount()>5000)
			return Patient.getBillAmount()-Patient.getBillAmount()*5/100;
		return Patient.getBillAmount();
	}
}
	

