//  WAP in Java to create a method which is capable of testteam if the number is spynumber (1124 22 123 132) or not ....?
// spy number =  a spy number if the sum and product of its digits are equal..

import java.util.*;
class Spyware
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(a); 
        spy(a);
    }

     static void spy(int a)   
    {
        int sum = 0, product =1;
        while(a > 0)                              //  a = 22  digit = 22 % 10 = 2  sum = 0 +2 = 2 product = 1*2 = 2  a = 22 / 10 = 2
        {    
            int digit = a % 10;                     // a = 2   digit = 2 % 10  =2    sum = 2 +2 =4  product = 2*2 = 4  a = 2 / 10 = 0.2  < 2                                                      
            sum = sum + digit;                          // // condition wrong  Loop terminate
            product = product * digit;
            a = a /10;
        }
        if ( sum == product )                                       // sum = 4 product =4  true
        
            System.out.println(" is a Spyware number ");          // so, print
        else

            System.out.println(" is not spyware no ");













        }
    }

