package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circumference;

public class exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in); 
		
		Circumference  x = new Circumference ();
		
		System.out.print("enter radious: ");
		x.r = sc.nextDouble();
		
		System.out.printf("circumference: %.2f%n",x.length());
		System.out.printf("Volume: %.2f%n",x.volume());
		System.out.printf("PI: %.2f%n",Circumference.PI);
		
		sc.close();
	}

}
