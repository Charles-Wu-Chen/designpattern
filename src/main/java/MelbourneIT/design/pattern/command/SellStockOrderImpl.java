package MelbourneIT.design.pattern.command;

public class SellStockOrderImpl implements OrderCommand {
	

	private StockTrade stock;
    public SellStockOrderImpl ( StockTrade st) {
        stock = st;
    }

	
	public void execute() {
		
		stock.sell();
	}

}
