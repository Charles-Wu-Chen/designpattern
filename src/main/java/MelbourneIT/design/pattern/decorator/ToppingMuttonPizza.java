package MelbourneIT.design.pattern.decorator;

public class ToppingMuttonPizza extends ToppingPizza {
	public ToppingMuttonPizza(BasePizza basePizza){
		
		super(basePizza);
		this.myPrice = 1.99;
	}
}
