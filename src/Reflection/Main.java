package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		Cat myCat = new Cat("Stella",2);
		
		System.out.println(myCat.getName());
		System.out.println(myCat.getAge());
		
		//reflection
		
		//fields
		Field[] catFields = myCat.getClass().getDeclaredFields();
		
		for (Field field : catFields)
		{
			//System.out.println(field.getName());
			if (field.getName().equals("Name"))
			{
				field.setAccessible(true);
				field.set(myCat, "fred");
			}
		}
		
		System.out.println(myCat.getName());
		System.out.println(myCat.getAge());
		
		//methods
		Method[] catMethods = myCat.getClass().getDeclaredMethods();
		
		for (Method method : catMethods)
		{
			//System.out.println(method.getName());
			
			//calling a public method within the class
			if (method.getName().equals("meow"))
			{
				method.setAccessible(true);
				method.invoke(myCat);
				
			}
			
			//calling a private static method in the class
			if (method.getName().equals("heyThisisPrivate"))
			{
				method.setAccessible(true);
				method.invoke(myCat);
				
			}
			
			//calling a public static method, you don't need an object for this.
			if (method.getName().equals("thisisaPublicStaticMethod"))
			{
				method.setAccessible(true);
				method.invoke(null);
				
			}
	
		}
		

	}

}
