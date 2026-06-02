package accessModifier;

public class ProtectedPgm1 {
	
	protected void getName(String name)
	{
		System.out.println("In Protected class " + name);
	}

	public static void main(String[] args) {
		
		ProtectedPgm1 obj4 = new ProtectedPgm1();
		obj4.getName("ajay");

	}

}
