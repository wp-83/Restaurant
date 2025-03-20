package People;

import java.util.ArrayList;

import restaurant.CookHistory;
import restaurant.Food;

public class Chef {
	private String name;
	private ArrayList<CookHistory> foodCooked = new ArrayList<CookHistory>();

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addCookHistory(Food food, int amount) {
		CookHistory temp = new CookHistory(food, amount);
		
		if (foodCooked.isEmpty() || !foodCooked.contains(temp)) {
			foodCooked.add(temp);
			return;
		}
		
		if (foodCooked.contains(temp)){
			for (CookHistory c : foodCooked) {
				if (c.getFood().getName().equals(food.getName())) {
					c.setAmount(c.getAmount() + temp.getAmount());
				}
			}
		}
	}
	
	public void showCookHistory() {
		System.out.println("=== " + this.name + "'s Cook(s) History ===");
		if (foodCooked.isEmpty()) {
			System.out.println("No food(s) available.");
			return;
		}
		
		for (CookHistory c : foodCooked) {
			System.out.println(" - " + c.getFood().getName() + " || " + c.getAmount() + " portion(s).");
		}
		
		System.out.println();
	}
}
