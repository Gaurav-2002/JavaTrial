// Armstrong no if the  sum of number of digits cube is equal to given number then no is Armstrong no
// (153, 370, 371, 407 )


import java.util.Scanner;
import java.lang.Math;
class ArmstrongNumber
{
 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Number Check For Armstrong or Not: ");
        int n =sc.nextInt();
        int sum =0, n1=n;

        while(n>0)                        
        {
            int digit = n % 10;            
            sum +=(Math.pow(digit,3));   
            n = n / 10;                     
        }                                                                                                                                                                                                          
        if(sum == n1)
            System.out.println(n1+" is Armstrong number");
        else
            System.out.println(n1+" is not Armstrong Number ");


    }
}

/* Dry Run 
    n = 153                                           n = 15                n = 1
    {
            int digit = n % 10;             digit = 153 % 10 = 3                             digit = 15 % 10 = 5  //digit = 1%10=1
            sum +=(Math.pow(digit,3));    sum = sum + pow(3,3) =  sum = 0 + 3*3*3  =27        sum = 27 + 5*5*5 = 152// sum  =152+1*1*1 =153 
            n = n / 10;                      n = 153 / 10 = 15                                n = 15 / 10 = 1              n = 1/10 =0.1 < 0
            condition wrong loop terminate then check sum = n1 153 ==153 so execute if block             
    }




 */