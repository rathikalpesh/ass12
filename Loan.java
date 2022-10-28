package hr;
public abstract class Loan{
	private double principle;
	private int period;
	public void setPrinciple(double p){
		principle=p;
	}
	public double getPrinciple(){return principle;}
	public void setPeriod(int t){
		period=t;
	}
	public int getPeriod(){return period;}
	public abstract double getRate();
	public double getEMI(){
		return principle*(1+getRate()*period/100)/(12*period);
	}


}


