package encapsulationPgm;

public class EncapsulationPgm1 {
	
	private char name;
	private int age;
	
	public void setterMethd(char name,int age)
	{
		this.name = name;
		this.age  = age;
	}
	public void getterMethd()
	{
		System.out.println("inside getterMethord");
		System.out.println("name and age=  " +name +" "+age);
	}

}
