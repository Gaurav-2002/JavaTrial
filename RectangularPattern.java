
/*       ******
         ******
         ******
 */
// total row = 3 each row contain 6 (*) after 1 row complete then start from new line
import java.util.Scanner;
class RectangularPattern
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter no of rows: ");
        int r = sc.nextInt();
        System.out.println("Please Enter no of columns: ");
        int c = sc.nextInt();

        for(int i=1; i<=r; i++)
        {
            for( int j=1; j<=c; j++)
            {
              if(i==1||i==r||j==1||j==c)
                System.out.print("*");
              else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}