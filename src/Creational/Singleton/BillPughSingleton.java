package Creational.Singleton;

public class BillPughSingleton {
	
	private BillPughSingleton()
	{
		System.out.println("Bill Pugh Singleton Implementation");
	}
	
	private static class SingletonInstance
	{
		private static final BillPughSingleton billPughSingleton = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance()
	{
		return SingletonInstance.billPughSingleton;
	}

}
