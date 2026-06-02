package accessModifier;

public class PrivateAccessPgm {
	
	private void getName(String name)
	{
		System.out.println("In Private access modifier " + name);
	}

	public static void main(String[] args) {
		
		PrivateAccessPgm obj = new PrivateAccessPgm();
		obj.getName("ajay");
	}

}
