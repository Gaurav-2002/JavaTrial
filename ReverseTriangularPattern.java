/*     ****
       ***
       **
       *
 row = 4
 r1=4
 r2=3
 r3=2
 r1=1    r+1-i  4+1-i
 */

import java.util.Scanner;
class ReverseTriangularPattern
{
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("Please Enter no of rows: ");
            int r = sc.nextInt();
            for(int i=1; i<=r; i++)
            {
                for(int j=1; j<=(r+1-i); j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }    
        }
    
}
