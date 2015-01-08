package MelbourneIT.design.pattern.command;

import java.util.ArrayList;

//Invoker
public class StockBroker {
	private ArrayList<OrderCommand> m_ordersQueue = new ArrayList();

    public StockBroker() {
    }
    
    public void addOrder(OrderCommand order){
    	m_ordersQueue.add(order);
    }
    
    void placeOrder() {
    	for (OrderCommand tempOrder: m_ordersQueue)
    		tempOrder.execute();
    }    
}
