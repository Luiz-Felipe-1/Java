import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("teste");
	}

	public static void exemplo01(String[] args) {

		String product1 = "computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);

	}

	public static void exemplo02(String[] args) {

		double b, B, h, area;
		b = 6;
		B = 8;
		h = 5;
		area = ((b + B) / 2) * h;
		System.out.println("Àrea");
		System.out.printf("a base menor é %.2f cm a base maior é %.2f cm a altura é %.2f cm e a área é: %.2f cm2%n", b,
				B, h, area);

		int a1, b1;
		double resultado;
		a1 = 5;
		b1 = 2;
		resultado = (double) a1 / b1;
		System.out.println(resultado);

		double a2;
		int b2;
		a2 = 5.0;
		b2 = (int) a2;
		System.out.println(b2);

	}

	public static void exemplo03(String[] args) {

		Locale.setDefault(Locale.US);
		String nome = "Luiz";
		int idade = 23;
		double renda = 4000.0;
		int x = 18;
		double y = 10.35784;
		System.out.println(x);
		System.out.printf("Número Completo: %f%n", y);
		System.out.printf("Duas casas decimais: %.2f%n", y);
		System.out.printf("Três casas decimais: %.3f%n", y);
		System.out.printf("Quatro casas decimais: %.4f%n", y);
		System.out.println("O Resultado é: " + x + " Metros");
		System.out.printf("O Resultado é: %.2f Metros%n", y);
		System.out.printf("%s tem %d anos e ganha R$ %.2f Reais%n", nome, idade, renda);
		System.out.println(nome + " tem " + idade + " anos e ganha R$ " + renda + " Reais");
		// ln após o print é quebra de linha
		// %d int %f float %s string %n pular linha %.1f escolher quantos números após a
		// virgula

	}

	public static void exemplo04(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double w;
		char z;
		x = sc.next();
		y = sc.nextInt();
		w = sc.nextDouble();
		z = sc.next().charAt(0);
		System.out.println("você digitou: " + x);
		System.out.println("você digitou: " + y);
		System.out.println("você digitou: " + w);
		System.out.println("você digitou: " + z);
		// não ler o espaço. espaço conta como enter.

		sc.close();

	}

	public static void exemplo05(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = sc.nextInt();
		sc.nextLine();
		// usar quando usar um next int ou outro junto com nextline.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados Digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		// ler o espaço
		sc.close();
	}

	public static void exemplo06(String[] args) {

		double x, y, z, A, B, C, a, b, c, delta, x1, x2;
		x = 3.0;
		y = 4.0;
		z = -5.0;
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrade de " + x + " = " + A);
		System.out.println("Raiz quadrade de " + y + " = " + B);
		System.out.println("Raiz quadrade de 25 = " + C);

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);

		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("o Valor absoluto de " + y + " = " + A);
		System.out.println("o Valor absoluto de " + z + " = " + B);
		a = 1;
		b = -6;
		c = 5;
		delta = Math.pow(b, 2.0) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

		System.out.println("o valor de A é: " + a + " o valor de B é: " + b + " O valor de C é: " + c);
		System.out.println("o Valor de delta é: " + delta);
		System.out.println("a Solução é x1: " + x1 + " x2: " + x2);
	}

	public static void exercicio01(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.printf("Digite o Primeiro Núemro: ");
		a = sc.nextInt();
		System.out.printf("Digite o segundo Número: ");
		b = sc.nextInt();
		System.out.println();
		c = a + b;
		System.out.printf("a Soma dos números %d + %d = %d%n", a, b, c);
		sc.close();

	}

	public static void exercicio02(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double a, c;
		System.out.printf("Digite o raio do circulo: ");
		a = sc.nextDouble();
		System.out.println();
		c = (Math.pow(a, 2.0) * 3.14159);
		System.out.printf("a área do círculo com raio %.2f é = %.4f%n", a, c);
		sc.close();

	}

	public static void exercicio03(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, r;
		System.out.printf("Digite o Primeiro Núemro: ");
		a = sc.nextInt();
		System.out.printf("Digite o segundo Número: ");
		b = sc.nextInt();
		System.out.printf("Digite o terceiro Núemro: ");
		c = sc.nextInt();
		System.out.printf("Digite o quarto Número: ");
		d = sc.nextInt();
		r = (a * b - c * d);
		System.out.printf("a diferença do produto de %d e %d pelo produto de %d e %d é: %d ", a, b, c, d, r);
		sc.close();

	}

	public static void exercicio04(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		double c, d;

		System.out.printf("Digite sua matrícula: ");
		a = sc.nextInt();
		System.out.printf("Digite a quantidade de horas trabalhadas: ");
		b = sc.nextInt();
		System.out.printf("Digite o valor da hora trabalhada: ");
		c = sc.nextDouble();
		d = (double) b * c;
		System.out.printf("o Funcionario %d trabalhou %d no valor de %.2f por hora recebendo no total: %.2f", a, b, c,
				d);

		sc.close();

	}

	public static void exercicio05(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, a1, b1;
		double c, c1, d;
		System.out.printf("Digite o código da peça: ");
		a = sc.nextInt();
		System.out.printf("Digite a quantidade: ");
		b = sc.nextInt();
		System.out.printf("Digite o valor Unitárioda peça do código %d: ", a);
		c = sc.nextDouble();
		System.out.printf("Digite o código da peça: ");
		a1 = sc.nextInt();
		System.out.printf("Digite a quantidade: ");
		b1 = sc.nextInt();
		System.out.printf("Digite o valor Unitário da peça do código %d: ", a1);
		c1 = sc.nextDouble();
		d = (double) b * c + b1 * c1;
		System.out.printf("o valor a pagar é %.2f", d);

		sc.close();

	}

	public static void exercicio06(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.printf("Digite o código da peça: ");
		a = sc.nextDouble();
		System.out.printf("Digite a quantidade: ");
		b = sc.nextDouble();
		System.out.printf("Digite o valor Unitário: ");
		c = sc.nextDouble();

		System.out.printf("a área do triângulo retângulo que tem A por base e C por altura = %.3f%n", a * c / 2);
		System.out.printf("a área do círculo de raio C. (pi = 3.14159)= %.3f%n", Math.pow(c, 2) * 3.14159);
		System.out.printf("c) a área do trapézio que tem A e B por bases e C por altura = %.3f%n", ((a + b) * c) / 2);
		System.out.printf("a área do quadrado que tem lado B = %.3f%n", b * b);
		System.out.printf("área do retângulo que tem lados A e B = %.3f%n", a * b);

		sc.close();

	}

}
