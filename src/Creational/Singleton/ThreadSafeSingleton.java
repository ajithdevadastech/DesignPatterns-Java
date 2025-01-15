package Creational.Singleton;

public class ThreadSafeSingleton {
	
	private ThreadSafeSingleton()
	{
		System.out.println("Thread Safe Singleton using Synchorization");
	}
	
	private static ThreadSafeSingleton threadSafeSingleton;
	
	public static synchronized ThreadSafeSingleton getInstance()
	{
		if (threadSafeSingleton == null)
		{
			threadSafeSingleton = new ThreadSafeSingleton();
		}
		return threadSafeSingleton;
	}
	
	//reference: https://blog.algomaster.io/p/singleton-design-pattern
	
	public void showMessage()
	{
		System.out.println(this.hashCode());
	}

}
