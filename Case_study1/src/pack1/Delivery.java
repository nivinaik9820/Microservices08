package pack1;

public class Delivery {
    Product product;
    Address address;
    
    Delivery(Product product,Address address){
        this.product=product;
        this.address=address;
    }
    public String toString(){
        return "Product: "+product.name+",Quality:"+product.quality +",Address:"+address.street+","+address.city+","+address.postalcode;
    }


}
