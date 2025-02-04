package application;

import java.util.Locale;
import java.util.Scanner;

public class SemOO_Triangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in); 
		double Xa,Xb,Xc,Ya,Yb,Yc;
		
			System.out.println("Digite as medidas do triangulo X: ");
			Xa = sc.nextDouble();
			Xb = sc.nextDouble();
			Xc = sc.nextDouble();
			System.out.println("Digite as medidas do triangulo Y: ");
			Ya = sc.nextDouble();
			Yb = sc.nextDouble();
			Yc = sc.nextDouble();
			
			double p = (Xa+Xb+Xc)/2;
			double areax = Math.sqrt(p*(p-Xa)*(p-Xb)*(p-Xc));
			p = (Ya+Yb+Yc)/2;
			double areay = Math.sqrt(p*(p-Ya)*(p-Yb)*(p-Yc)); 
			
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
