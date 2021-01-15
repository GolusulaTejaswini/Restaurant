package restaurant.models;

public class ViewOrder {
	private int Customer_ID;
	private int Order_ID;
	private int Order_Total;
	private String Company_Name;

	public ViewOrder() {
		
	}

	public ViewOrder( int Customer_ID, int Order_ID,int Order_Total,String Company_Name) {
		this.Customer_ID=Customer_ID;
		this.Order_ID=Order_ID;
		this.Order_Total=Order_Total;
		this.Company_Name=Company_Name;
	}

	public int getCustomer_ID() {
		return Customer_ID;
	}

	public void setCustomer_ID(int customer_ID) {
		Customer_ID = customer_ID;
	}

	public int getOrder_ID() {
		return Order_ID;
	}

	public void setOrder_ID(int order_ID) {
		Order_ID = order_ID;
	}

	public int getOrder_Total() {
		return Order_Total;
	}

	public void setOrder_Total(int order_Total) {
		Order_Total = order_Total;
	}

	public String getCompany_Name() {
		return Company_Name;
	}

	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}


}