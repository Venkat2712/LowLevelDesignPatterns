package observer;

public class CurrentStatisticsDisplay implements Display,Observer {

	private float temp;
	private Subject subject;
	
	
	
	CurrentStatisticsDisplay(Subject subject){
		this.subject=subject;
		subject.registerOberserver(this);
	}
	
	@Override
	public void update(float temperature) {
		this.temp=temperature;
		
		Display();
		
	}

	@Override
	public void Display() {
		
		System.out.println("Temperature  " + temp);
	}

}
