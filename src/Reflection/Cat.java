//reflection: https://www.youtube.com/watch?v=bhhMJSKNCQY

package Reflection;

public class Cat {

	private final String Name;
	private int Age;
	
	public Cat (String name, int age)
	{
		this.Name = name;
		this.Age = age;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void setAge(int age)
	{
		this.Age = age;
	}
	
	public int getAge()
	{
		return Age;
	}
	
	public void meow()
	{
		System.out.println("Meow");
	}
	
	private static void heyThisisPrivate()
	{
		System.out.println("how did you call this?");
	}
	
	public static void 	thisisaPublicStaticMethod()
	{
		System.out.println("This is a public static method");
	}
	
}
