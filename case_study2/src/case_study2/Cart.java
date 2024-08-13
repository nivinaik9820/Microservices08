package case_study2;

public class Cart {

	Product[][] carts;
	int[] cartSizes;
	
	
	Cart(int numberOfCustomer,int cartSize){
		carts = new Product[numberOfCustomer][cartSize];
		cartSizes= new int[numberOfCustomer];
	}
}
