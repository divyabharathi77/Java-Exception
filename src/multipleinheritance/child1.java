package multipleinheritance;

public class child1 extends Childclass implements Parent1,Parent2 {
	public void show()
	{
		System.out.println("child1 show");
	}
	public static void main(String[] args) {
		
		 child1 ch=new child1();//polymorphic reference
		 ch.show();
	}

}
