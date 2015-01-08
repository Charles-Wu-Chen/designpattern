package MelbourneIT.design.pattern.command;

//http://www.oodesign.com/command-pattern.html
//client main class
public class Client {
	public static void main(String[] args) {
        StockTrade stock = new StockTrade();
        OrderCommand bsc = new BuyStockOrderImpl (stock);
        OrderCommand ssc = new SellStockOrderImpl (stock);
        StockBroker agent = new StockBroker();

        agent.addOrder(bsc); // Buy Shares
        agent.addOrder(ssc); // Sell Shares
        
        agent.placeOrder();
    }
}
