

import java.util.Scanner;

public class User
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner (System.in);
		System.out.println(" Please Enter UserName ");
		String username = obj.nextLine();
		System.out.println(" Please Enter Password ");
		String password = obj.nextLine();
		if (username.equals("admin")  && password.equals("root")) //obj.equals("string") --->  compare string
		{
			System.out.println(" Login Successfull ");
		}
		else
		{
			System.out.println(" Invalid username or password ");
		}
	}
}


