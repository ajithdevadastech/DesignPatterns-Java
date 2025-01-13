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
	}

}
