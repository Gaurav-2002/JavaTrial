// WAP in java to accept a number a calculate its factorial
// n = 5 , fact = 1  for( int i = 1; i<=n; i++)  fact = fact * i;

import java.util.Scanner;
public class Factorial
 {
    public static void main(String[] args) 
    {
        System.out.print("Please Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<=n; i++)
            
            fact = fact*i;
        System.out.println(fact+" is the factorial of "+n);
    }

}
