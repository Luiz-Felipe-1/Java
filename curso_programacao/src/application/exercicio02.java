package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee x = new Employee();
		System.out.println("Digite os dados do Funcionário!");
		System.out.print("Nome: ");
		x.name = sc.nextLine();
		System.out.print("Salário Bruto: ");
		x.grossSalary= sc.nextDouble();
		System.out.print("Imposto: ");
		x.tax= sc.nextDouble();
		System.out.println();
		System.out.printf("Empolye %s %.2f\n",x.name, x.netSalary());
		System.out.print("Qual a porcentagem que quer acrescentar ao salário: ");
		double y = sc.nextDouble();
		x.increaseSalary(y);
		System.out.println("Update data: "+ x.name+x.netSalary());
		
		
		
		sc.close();
	}

}
