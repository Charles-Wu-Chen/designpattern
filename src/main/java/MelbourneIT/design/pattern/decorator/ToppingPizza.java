package MelbourneIT.design.pattern.decorator;

public abstract class ToppingPizza extends BasePizza {
	
	
	protected BasePizza basePizza;
	
	public ToppingPizza (BasePizza basePizza){
		this.basePizza = basePizza;
	}
	
	@Override
	public double getMyPrice(){
		return this.myPrice + this.basePizza.getMyPrice();
	}
}
