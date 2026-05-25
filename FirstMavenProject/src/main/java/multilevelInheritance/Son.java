package multilevelInheritance;

public class Son extends Father {
	
	public void div(int a, int b)
	{
		System.out.println("inside Son");
		int c = a/b;
		System.out.println("division =" + c);
	}

	public static void main(String[] args) {
		
		Son obj = new Son();
		obj.add(12,5);
		obj.sub(12,5);
		obj.div(12,5);

	}

}
