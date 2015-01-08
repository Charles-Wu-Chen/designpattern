package MelbourneIT.design.pattern.decorator;

public class ToppingChickenPizza extends ToppingPizza {
	public ToppingChickenPizza(BasePizza basePizza){
		super(basePizza);
		this.myPrice=2.99;
	}
}
