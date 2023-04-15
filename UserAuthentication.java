/* WAP  in java for user authentication module to accept username and password from the username and check 
   whether the  username = admin and password = root if it is show then display the message Login Successfull other wise display 
   Invalid username and password
*/


import java.util.Scanner;

public class UserAuthentication 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner (System.in);
		System.out.println(" Please Enter UserName ");
		String username = obj.nextLine();
		System.out.println(" Please Enter Password ");
		String passwd = obj.nextLine();
		if (username == "admin" && passwd == "root")
		{
			System.out.println(" Login Successfull ");
		}
		else
		{
			System.out.println(" Invalid username or password ");
		}
	}
}


