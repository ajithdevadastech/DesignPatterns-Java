package Creational.Singleton;

public class LazySingleton {
	
	//private constructor
	private LazySingleton() 
	{
		System.out.println("Lazy Singleton implementation");
	}
	
	//single variable, null value
	private static LazySingleton instance;
	
	//public static getInstance
	
	public static LazySingleton getInstance()
	{
		//check if instance is null
		if (instance == null)
		{
			instance = new LazySingleton();
		}
		
		//return new or existing instance
		return instance;
	}
	
	//This implementation is not thread-safe. If multiple threads call getInstance() 
	//simultaneously when instance is null, it's possible to create multiple instances.
	
	public void showMessage()
	{
		System.out.println(this.hashCode());
	}
}
