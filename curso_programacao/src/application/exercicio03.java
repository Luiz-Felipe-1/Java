package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student x = new Student();
		
		System.out.println("Digite os dados do aluno! ");
		System.out.print("Nome: ");
		x.name = sc.nextLine();
		for (int i = 0;i<3;i++) {
		System.out.printf("Nota %d: ",i+1);
		x.nota[i] = sc.nextDouble();
		};
		
		if(x.missingPoints()>0){
			System.out.println(x+"\n"+"Missing "+String.format("%.2f", x.missingPoints())+" Points");
		}else {
			System.out.println(x);
		}
		sc.close();
	}

}
