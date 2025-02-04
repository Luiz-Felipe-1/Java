import java.util.Locale;
import java.util.Scanner;

public class estrutura_condicional {

	public static void main(String[] args) {
exemplo02(args);
	}

	public static void exemplo01(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int hora;
		System.out.printf("Digite a hora: ");
		hora = sc.nextInt();
		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.printf("Boa noite!");
		}

		sc.close();
	}

	public static void exemplo02(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		String dia;
		System.out.printf("Digite o número do dia: ");
		m = sc.nextInt();
		switch (m) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido!";
			break;
		}

		System.out.printf("Dia da semana: %s", dia);
		sc.close();
	}

	public static void exemplo03(String[] args) {
		double preco = 34.5;
		double desconto;
		if (preco < 20) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		System.out.printf("a peça de %.2f foi para R$%.2f com desconto de R$%.2f%n", preco, (preco - desconto),
				desconto);
		preco = 40.00;
		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.printf("a peça de %.2f foi para R$%.2f com desconto de R$%.2f%n", preco, (preco - desconto),
				desconto);
	}

	public static void exemplo04(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();

		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;

		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
	}

	public static void exercicio01(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n;
		System.out.printf("Digite um número positivo ou negativo: ");
		n = sc.nextInt();
		if (n >= 0) {
			System.out.println("Positivo!");
		} else {
			System.out.println("Negativo!");
		}

		sc.close();
	}

	public static void exercicio02(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int a;
		System.out.printf("Digite um número: ");
		a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("par!");
		} else {
			System.out.println("Impar");
		}

		sc.close();
	}

	public static void exercicio03(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int a, b;
		System.out.printf("Digite um número : ");
		a = sc.nextInt();
		System.out.printf("Digite um número : ");
		b = sc.nextInt();
		if ((a % b == 0) || (b % a == 0)) {
			System.out.println("são Multiplos!");
		} else {
			System.out.println("Não são multiplos");
		}

		sc.close();
	}

	public static void exercicio04(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int a, b;
		System.out.printf("Digite a hora do ínicio do jogo: ");
		a = sc.nextInt();
		System.out.printf("Digite a hora do final do jogo: ");
		b = sc.nextInt();

		if (a < b) {
			System.out.printf("Duração do jogo foi %d horas!", b - a);
		} else {
			System.out.printf("Duração do jogo foi %d horas!", 24 - a + b);
		}

		sc.close();
	}

	public static void exercicio05(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int a, b;
		double c = 0;
		System.out.printf("Digite código do produto: ");
		a = sc.nextInt();
		System.out.printf("Digite a quantidade: ");
		b = sc.nextInt();
		if (a == 1) {
			c = (double) 4.00 * b;
		} else if (a == 2) {
			c = (double) 4.50 * b;
		} else if (a == 3) {
			c = (double) 5.00 * b;
		} else if (a == 4) {
			c = (double) 2.00 * b;
		} else if (a == 5) {
			c = (double) 1.50 * b;
		}

		System.out.printf("o Valor total foi: R$%.2f", c);
		sc.close();
	}

	public static void exercicio06(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double a;
		System.out.printf("Digite um Valor: ");
		a = sc.nextDouble();

		if ((a > 0) && (a <= 25)) {
			System.out.println("Intervalo [0,25]\n");
		} else if (a <= 50) {
			System.out.println("Intervalo [25,50]\n");
		} else if (a <= 75) {
			System.out.println("Intervalo [50,75]\n");
		} else if (a <= 100) {
			System.out.println("Intervalo [75,100]\n");
		} else {
			System.out.println("Fora do intervalo\n");
		}
		sc.close();
	}

	public static void exercicio07(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double x, y;
		System.out.printf("Digite um ponto: ");
		x = sc.nextDouble();
		System.out.printf("Digite outro ponto: ");
		y = sc.nextDouble();

		if ((x == 0) && (y == 0)) {
			System.out.println("Origem\n");
		} else if (x == 0.0) {
			System.out.println("Eixo Y");
		} else if (y == 0.0) {
			System.out.println("Eixo X");
		} else if ((x > 0) && (y > 0)) {
			System.out.println("Q1\n");
		} else if ((x > 0) && (y < 0)) {
			System.out.println("Q4\n");
		} else if ((x < 0) && (y > 0)) {
			System.out.println("Q2");
		} else {
			System.out.println("Q3");
		}
		sc.close();
	}

	public static void exercicio08(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double x, y;
		System.out.printf("Digite seu salário: ");
		x = sc.nextDouble();

		if (x <= 2000.00) {
			System.out.println("Isento\n");
		} else if (x <= 3000.0) {
			y = (x - 2000.0) * 0.08;
			System.out.printf("R$ %.2f%n", y);
		} else if (x <= 4500.0) {
			y = (x - 3000.0) * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", y);
		} else {
			y = (x - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf(" taxa de imposto: R$ %.2f%n", y);
		}

		sc.close();
	}

	public static void exercicio09(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		double t = 50.00;
		System.out.println("Quantos minutos foi usado no mês: ");
		m = sc.nextInt();
		if (m > 100) {
			t += (double) (m - 100) * 2;
			System.out.printf("o Valor a pagar é R$%.2f%n", t);
		} else {

			System.out.printf("o valor a ser pago é R$%.2f", t);
		}
		sc.close();
	}

}
