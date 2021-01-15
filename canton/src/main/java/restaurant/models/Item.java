package restaurant.models;

public class Item {
	private Integer Item_ID;
	private String Item_Name;
	private String Item_Type;
	private String Item_Size;
	private int Price;

	public Item() {
		
	}

	public Item(int Item_ID,String Item_Name, String Item_Type, String Item_Size,int Price) {
		this.Item_ID=Item_ID;
		this.Item_Name=Item_Name;
		this.Item_Type=Item_Type;
		this.Item_Size=Item_Size;
		this.Price=Price;
	}

	public Integer getItem_ID() {
		return Item_ID;
	}

	public void setItem_ID(Integer item_ID) {
		Item_ID = item_ID;
	}

	public String getItem_Name() {
		return Item_Name;
	}

	public void setItem_Name(String item_Name) {
		Item_Name = item_Name;
	}

	public String getItem_Type() {
		return Item_Type;
	}

	public void setItem_Type(String item_Type) {
		Item_Type = item_Type;
	}

	public String getItem_Size() {
		return Item_Size;
	}

	public void setItem_Size(String item_Size) {
		Item_Size = item_Size;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

}
