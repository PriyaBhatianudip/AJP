class Demo
{
	public static void main(String args[])
	{

		//print a message
		System.out.println("Hello World!!");

		VarDemo vd1 = new VarDemo();
		vd1.x+=100;
		vd1.y+=100;

		vd1.display();

		VarDemo vd2 = new VarDemo();
		vd2.x+=10;
		vd2.y+=10;

		vd2.display();
		
	}
}