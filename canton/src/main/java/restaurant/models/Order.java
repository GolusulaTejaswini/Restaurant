package restaurant.models;

public class Order {
	private int Number_Of_Items;
	private int Order_Total;
	private int Customer_ID;
	private int ForDelivery;

	public Order() {
		
	}

	public Order( int NumberOfItems, int OrderTotal,int CustomerID,int For_Delivery) {
		this.Number_Of_Items=NumberOfItems;
		this.Order_Total=OrderTotal;
		this.Customer_ID=CustomerID;
		this.ForDelivery=For_Delivery;
	}


	public int getNumber_Of_Items() {
		return Number_Of_Items;
	}

	public void setNumber_Of_Items(int number_Of_Items) {
		this.Number_Of_Items = number_Of_Items;
	}

	public int getOrder_Total() {
		return Order_Total;
	}

	public void setOrder_Total(int order_Total) {
		this.Order_Total = order_Total;
	}

	public int getCustomer_ID() {
		return Customer_ID;
	}

	public void setCustomer_ID(int customer_ID) {
		this.Customer_ID = customer_ID;
	}

	public int getForDelivery() {
		return ForDelivery;
	}

	public void setForDelivery(int forDelivery) {
		this.ForDelivery = forDelivery;
	}


}
