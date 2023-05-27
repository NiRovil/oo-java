package mainProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import entitites.Client;
import entitites.Order;
import entitites.OrderItem;
import entitites.Product;
import entitites.enums.OrderStatus;

public class App {

	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		System.out.print("How many items in this order? ");
		Integer n = sc.nextInt();
		
		LocalDate moment = LocalDate.now();
		Order order = new Order(moment, client, status);
		Integer count = 1;
		while(count <= n) {
			System.out.println("Enter #" + count + " item data:");
			System.out.print("Product name: ");
			String pName = sc.next();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			order.addItem(new OrderItem(quantity, price, new Product(pName, price)));
			count++;
		}
		
		System.out.println(order.getMoment());
		System.out.println(order.getStatus());
		System.out.println(order.getClientInfo());
		System.out.println("Order items: ");
		for (OrderItem orderItem: order.getOrderInfo()) {
			System.out.print(orderItem.getProduct().getName() + ", " + orderItem.getPrice() + 
					", Quantity:" + orderItem.getQuantity() + ", Subtotal: " + orderItem.subTotal());
		}
		System.out.print("Total price: " + order.total());
		
		
		sc.close();

	}

}
