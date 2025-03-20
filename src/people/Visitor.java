package people;

public class Visitor {
	private String name;
	private int totalBill = 0;

	public Visitor(String name) {
		this.name = name;
	}
	
	public void addBill(int bill) {
		this.totalBill += bill;
	}
	
	public void showTotalPrice() {
		System.out.println(this.name + "'s bill: " + this.totalBill + "\n");
	}
}
