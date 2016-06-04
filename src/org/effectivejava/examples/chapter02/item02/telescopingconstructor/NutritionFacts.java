package org.effectivejava.examples.chapter02.item02.telescopingconstructor;

/**
 * Telescoping constructor pattern
 * - does not scale well!
 *
 * @since 2016. 5. 14.
 * @author Digitanomad
 */
public class NutritionFacts {
	private final int servingSize;	//	(mL)			required
	private final int servings;		//	(per container) required
	private final int calories;		//					optional
	private final int fat;			//	(g)				optional
	private final int sodium;		//	(mg)			optional
	private final int carbohydrate;	//	(g)				optional
	
	public NutritionFacts(int servingSize, int servings) {
		this(servingSize, servings, 0);
	}
	
	public NutritionFacts(int servingSize, int servings, int calories) {
		this(servingSize, servings, calories, 0);
	}
	
	public NutritionFacts(int servingSize, int servings, int calories, int fat) {
		this(servingSize, servings, calories, fat, 0);
	}
	
	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
		this(servingSize, servings, calories, fat, sodium, 0);
	}
	
	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbonhydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbonhydrate;
	}
	
	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);
	}
}