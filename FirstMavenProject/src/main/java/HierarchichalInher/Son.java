package HierarchichalInher;

public class Son extends Father{
	public void sonDetails(String name, int age)
	{
		System.out.println("Son name and age" +name + age);
	}

	public static void main(String[] args) {
		Son obj = new Son();
		obj.fatherName("venu");
		obj.sonDetails("ajay",32);
	}

}
