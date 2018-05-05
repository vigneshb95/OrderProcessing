package orderprocessing;

public class OrderService {

	productclass [] products = new productclass[2];
	
	public void InitializeProducts()
	{
	products[0] = new productclass(1, "Dell Inspiron", 649, "Professional Laptop AMD A6 processor", 10);
	products[1] = new productclass(2, "Moto G Plus", 204.99, "32GB unlocked", 5);
	}
	
	public static void main(String[] args) {
		
		OrderService Ordsev=new OrderService();
		Ordsev.InitializeProducts();
		Order order = new Order(7, 1);
		Ordsev.processOrder(order);
	}
	
        public void processOrder(Order a) {
		int flag=0;
		int Id = a.getProductId();
		int quantity=a.getQuantity();
		for(int i=0; i < products.length; i++) 
		{
			if(Id == products[i].getID())
			{
				
				flag=1;
			
		if(quantity<=products[i].getQuantity())
		{
		
			products[i].setQuantity(products[i].getQuantity()-quantity);
			
			System.out.println(products[i].getQuantity());
			
			System.out.println("order is processesd");
		}
			else {
				
		System.out.println("unable to process the order");		
				
			}
		}	
			
			
		
	}
		if(flag==0)
		{
		
		System.out.println("no products of this order type");
	
	

        }
}
}
