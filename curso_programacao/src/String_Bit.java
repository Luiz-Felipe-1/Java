import java.util.Locale;
import java.util.Scanner;

public class String_Bit {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

	}

	public static void ExemploBite(String[] args) {
		Locale.setDefault(Locale.US);
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		int n = sc.nextInt();
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}
		sc.close();
	}

	public static void ExemploString(String[] args) {
		Locale.setDefault(Locale.US);
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Original: -" + original + "-");// original
		System.out.println("toLowerCase: -" + s01 + "-");// Minusculo
		System.out.println("toUpperCase: -" + s02 + "-");// Maiusculo
		System.out.println("trim: -" + s03 + "-");// remove os espaços em branco
		System.out.println("substring(2): -" + s04 + "-");// limitar onde começa
		System.out.println("substring(2, 9): -" + s05 + "-");// limitar onde começa e onde termina
		System.out.println("replace('a', 'x'): -" + s06 + "-");// trocar uma letra por outra
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");// trocar uma ou mais letra por outras
		System.out.println("Index of 'bc': " + i);// verificar onde tem o primeiro o bc
		System.out.println("Last index of 'bc': " + j);// verificar onde tem o ultimo bc

	}

	public static void ExemploString01(String[] args) {
		Locale.setDefault(Locale.US);
		String s = "potato apple lemon";
		String[] vect = s.split(" ");// split da string s separa por espaço cada string
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		System.out.printf("%s%n", word1);
		System.out.printf("%s%n", word2);
		System.out.printf("%s%n", word3);
		for (int k = 0; k < 3; k++) {
			System.out.printf("%s%n", vect[k]);
		}
	}

}
