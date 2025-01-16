//reference: https://www.youtube.com/watch?v=mxcRJLpuTR8

package Creational.Singleton;

import java.lang.reflect.Constructor;

public class ReflectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reflection test for Lazy Singleton -- FAILED since more than 1 object can be created.
		
		LazySingleton ls1 = LazySingleton.getInstance();
		ls1.showMessage();
		
		try 
		{
			Constructor<?>[] constructors = LazySingleton.class.getDeclaredConstructors();
			for (Constructor<?> constructor: constructors)
			{
				constructor.setAccessible(true);
				LazySingleton ls2 = (LazySingleton) constructor.newInstance();
				ls2.showMessage();
			}
			
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		//reflection test for Thread safe Singleton -- FAILED since more than 1 object can be created.
		
		ThreadSafeSingleton ts1 = ThreadSafeSingleton.getInstance();
		ts1.showMessage();
		
		try 
		{
			Constructor<?>[] constructors = ThreadSafeSingleton.class.getDeclaredConstructors();
			for (Constructor<?> constructor: constructors)
			{
				constructor.setAccessible(true);
				ThreadSafeSingleton ts2 = (ThreadSafeSingleton) constructor.newInstance();
				ts2.showMessage();
			}
			
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		//reflection test for Double checked Singleton -- FAILED since more than 1 object can be created.
		
		DoubleCheckedSingleton dcs1 = DoubleCheckedSingleton.getInstance();
		dcs1.showMessage();
				
		try 
		{
			Constructor<?>[] constructors = DoubleCheckedSingleton.class.getDeclaredConstructors();
			for (Constructor<?> constructor: constructors)
			{
				constructor.setAccessible(true);
				DoubleCheckedSingleton dcs2 = (DoubleCheckedSingleton) constructor.newInstance();
				dcs2.showMessage();
			}
					
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		//reflection test for Eager Singleton -- FAILED since more than 1 object can be created.
		
		EagerSingleton es1 = EagerSingleton.getInstance();
		es1.showMessage();
				
		try 
		{
			Constructor<?>[] constructors = EagerSingleton.class.getDeclaredConstructors();
			for (Constructor<?> constructor: constructors)
			{
				constructor.setAccessible(true);
				EagerSingleton es2 = (EagerSingleton) constructor.newInstance();
				es2.showMessage();
			}
					
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		//reflection test for Bill Pugh Singleton -- FAILED since more than 1 object can be created.-- donno how to fix
		
		BillPughSingleton bps1 = BillPughSingleton.getInstance();
		bps1.showMessage();
				
		try 
		{
			Constructor<?>[] constructors = BillPughSingleton.class.getDeclaredConstructors();
			for (Constructor<?> constructor: constructors)
			{
				constructor.setAccessible(true);
				BillPughSingleton bps2 = (BillPughSingleton) constructor.newInstance();
				bps2.showMessage();
			}
					
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		//reflection test for Enum Singleton
		
		EnumSingleton enums1 = EnumSingleton.INSTANCE;
		try 
		{
			Constructor<?>[] constructors = EnumSingleton.class.getDeclaredConstructors();
			for (Constructor<?> constructor: constructors)
			{
				constructor.setAccessible(true);
				EnumSingleton enums2 = (EnumSingleton) constructor.newInstance();
				enums2.showMessage();
			}
					
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		

	}

}
