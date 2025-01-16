package Creational.Singleton;

public class BillPughSingleton {
	
	private BillPughSingleton()
	{
		System.out.println("Bill Pugh Singleton Implementation");
		//protection against reflection
//		if (billPughSingleton != null)
//		{
//			throw new IllegalStateException("Singleton Instance already created.");
//		}
	}
	
	private static class SingletonInstance
	{
		private static final BillPughSingleton billPughSingleton = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance()
	{
		return SingletonInstance.billPughSingleton;
	}
	
	public void showMessage()
	{
		System.out.println(this.hashCode());
	}

}
