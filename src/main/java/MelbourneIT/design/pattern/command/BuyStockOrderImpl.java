package MelbourneIT.design.pattern.command;

public class BuyStockOrderImpl implements OrderCommand {

	
	private StockTrade stock;
    public BuyStockOrderImpl ( StockTrade st) {
        stock = st;
    }
	public void execute() {
		stock.buy();
		
	}

}
