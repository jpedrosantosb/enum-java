package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Programa {

	public static void main(String[] args) {
	
		Order order = new Order(2603, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);

		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.ENTREGUE;
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
