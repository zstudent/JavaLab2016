package kitchen;

import java.util.function.Supplier;



public class Cook {
	

	public static void main(String[] args) {
		
		
		Supplier<String> meat = () -> Recipe.cook("meat");
		Supplier<String> salt = () -> Recipe.cook("salt");
		Supplier<String> fire = () -> Recipe.cook("fire");
		Supplier<String> fish = () -> Recipe.cook("fish");
		Supplier<String> fresh = () -> Recipe.cook("orange fresh");
		Supplier<String> beans = () -> Recipe.cook("coffee beans");
		Supplier<String> water = () -> Recipe.cook("water");
		Supplier<String> roastedCoffee = () -> Recipe.cook("roasted coffee", beans, fire);
		Supplier<String> groundCoffee = () -> Recipe.cook("ground coffee", roastedCoffee);
		
		
		Supplier<String> kebab = () -> Recipe.cook("kebab", meat, salt, fire);
		Supplier<String> grilledFish = () -> Recipe.cook("grilled fish", fish, salt, fire);
		Supplier<String> coffee = () -> Recipe.cook("coffee", groundCoffee, water, fire);

		Supplier<String> dinner = () -> Recipe.cook("dinner", kebab, grilledFish, fresh, coffee);
		
		Recipe.strategy = new AsyncStrategy();
		System.out.println(dinner.get());

//		System.out.println("--< Sequential >--");
//		System.out.println(kebab.get());
//		
//		System.out.println("--< Async >--");
//		Recipe.strategy = new AsyncStrategy();
//		System.out.println(kebab.get());
//		
//		System.out.println("--< AsyncThen >--");
//		Recipe.strategy = new AsyncStrategy();
//		System.out.println(kebab.get());
		
	}
	
}
