import edu.met.banking.*;
class Program{
	public static double Compute(Sequence Seq, int count){
		if(Seq instanceof Resetable p)
			p.reset();
	return	Seq.sum(count)/count;
	}
	public static void main(String [] args){
		Sequence s=Factory.linearSequence();
		Sequence q=Factory.powerSequence();
		System.out.printf("The Sum of linear Sequence is %.3f%n",Compute(s,12));
		System.out.printf("The Sum of Power Sequence is %.3f%n",Compute(q,15));
	}
}


