package singleton;

public class SingletonWithHolder {
	
	private SingletonWithHolder() {
		
	}
	
	//Singleton with inner static class
	
	private static class Holder{
		private static  SingletonWithHolder INSTANCE = new SingletonWithHolder();
	}
	
	
	public static SingletonWithHolder getInstance() {
		return Holder.INSTANCE;
	}

}
