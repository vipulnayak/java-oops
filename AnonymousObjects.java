class A
{
	public A()
	{
		System.out.println("object created");
	}
	public void show()
	{
		System.out.println("in A show");
	}
}


public class AnonymousObjects
{
	public static void main(String a[]) 
	{		
		new A();   //anonymous object
		new A().show();
		
//		A obj=new A();
		// A obj;
		// obj=new A();
		
		// obj.show();
	}
}

