package accessModifier;

public class DefaultModifPgm {
	void getValues(int age, String name)
	{
		System.out.println("Inside Default Class");
		System.out.println(age);
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		DefaultModifPgm obj4 = new DefaultModifPgm();
		obj4.getValues(32, "ajay");
	}

}
