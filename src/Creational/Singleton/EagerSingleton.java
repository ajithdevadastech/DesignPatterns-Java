package Creational.Singleton;

public class EagerSingleton {
	
	private EagerSingleton()
	{
		System.out.println("Eager Singleton implementation");
		//protection against reflection
		if (eagerSingleton != null)
		{
			throw new IllegalStateException("Singleton Instance already created.");
		}
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
