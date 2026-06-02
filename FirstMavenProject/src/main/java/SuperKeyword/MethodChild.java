package SuperKeyword;

public class MethodChild extends MethordParent {
	
	public void getDetails(String name)
	{
		System.out.println("In Child class" + name);
		super.getDetails("Venugopal");
	}

	public static void main(String[] args) {
		
		MethodChild obj = new MethodChild();
		obj.getDetails("Ajay");
	}

}
