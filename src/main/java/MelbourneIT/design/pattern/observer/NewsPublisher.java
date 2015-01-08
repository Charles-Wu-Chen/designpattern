package MelbourneIT.design.pattern.observer;

public interface NewsPublisher {
	public void addSubscriber(Subscriber subscriber);
	public void removeSubscriber(Subscriber subscriber);
	public void notifySubscribers();
	public void getLastestNews();
}
