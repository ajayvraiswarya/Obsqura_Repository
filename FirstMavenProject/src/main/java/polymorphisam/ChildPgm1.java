package polymorphisam;

public class ChildPgm1 extends ParentPgm1 {
	
	public void addNumber(int a,int b)
	{
		super.addNumber(4, 5);
		System.out.println("in Child class");
		int c = a+b;
		System.out.println("sum ="+ c);
	}

	public static void main(String[] args) {
		
		//ChildPgm1 obj1 = new ChildPgm1();
		//obj1.addNumber(2, 4);
		
		ParentPgm1 obj2 = new ChildPgm1();
		obj2.addNumber(3, 4);

	}

}
