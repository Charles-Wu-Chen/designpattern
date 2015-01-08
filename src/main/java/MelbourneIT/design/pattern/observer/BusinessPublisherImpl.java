package MelbourneIT.design.pattern.observer;

import java.util.ArrayList;

public class BusinessPublisherImpl implements NewsPublisher {

	private ArrayList<Subscriber> subscriberList = new ArrayList<Subscriber>(); 
	
	public void addSubscriber(Subscriber subscriber) {
		subscriberList.add(subscriber);

	}

	public void removeSubscriber(Subscriber subscriber) {
		subscriberList.remove(subscriber);

	}

	public void notifySubscribers() {
		
		for (Subscriber subscriber : subscriberList){
			subscriber.update(this);
		}
	}
	
	public void getLastestNews(){
		double d = Math.random();
		System.out.println("Business get Lastest News: " + d);
	}

}
