package observer;

public class Client {
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		
		CurrentStatisticsDisplay display1 = new CurrentStatisticsDisplay(data);
		CurrentStatisticsDisplay display2 = new CurrentStatisticsDisplay(data);
		
		data.setMeasurements(96.6f);
		
		
		data.removeObserver(display1);
		data.setMeasurements(96.6f);
	}

}
