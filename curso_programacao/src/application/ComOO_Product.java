package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ComOO_Product {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in); 
		Product product = new Product();
		System.out.println("Digite os dados do produto!");
		System.out.printf("Digite o nome do produto: ");
		product.name = sc.nextLine();
		System.out.printf("Digite o preço do produto: ");
		product.price = sc.nextDouble();
		System.out.printf("Digite a quantidade do produto: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		System.out.println();
		
		System.out.printf("Digite a quantidades de produtos para ser colocado em estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Update data: " + product);
		System.out.println();
		
		System.out.printf("Digite a quantidade de produtos para ser retirado do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Update data: " + product);
		System.out.println();
		
		
		sc.close();
	}

}
