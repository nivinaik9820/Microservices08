package pack1;

public class Main {
	public static void main(String args[]) {
		DeliveryManager manager= new DeliveryManager(5);
		//adding deliveries
		manager.addDelivery(new Product("laptop", 1), new Address("123 Main st", "springfield","12345"));
		manager.addDelivery(new Product("phone", 2), new Address("456 Elm st", "shelbyville","6789"));
	
//displaying deliveries
				System.out.println("Deliveries:");
		manager.displayDeliveries();
		//update delivery
		manager.updateDelivery(0, new Product("Tablet", 1));
		manager.updateDelivery(1, new Address("789 oak st","capital city", "13579"));
		// displaying deliveries after update
		System.out.println("\nUpdated deliveries:");
		manager.displayDeliveries();
		
		// REmoving a delivery
		manager.removeDelivery(0);
		//Displaying deliveries after removal
		System.out.println("\nDeliveryes after removal:");
		manager.displayDeliveries();
	}

}
