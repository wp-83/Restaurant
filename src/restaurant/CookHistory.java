package restaurant;

public class CookHistory {
	private Food food;
	private int amount;
	
	public CookHistory(Food food, int amount) {
		this.food = food;
		this.amount = amount;
	}

	public Food getFood() {
		return food;
	}

	public int getAmount() {
		return amount;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
