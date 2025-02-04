package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle x = new Rectangle();
		
		System.out.println("Digite as medidas do retangulo: ");
		System.out.print("Digite a altura: ");
		x.height = sc.nextDouble();
		System.out.print("Digite a Largura: ");
		x.widht = sc.nextDouble();
		System.out.println();
		System.out.println(x);		
		sc.close();
	}

}
