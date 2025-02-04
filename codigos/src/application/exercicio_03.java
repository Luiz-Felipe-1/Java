package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0;

		System.out.printf("Digite o Número de produtos a ser cadastrado: ");
		int n = sc.nextInt();
		sc.nextLine();

		double[] price = new double[n];
		String[] name = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o nome do produto: ");
			name[i] = sc.nextLine();
			System.out.printf("Digite o Preço do produto: ");
			price[i] = sc.nextDouble();
			sc.nextLine();
			soma += price[i];
		}

		double avg = soma / n;

		for (int i = 0; i < n; i++) {
			System.out.printf("%s Price R$ %.2f \n", name[i], price[i]);
		}

		System.out.printf("Average Price = R$ %.2f\n", avg);

		sc.close();
	}

}
