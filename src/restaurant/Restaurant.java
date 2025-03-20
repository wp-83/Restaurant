package restaurant;

import java.util.ArrayList;

import People.Chef;
import People.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Chef> chefs;
	private ArrayList<Menu> menus;
	private int netIncome = 0;

	public Restaurant(String name) {
		chefs = new ArrayList<Chef>();
		menus = new ArrayList<Menu>();
		this.name = name;
	}
	
	public void addChef(Chef chef) {
		this.chefs.add(chef);
	}
	
	public void addMenu(Menu menu) {
		this.menus.add(menu);
	}

	public void showMenu() {
		if (menus.isEmpty()) {
			System.out.println("No menu(s) available.");
			return;
		}
		
		System.out.println("======= List of Menu(s) =======");
		for (Menu m : menus) {
			System.out.println("- Menu type: " + m.getType());
			
			for (Food f : m.getFoods()) {
				System.out.println("   - " + f.getName() + " (" + f.getPrice() + ")");
			}
		}
		
		System.out.println("==============================\n");
	}

	public void showChef() {
		if (chefs.isEmpty()) {
			System.out.println("No chef(s) available.");
			return;
		}
		
		System.out.println("=== List of Chef(s) ===");
		for (Chef c : chefs) {
			System.out.println("- " + c.getName());
		}
		System.out.println("=======================\n");
	}
	
	public void order(Chef chef, Visitor visitor, String foodName, int amount) {
		for (Menu m : menus) {
			for (Food f : m.getFoods()) {
				if (f.getName().equals(foodName)) {
					visitor.addBill(f.getPrice() * amount);
					this.netIncome += f.getPrice() * amount;
					chef.addCookHistory(f, amount);
					return;
				}
			}
		}
	}
	
	public void showTotalIncome() {
		System.out.println("Net income of '" + this.name + "' restaurant: " + this.netIncome);
	}
	

}
