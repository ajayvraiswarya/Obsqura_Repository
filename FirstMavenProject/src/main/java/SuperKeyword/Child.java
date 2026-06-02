package SuperKeyword;

public class Child extends Parent{
	
	int age = 50;
	public void getAge()
	{
		System.out.println("Child class age=" + age);
		System.out.println("Parentclass age=" + super.age);
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.getAge();
	}

}
