package entitites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entitites.enums.OrderStatus;

public class Order {
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public Order(LocalDate moment, Client client, OrderStatus status) {
		this.moment = moment;
		this.client = client;
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		
		for (OrderItem orderItem : items) {
			sum += orderItem.subTotal();
		}
		
		return sum;
	}
	
	public String getMoment() {
		return "Order moment: " + moment.format(dtf);
	}
	
	public String getStatus() {
		return "Order status: " + this.status;
	}
	
	public Client getClientInfo() {
		return this.client;
	}
	
	public List<OrderItem> getOrderInfo() {
		return this.items;
	}
}
