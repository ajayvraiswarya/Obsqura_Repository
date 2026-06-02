package polymorphisam;

public class CompileTimePolpgm1 {
	
	public void addNum()
	{
		System.out.println("Without parameters AddNum");
	}
	
	public void addNum(int a,int b)
	{
		int c = a+b;
		System.out.println("Sum of two numbers = " +c);
	}
	public void addNum(int a,int b,int c)
	{
		int d =a+b+c;
		System.out.println("Sum of three numbers = " +d);
	}

	public static void main(String[] args) {
		
		CompileTimePolpgm1 obj1 = new CompileTimePolpgm1();
		obj1.addNum();
		obj1.addNum(2, 3);
		obj1.addNum(2, 3, 5);
	}

}
