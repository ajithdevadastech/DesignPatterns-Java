package Creational.Singleton;

public class DoubleCheckedSingleton {
	
	private DoubleCheckedSingleton()
	{
		System.out.println("Double Check locking method - Singleton");
		//protection against reflection
		if (doubleCheckedSingleton != null)
		{
			throw new IllegalStateException("Singleton Instance already created.");
		}
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
	
	public void showMessage()
	{
		System.out.println(this.hashCode());
	}

}
