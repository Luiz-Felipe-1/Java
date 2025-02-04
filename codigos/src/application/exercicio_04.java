package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product01;

public class exercicio_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de produtos a ser cadastrado: ");
		int n = sc.nextInt();
		sc.nextLine();

		Product01[] vect = new Product01[n];

		for (int i = 0; i < vect.length; i++) {

			System.out.printf("Digite o nome do produto: ");
			String name = sc.nextLine();

			System.out.printf("Digite o Preço do produto: ");
			double price = sc.nextDouble();

			vect[i] = new Product01(name, price);
			sc.nextLine();

		}

		double sum = 0.0;

		for (int i1 = 0; i1 < vect.length; i1++) {
			sum += vect[i1].getPrice();
		}
		double avg = sum / vect.length;

		System.out.printf("Average price = R$%.2f%n", avg);

		sc.close();
	}

}
