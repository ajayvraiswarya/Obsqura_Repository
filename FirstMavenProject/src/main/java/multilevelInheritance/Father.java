package multilevelInheritance;

public class Father extends GrandFathet{
	
	public void sub(int a,int b)
	{
		System.out.println("inside father");
		int c = a-b;
		System.out.println("substraction =" + c);
	}

}
