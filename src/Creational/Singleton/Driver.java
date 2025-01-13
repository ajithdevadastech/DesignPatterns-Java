package Creational.Singleton;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		//LazySingleton
		
		System.out.println("Singleton - Lazy Instantiation");
		LazySingleton ls1 = LazySingleton.getInstance();
		LazySingleton ls2 = LazySingleton.getInstance();
		
		//The string "Lazy Singleton implementation" is only displayed 
		//one time since the object is only created once.
		
		//This implementation is not thread-safe. If multiple threads call getInstance() 
		//simultaneously when instance is null, it's possible to create multiple instances.
		
		System.out.println("Singleton - Threadsafe synchronized instantiation");
		ThreadSafeSingleton tss1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton tss2 = ThreadSafeSingleton.getInstance();
		
		System.out.println("Singleton - Double check locking instantiation");
		DoubleCheckedSingleton dss1 = DoubleCheckedSingleton.getInstance();
		DoubleCheckedSingleton dss2 = DoubleCheckedSingleton.getInstance();
		
		System.out.println("Singleton - Eager instantiation");
		EagerSingleton es1 = EagerSingleton.getInstance();
		EagerSingleton es2 = EagerSingleton.getInstance();
		
		
		
	}

}
