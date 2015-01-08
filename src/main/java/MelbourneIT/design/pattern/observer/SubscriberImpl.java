package MelbourneIT.design.pattern.observer;

public class SubscriberImpl implements Subscriber {

	private String subscriberName ;
	public SubscriberImpl(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	public void update(NewsPublisher news) {
		System.out.println("in subscriber with name "+subscriberName);
		news.getLastestNews();
	}

}
