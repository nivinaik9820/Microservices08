package case_study2;

public class ProductManager {
	Product[] products;
	int productCount;
	
	ProductManager(int size){
		products= new Product[size];
		productCount=0;
		
	}
	void addProduct() {
		
	}
	void displayProducts() {
		
	}
	Product getProduct(int index) {
		if(index>=0 && index < productCount) {
			return products[index];
		}else {
			return null;
		}
	}

}
