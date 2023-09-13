package Cafe;

public class Cafe {
	

	String id;
	String name;
	int price;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public Cafe(String id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	public Cafe() {}
	
	
	@Override
	public String toString() {
		return "Cafe [번호=" + id + ", 이름=" + name + ", 가격=" + price + "]";
	}

}
