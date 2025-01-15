package Creational.Singleton;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		//LazySingleton
		
		System.out.println("Singleton - Lazy Instantiation");
		LazySingleton ls1 = LazySingleton.getInstance();
		LazySingleton ls2 = LazySingleton.getInstance();
		ls1.showMessage(); //shows same hashcode since the object is same
		ls2.showMessage(); //shows same hashcode since the object is same
		
		//The string "Lazy Singleton implementation" is only displayed 
		//one time since the object is only created once.
		
		//This implementation is not thread-safe. If multiple threads call getInstance() 
		//simultaneously when instance is null, it's possible to create multiple instances.
		
		System.out.println("Singleton - Threadsafe synchronized instantiation");
		ThreadSafeSingleton tss1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton tss2 = ThreadSafeSingleton.getInstance();
		tss1.showMessage(); //shows same hashcode since the object is same
		tss2.showMessage(); //shows same hashcode since the object is same
		
		
		System.out.println("Singleton - Double check locking instantiation");
		DoubleCheckedSingleton dss1 = DoubleCheckedSingleton.getInstance();
		DoubleCheckedSingleton dss2 = DoubleCheckedSingleton.getInstance();
		dss1.showMessage(); //shows same hashcode since the object is same
		dss2.showMessage(); //shows same hashcode since the object is same
		
		
		//instance is created before knowing if its really required.
		System.out.println("Singleton - Eager instantiation");
		EagerSingleton es1 = EagerSingleton.getInstance();
		EagerSingleton es2 = EagerSingleton.getInstance();
		es1.showMessage();
		es2.showMessage();
		
		System.out.println("Singleton - Bill Pugh instantiation");
		BillPughSingleton bp1 = BillPughSingleton.getInstance();
		BillPughSingleton bp2 = BillPughSingleton.getInstance();
		bp1.showMessage();
		bp2.showMessage();
		
		System.out.println("Singleton - Enum usage");
		EnumSingleton ens1 = EnumSingleton.INSTANCE;
		EnumSingleton ens2 = EnumSingleton.INSTANCE;
		ens1.showMessage();
		ens2.showMessage();
		
		
		
		
		
	}

}
