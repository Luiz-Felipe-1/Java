package entities;

public class Rectangle {

	public double widht;
	public double height;
	
	public double area() {
		return widht * height;
	
}
	public double Perimeter() {
		return (widht *2)+(height * 2);
	}
	
	public double Diagonal() {
		return Math.sqrt(((widht*widht)+(height*height)));
	}
	public String toString() {
		return 	"area = "
				+ String.format("%.2f", area())
				+ ", "
				+ "Perimeter = "
				+ String.format("%.2f", Perimeter())
				+ " Diagonal = "
				+ String.format("%.2f", Diagonal());
	};

}