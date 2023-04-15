// WAP in java to accept a binary number a count 0 and 1


import java.util.*;
public class Binary
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please Enter Binary Number ");
      int n = sc.nextInt();
      String str = Integer.toString(n);
      int size = str.length();
      int k=0, r=0; 
      while(size>0)
      {
        int digit = n % 10;
        n = n/10;
        if( digit == 0 )
        {
            k++;
            break;
        }
        else
        {
         r++;
         size--;
        }
      }
      System.out.println(k);
      System.out.println(r);

    }
}
