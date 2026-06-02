package SuperKeyword;

public class ConstructorChild extends ConstructerParent {

	public ConstructorChild(int age)
	{
		super("Ajay");
		System.out.println("In child class" + age);
	}
	public static void main(String[] args) {
		ConstructorChild obj = new ConstructorChild(32);

	}

}
