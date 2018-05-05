package orderprocessing;

public class Order {
	
	int orderId;
	int productId;
	int quantity;
	
	//constructor
	
	public Order(int productId, int quantity) {
		this.productId = productId;
		this.quantity = quantity;
	}
	
	//setters
	public void setOrderid(int orderId) {
		this.orderId = orderId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//getters
	public int getOrderId() {
		return orderId;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public int getQuantity() {
		return quantity;
	}

}
