package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	
	private float temperature;
	private List<Observer> observers;
	
	
	
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}




	@Override
	public void registerOberserver(Observer o) {
		System.out.println("New Observer registered");
		observers.add(o);		
	}




	@Override
	public void removeObserver(Observer o) {
		System.out.println("Observer removed");
		observers.remove(o);
		
	}




	@Override
	public void notifyObserver() {
		for(Observer o : observers) {
			o.update(temperature);
		}
		
	}
	
	
	public void measurementsChanged() {
		notifyObserver();
	}
	
	
	public void setMeasurements(float temperature) {
		this.temperature = temperature;
		measurementsChanged();
	}

}
