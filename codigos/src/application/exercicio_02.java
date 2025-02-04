package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		System.out.print("Digite o número de pessoas: ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite a altura do aluno %d: ", i + 1);
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		double media = soma / n;
		System.out.printf("a média da altura dos alunos é: %.2f ", media);
		sc.close();
	}

}
