import java.util.Scanner;
class Static_Method
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number: ");
        int num = sc.nextInt();
        even(num);
        prime(num);
    }

    static void even(int n)
    {
        for(int i=1; i<=n; i++)
        
            if(i%2==0) 
            
                System.out.println("Even no is: "+i);
     }

    static void prime(int a)
    {
        for(int i=1; i<=a; i++)
        {
            int k=0;
            for(int j=2; j<=i/2; j++)
               
                if(i%j==0)
                {
                    k++;
                    break;
                }
            
                if(k==0)
            
                    System.out.println("Prime no is: "+i);
            
        }
        
    }
}        
            
           
        
    


