package page;

public class Menu {
	
	
	
	String code;
	String name;
	String price;
	
	
	
	
	
	
	public String getCode() {
		return code;
	}



	public String getName() {
		return name;
	}



	public String getPrice() {
		return price;
	}
	
	
	@Override
	public String toString() {
		return "Menu [code=" + code + ", name=" + name + ", price=" + price + "]";
	}



	public Menu(String code, String name, String price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	

}
