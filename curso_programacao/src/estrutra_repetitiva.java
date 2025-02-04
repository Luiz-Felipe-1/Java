import java.util.Locale;
import java.util.Scanner;

public class estrutra_repetitiva {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char op;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = 0;
			f = ((9 * c) / 5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n ", f);
			System.out.printf("Deseja Repetir(s/n)? ");
			op = sc.next().charAt(0);
		} while (op == 's');
		sc.close();
	}

	public static void exemplo01(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int y = 0;
		int x = sc.nextInt();
		while (x != 0) {
			y += x; // y = y+x;
			x = sc.nextInt();
		}
		System.out.printf("o total é : %d", y);
		sc.close();
	}

	public static void exemplo02(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int y = 4;
		int x = 0;
		while (x < 3) {
			y = y + 2; // y+= 2;
			x = x + 1; // x+= 1;
			System.out.printf("%d - %d%n", x, y);
		}
		sc.close();
	}

	public static void exemplo03(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, m = 0, t = 0;
		System.out.printf("Digite a quantidade de números a ser somado: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite um Número: ");
			m = sc.nextInt();
			t += +m;
		}
		System.out.printf("O total é: %d%n", t);
		sc.close();
	}

	public static void exemplo04(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i:" + i);
		}
		sc.close();
	}

	public static void exemplo05(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		for (int i = 4; i >= 0; i--) {
			System.out.println("Valor de i:" + i);
		}
		sc.close();
	}

	public static void exercicio01(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int senha = 0;
		while (senha != 2002) {

			System.out.printf("Digite a sua Senha: ");
			senha = sc.nextInt();
			if (senha != 2002) {
				System.out.println("Senha Inválida!");
			}
		}
		System.out.println("Acesso Permitido!");
		sc.close();
	}

	public static void exercicio02(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		System.out.printf("Digite o valor de x: ");
		x = sc.nextInt();
		System.out.printf("Digite o valor de y: ");
		y = sc.nextInt();
		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante!");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante!");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante!");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto Quadrante!");
			}

			System.out.printf("Digite o valor de x: ");
			x = sc.nextInt();
			System.out.printf("Digite o valor de y: ");
			y = sc.nextInt();
		}
		sc.close();
	}

	public static void exercicio03(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int gasolina = 0, alcool = 0, diesel = 0, i = 0;

		while (i != 4) {
			System.out.println("Opções");
			System.out.println("[1] Álcool");
			System.out.println("[2] Gasolina");
			System.out.println("[3] Diesel");
			System.out.println("[4] Sair");
			System.out.printf("Digite o código do produto: ");
			i = sc.nextInt();
			switch (i) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			case 4:
				System.out.println("Fechando Programa! ");
				break;
			default:
				System.out.println("Código errado! Digite novamente!");
				break;
			}
		}
		System.out.println("Muito Obrigado!");
		System.out.printf("Alcool:%d%n ", alcool);
		System.out.printf("Gasolina:%d%n ", gasolina);
		System.out.printf("Diesel:%d%n ", diesel);
		sc.close();
	}

	public static void exercicio04(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.printf("Digite um Número: ");
		x = sc.nextInt();
		for (int i = 1; i <= x && x <= 1000; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d,", i);
			}
		}
		sc.close();
	}

	public static void exercicio05(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, m = 0, in = 0, out = 0;
		System.out.print("Digite a quantidade de Números: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			m = sc.nextInt();
			if (m >= 10 && m <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		System.out.println("in: " + in);
		System.out.println("out: " + out);
		sc.close();
	}

	public static void exercicio06(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.printf("Digite a quantidade de casos testes:");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			double a, b, c, media = 0;
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();

			media = (a * 2 + b * 3 + c * 5) / (5 + 3 + 2);
			System.out.printf("Média: %.1f%n", media);
		}
		sc.close();
	}

	public static void exercicio07(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.printf("Digite o número de casos: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a, b;
			double total = 0;
			System.out.printf("Digite o primeiro valor: ");
			a = sc.nextInt();
			System.out.printf("Digite o segundo valor: ");
			b = sc.nextInt();
			if (b == 0) {
				System.out.println("Divisão impossivel!");
			} else {
				total = (double) a / b;
				System.out.printf("Total:%.1f%n ", total);
			}

		}
		sc.close();
	}

	public static void exercicio08(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.printf("Digite um número: ");
		n = sc.nextInt();
		int total = 1;
		if (n == 0) {
			System.out.println("total: 1");
		} else {
			for (int i = 1; i <= n; i++) {

				total = total * i;

			}

			System.out.printf("total:%d ", total);
		}
		sc.close();
	}

	public static void exercicio09(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double n = 0.0;
		System.out.printf("Digite um número: ");
		n = sc.nextDouble();
		for (int i = 0; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}

		}
		sc.close();
	}

	public static void exercicio10(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.printf("Digite um número: ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			double a, b;
			a = Math.pow(i, 2.0);
			b = Math.pow(i, 3.0);
			System.out.printf("%d %.0f %.0f%n", i, a, b);

		}
		sc.close();
	}
}
