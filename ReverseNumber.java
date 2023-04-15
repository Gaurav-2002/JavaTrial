// WAP in java to accept a number and display the reverse of a number 
// n= 6432 rev = 2346
//  rev =0  while (n> 0) rev = rev*10+n%10; n = n / 10   print rev


import java.util.Scanner;
public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        
    
        int rev = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter Number ");
        int n = sc.nextInt();
        int n1 = n;
        while ( n> 0 )
        {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(n1 +" is the reverse of "+ rev);
    }
}
