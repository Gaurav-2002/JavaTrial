// WAP in Java a cab provider to accept the details of customer which include Name , Distance, Traveller and Type of
// Car and then Calculate and display is given format

// Bill -------
// Name:        __________
// Distance:    __________
// Type of Car: __________
// Amount:      __________
// according to the slab

//  Amount/Km           Km
//    15                0-10
//    12                11-50
//    10                51-100
//     8                >101

//   No.    subcharge    Type
//   1      200          XUV
//   2      100          Compact XUV
//   3       50          H.B.

//   The Total Bill paid by the Customer is = the charge per km surcharge based on type of ...


import java.util.Scanner;
class Bill
{
    public static void main(String[]args)
    {
        String Car;
        int amount, charge;
        Scanner bill = new Scanner (System.in);
        System.out.println(" Enter Your Name ");
        String name =bill.nextLine();
        System.out.println(" Enter Distance ");
        int d = bill.nextInt();
        System.out.println(" Choose Valid Type Of Car ");
        System.out.println(" Enter 1 for XUV\n Enter 2 for  Compact XUV\n Enter 3 for H.B.\n");
        int T= bill.nextInt();
        if( d > 0 && d <= 10)
         amount = d*15;
         else if (d > 50 && d < 51)
          amount = d * 12;
          else
           amount = d * 8;
           if (T==1)
           {
              Car = " XUV ";
              charge=amount+200;
               
                 System.out.println(" Bill________  ");
                 System.out.println(" Name        : "+ name);
                 System.out.println(" Distance    : "+ d);
                 System.out.println(" Type of Car :"+ Car);
                 System.out.println(" Amount      : "+ charge);

          
           }
           else if (T==2)
           {
               Car =" Compact XUV ";
               charge = amount+100;

                 System.out.println(" Bill________  ");
                 System.out.println(" Name        : "+ name);
                 System.out.println(" Distance    : "+ d);
                 System.out.println(" Type of Car :"+ Car);
                 System.out.println(" Amount      : "+ charge);
           }
           else if ( T == 3)
           {
               Car = " H.B. ";
               charge = amount +50;

                System.out.println(" Bill__________");
                System.out.println(" Name        : "+ name);
                System.out.println(" Distance    : "+ d);
                System.out.println(" Type of Car : "+Car);
                System.out.println(" Amount      : "+ charge);
           }
         

    }
}