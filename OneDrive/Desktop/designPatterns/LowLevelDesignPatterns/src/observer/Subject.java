package observer;

public interface Subject {
	
	void registerOberserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
	

}
