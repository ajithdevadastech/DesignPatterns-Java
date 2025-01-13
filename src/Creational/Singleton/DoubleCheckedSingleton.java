package Creational.Singleton;

public class DoubleCheckedSingleton {
	
	private DoubleCheckedSingleton()
	{
		System.out.println("Double Check locking method - Singleton");
	}
	
	private static DoubleCheckedSingleton doubleCheckedSingleton;
	
	public static DoubleCheckedSingleton getInstance()
	{
		if (doubleCheckedSingleton == null)
		{
			synchronized(DoubleCheckedSingleton.class)
			{
				doubleCheckedSingleton = new DoubleCheckedSingleton();
			}
		}
		
		return doubleCheckedSingleton;
	}

}
