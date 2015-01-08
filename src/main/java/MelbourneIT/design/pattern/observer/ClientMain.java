package MelbourneIT.design.pattern.observer;

public class ClientMain {
	public static void main (String [] args){
		System.out.println("---------Start Oberserver Demo------------");
		
		Subscriber sub1 = new SubscriberImpl("sub1");
		Subscriber sub2 = new SubscriberImpl("sub2");
		
		NewsPublisher business = new BusinessPublisherImpl();
		NewsPublisher sports = new SportsPublisherImpl();
		
		business.addSubscriber(sub1);
		sports.addSubscriber(sub1);
		sports.addSubscriber(sub2);
		
		business.notifySubscribers();
		sports.notifySubscribers();
		
	}
}	
