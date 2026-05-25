package HierarchichalInher;

public class Daughter extends Father{
	public void daughterDetails(String name,int age)
	{
		System.out.println("Daughter details" +name +age);
	}

	public static void main(String[] args) {
		Daughter obj = new Daughter();
		obj.fatherName("ajay");
	}

}
