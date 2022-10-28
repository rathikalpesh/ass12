package edu.met.banking;
class LinearSequence extends Sequence{
	private double current;
	private double step;
	public double next(){
		double term=current;
		current+=step;
		return term;
	}
	public LinearSequence(){
		current=5;
		step=3;
	}

}


