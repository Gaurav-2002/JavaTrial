/*      1234567     R1 1 to 7
        2345671     R2 2 to 7   1
        3456712     R3 3 to 7   1 to 2
        4567123     R4 4 to 7   1 to 3
        5671234     R5 5 to 7   1 to 4 
        6712345     R6 6 to 7   1 to 5
        7123456     R7 7        1 to 6
                     ( i to r)      ( 1 to i-1)
 */


import java.util.Scanner;
public class NumericalRectangular
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please Enter number of rows: ");
      int r = sc.nextInt();
      
      for(int i=1; i<=r;i++) // loop for rows
      {
        for(int j=i; j<=r; j++) 
        {// loop for print numbers  i to r
            System.out.print(j);
        }
            for(int k=1; k<=i-1; k++) 
            {
                System.out.print(k);
            }
            System.out.println();
      }
    }
}
/*          Dry Run
            r=7;
            i=1; 1<=7; i++ true
            j=1; 1<=7; j++ true fot j=2 true so - - - j=7 true  k=1; k<=i-1 1<=0
            print j  1234567    newline
                     2345671  
 */