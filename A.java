import java.util.Scanner;
class A
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter name ");
        String S = scan.nextLine();
        System.out.println(" Enter no ");
        int n = scan.nextInt();
        System.out.println(n*2);
       
        System.out.println(S);
    }
}