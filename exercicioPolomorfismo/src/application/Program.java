package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import entities.ImportedProduct;
import entities.UsedProduct;

public class Program{
	public static void main(String[] args) throws Exception {
		
		Integer items;
		String name;
		Double price, customsFee;
		String date;
		Date manufactureDate;
		Character type;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the numbers of products: ");
		items = sc.nextInt();
		
		for (Integer i = 1 ; i <= items; i++) {
			
			System.out.println();
			System.out.println("Product #" + i + " data:");
			System.out.print("Commin, used, or imported? (c/u/i): ");
			type = sc.next().charAt(0);
			System.out.print("Name: ");
			name = sc.next();
			System.out.print("Price: ");
			price = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Customs fee: ");
				customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			}
			
			if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				date = sc.next();
				System.out.println();
				manufactureDate = formatter.parse(date);
				products.add(new UsedProduct(name, price, manufactureDate));
			}
			
			products.add(new Product(name, price));
			
		}
		
		System.out.println("PRICE TAGS: ");
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}
}