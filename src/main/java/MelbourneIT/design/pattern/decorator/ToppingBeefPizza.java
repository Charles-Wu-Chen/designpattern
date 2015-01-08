package MelbourneIT.design.pattern.decorator;

public class ToppingBeefPizza extends ToppingPizza {
	public ToppingBeefPizza(BasePizza basePizza){
		super(basePizza);
		this.myPrice=0.99;
	}
}
