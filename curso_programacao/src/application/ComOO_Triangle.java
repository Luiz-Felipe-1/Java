package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ComOO_Triangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in); 
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
			System.out.println("Digite as medidas do triangulo X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
			System.out.println("Digite as medidas do triangulo Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			
			
			double areax = x.area();
			
			double areay = y.area();
			
			System.out.printf("Area do Triangulo X: %.4f%n",areax);
			System.out.printf("Area do Triangulo Y: %.4f%n",areay);
			if(areax > areay) {
				System.out.println("Maior area: x");
			}else {
				System.out.println("Maior area: Y");
			}
			
			sc.close();	
	}

}
