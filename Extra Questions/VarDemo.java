class VarDemo
{
	int x=100;  // global variable
	static int y=1000; // static variable  - sharable resource in all the objects. 

	public void display()
	{
		int a=10;  // local variable
		
		System.out.println("x :"+x);
		System.out.println("y :"+y);
	}
}