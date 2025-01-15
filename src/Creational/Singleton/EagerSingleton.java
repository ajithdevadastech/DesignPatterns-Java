package Creational.Singleton;

public class EagerSingleton {
	
	private EagerSingleton()
	{
		System.out.println("Eager Singleton implementation");
	}
	
	private static EagerSingleton eagerSingleton = new EagerSingleton();
	
	public static EagerSingleton getInstance()
	{
		return eagerSingleton;
	}
	//instance is created before knowing if its really required.
	
	public void showMessage()
	{
		System.out.println(this.hashCode());
	}
}
