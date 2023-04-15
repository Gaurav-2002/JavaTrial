// WAP in java to accept two number and swap numbers without  any third variable
// before swap a = 5, b = 2, after swap a = 2 , b = 5
// implement logic for swap without any third variable 
// a = a + b,  a = 5 + 2 = 7,    a = 7
// b = a - b, b = 7 - 2 = 5      b = 5
// a = a - b, a = 7 - 5 = 2      a = 2


import java.util.Scanner;
class Swap
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please Enter First Number a = "); 
        int a = sc.nextInt();

        System.out.print(" Please Enter Second Number b = ");  
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping value a and b is a = " + a +" , b = "+ b);
    }
}