//print char using Unicode number
// print Unicode number using char

import java.util.Scanner;
class CharDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Unicode number : ");
		int ch = sc.nextInt();
		
		
		System.out.println("Char : "+(char)ch);

		System.out.println("Enter character : ");
		char ch1 = sc.next().charAt(0);
		System.out.println("Number  : "+(int)ch1);
	}
}