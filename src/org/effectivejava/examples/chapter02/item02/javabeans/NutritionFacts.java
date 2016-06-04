package org.effectivejava.examples.chapter02.item02.javabeans;

/**
 * JavaBeans Pattern
 * - allows inconsistency, mandates mutability
 *
 * @since 2016. 5. 14.
 * @author Digitanomad
 */
public class NutritionFacts {
	// Parameters initialized to default values (if any)
	private int servingSize = -1;	// Required; no default value
	private int servings = -1;		// Required; no default value
	private int calories = 0;
	private int fat = 0;
	private int sodium = 0;
	private int carbohydrate = 0;
	
	public NutritionFacts() {
	}
	
	// Setters
	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}
	
	public void setServings(int servings) {
		this.servings = servings;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public void setFat(int fat) {
		this.fat = fat;
	}
	
	public void setSodium(int sodium) {
		this.sodium = sodium;
	}
	
	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	
	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts();
		cocaCola.setServingSize(240);
		cocaCola.setServings(8);
		cocaCola.setCalories(100);
		cocaCola.setSodium(35);
		cocaCola.setCarbohydrate(27);
	}
}
