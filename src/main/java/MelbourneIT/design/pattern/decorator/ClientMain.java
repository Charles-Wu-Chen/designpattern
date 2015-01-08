package MelbourneIT.design.pattern.decorator;

/*
 * Consider a case of a pizza shop. 
 * In the pizza shop they will sell few pizza varieties 
 * and they will also provide toppings in the menu. 
 * Now imagine a situation wherein if the pizza shop has to provide prices for each combination of pizza 
 * and topping. Even if there are four basic pizzas and 8 different toppings, 
 * the application would go crazy maintaining all these concrete combination of pizzas and toppings.
 * Here comes the decorator pattern.
 */
public class ClientMain {
	public static void main(String [] args){
		
		BasePizza pizza1 = new HawaiianPizza();
		System.out.println("Plain HawaiianPizza : " + pizza1.getMyPrice() );
		
		 pizza1 = new ToppingBeefPizza(pizza1);
		System.out.println("HawaiianPizza with Beef topping : " + pizza1.getMyPrice() );
		
		pizza1 = new ToppingChickenPizza(pizza1);
		System.out.println("HawaiianPizza with Beef Chicken topping : " + pizza1.getMyPrice() );
		
		pizza1 = new ToppingMuttonPizza(pizza1);
		System.out.println("HawaiianPizza with Beef Chicken Mutton topping : " + pizza1.getMyPrice() );
		
		
		BasePizza pizza2 = new TariyakiPizza();
		System.out.println("Plain TariyakiPizza : " + pizza2.getMyPrice() );
		
		ToppingPizza pizzaWithBeef = new ToppingBeefPizza(pizza2);
		System.out.println("TariyakiPizza with Beef topping : " + pizzaWithBeef.getMyPrice() );
		
		ToppingPizza pizzaWithBeefChick = new ToppingChickenPizza(pizzaWithBeef);
		System.out.println("TariyakiPizza with Beef Chicken topping : " + pizzaWithBeefChick.getMyPrice() );
		
		ToppingPizza pizzaWithBeefChickMutton = new ToppingMuttonPizza(pizzaWithBeefChick);
		System.out.println("TariyakiPizza with Beef Chicken Mutton topping : " + pizzaWithBeefChickMutton.getMyPrice() );
		
	}
}
