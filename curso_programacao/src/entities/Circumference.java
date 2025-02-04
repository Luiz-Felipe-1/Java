package entities;

public class Circumference {
	public double r;
	public double b;
	public double c;
	public static final double PI=3.14159;
	
	public double length() {
		
		return 2*r*PI;
		
	}
public double volume() {
		
		return (4.0/3.0)*PI*Math.pow(r, 3.0);
		
	}


}
