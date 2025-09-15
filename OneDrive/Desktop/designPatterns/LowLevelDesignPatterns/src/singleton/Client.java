package singleton;

public class Client {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);
		
		
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1);
		
		
		
		
		SingletonWithHolder singleton2 = SingletonWithHolder.getInstance();
		SingletonWithHolder singleton3 = SingletonWithHolder.getInstance();
		System.out.println(singleton2);
		System.out.println(singleton3);
	}
	
}
