import edu.met.banking.*;
class Program3{
	public static void main(String[] args){
		int pid=Integer.parseInt(args[0]);
		int btype=Integer.parseInt(args[1]);
		int ndays=Integer.parseInt(args[2]);
		Patient.setPatientID(pid);
		Patient.bedType(btype);
		Patient.setDays(ndays);
		InHousePatient.setPatientID(pid);
		InHousePatient.bedType(btype);
		InHousePatient.setDays(ndays);
		System.out.printf("The total bill of General Patient is %.3f%n",Patient.getBillAmount()); 
		System.out.printf("The total bill of In house Patient is %.3f%n",InHousePatient.getBillAmount()); 
	}
}

