/*                   *
                    ***
                   *****
                  *******


total row =4
rows    spaces  stars 
r1      3 (4-1)   1 (2*1-1)
r2      2 (4-2)   3 (2*2-1)
r3      1 (4-3)   5 (2*3-1)
r4      0 (4-4)   7 (2*4-1)
        ( r - i)    (2*i-1)
*/




import java.util.Scanner;
public class pyramid 
{ 
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please Enter no of rows: ");  
      int r = sc.nextInt();
      for(int i=1; i<=r; i++) //Loop for rows
      {
        for(int j =1; j<=r-i; j++) 
        {
        // Loop for print spaces
        System.out.print(" ");
        }
            for(int k=1; k<=(2*i-1); k++)
            {// loop for print stars
                System.out.print("*");
            }
            System.out.println();
      }
    }    
}
