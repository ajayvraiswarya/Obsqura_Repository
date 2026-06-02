package aggregate;

public class Child {
	
	int c;
	int d;
	Parent obj; //aggregation
	public Child(int c,int d,Parent obj)
	{
		this.c = c;
		this.d = d;
		this.obj = obj;
	}
	public void show()
	{
		System.out.println("c" +c);
		System.out.println("d" +d);
		System.out.println("a" + obj.a);
		System.out.println("b" + obj.b);
	}

	public static void main(String[] args) {
		
		Parent obj1 = new Parent(2,3);
		Child obj2 = new Child(4,5,obj1);
		obj2.show();

	}

}
