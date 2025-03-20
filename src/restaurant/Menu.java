package restaurant;

import java.util.ArrayList;

public class Menu {
	private String type;
	private ArrayList<Food>foods;

	public Menu(String type) {
		foods = new ArrayList<Food>();
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}

	public void add(Food food) {
		this.foods.add(food);
	}
	
	
}
