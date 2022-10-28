package edu.met.banking;
class PowerSequence extends Sequence implements Resetable{
	 public double next(){
	        double term = current;
		current *= factor;
		return term;
	 }
	public void reset(){
		 current=1;
	 }
	 private double current;
	 private double factor;
	public PowerSequence(){
		current=1;
		factor=5;
	}
}
