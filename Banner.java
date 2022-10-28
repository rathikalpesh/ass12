package edu.met.banking;
public class Banner{
	private double width;
	private double height;

	public void resize(double w, double h) throws IllegalDiamensionException{
		if(w<h)
			throw new IllegalDiamensionException();
		width=w;
		height=h;
	}
	public Banner(double w, double h){
		width=w;
		height=h;
	}
	public Banner(){
		this(15,4);
	}
	public double bannerArea(){
		return width*height;
	}
	public void setWidth(double w){
		width=w;
	}
	public void setHeight(double h){
		height=h;
	}
	public double getWidth(){return width;}
	public double getHeight(){return height;}
}
	




