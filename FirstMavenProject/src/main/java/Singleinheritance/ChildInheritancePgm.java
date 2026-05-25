package Singleinheritance;

public class ChildInheritancePgm extends ParentInheritance {
	public void show() {
		System.out.println("inside show");
		
	}

	public static void main(String[] args) {
		
		ChildInheritancePgm obj = new ChildInheritancePgm();
		obj.add(5, 6);
		obj.show();
		
		
	}

}
