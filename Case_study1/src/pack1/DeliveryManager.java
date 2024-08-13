package pack1;


public class DeliveryManager {
	Delivery[] deliveries;
	int count;
	
	DeliveryManager(int size){
		deliveries = new Delivery[size];
		count =0;
	}
	
	void addDelivery(Product product,Address address) {
		if(count<deliveries.length) {
			deliveries[count++]=new Delivery(product,address);
		}else {
			System.out.println("Delivery list is full");
		}
	}
	void removeDelivery(int index) {
		
		if(index>=0 && index < count) {
			for(int i=index;i<count-1;i++) {
				deliveries[i]=deliveries[i+1];
			}
			deliveries[--count]=null;
			
			
		}
		else {
			System.out.println("Invalid index.");
		}
			
	}
	void updateDelivery(int index,Product newProduct) {
		
			
			if(index>=0 && index < count) {
				deliveries[index].product=newProduct;
			
		}else {
			System.out.println("Invalid index");
		}
			

		
	}
	void updateDelivery(int index,Address newAddress) {
		
		if(index>=0 && index < count) {
			deliveries[index].address=newAddress;

		
	}else {
		System.out.println("Invalid index");
	}
		
	}
	void updateDelivery(int index,Product newProduct,Address newAddress) {
		
		if(index>=0 && index < count) {
			deliveries[index].product=newProduct;

			deliveries[index].address=newAddress;

		
	}else {
		System.out.println("Invalid index");
	}
		
	}
	
	void displayDeliveries() {
		for(int i=0;i<count;i++) {
			System.out.println(deliveries[i]);
		}
	}

}
	
