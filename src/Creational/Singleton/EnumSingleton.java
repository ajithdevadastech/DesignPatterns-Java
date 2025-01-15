package Creational.Singleton;

public enum EnumSingleton {
	
	INSTANCE;
	
	public void showMessage()
	{
		System.out.println(this.hashCode());
	}

}
