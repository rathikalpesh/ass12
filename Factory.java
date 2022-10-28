package edu.met.banking;
public class Factory{
	public static Sequence linearSequence(){
		var seq=new LinearSequence();
		return seq;
	}
	public static Sequence powerSequence(){
		var seq=new PowerSequence();
		return seq;
	}
}
