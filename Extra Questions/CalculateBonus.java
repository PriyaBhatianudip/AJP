import java.util.Scanner;

class CalculateBonus
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your salary : ");
		int salary = sc.nextInt();

		if(salary>=50000)
		{
			int bonus = (int)(salary*0.10);
			System.out.println("Bonus : "+bonus);
		}	
		else
			System.out.println("No Bonus!");
	}
}