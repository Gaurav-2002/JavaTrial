

  class BasicOperator 
{	//TODO Auto-Generated method stub
	public static void main(String[] args)
	{
	
//		Assignment Operator
		
		int x=89;// R -> L
		
//		Unary Operator
		x++; //Post Increment
		System.out.println(x); //90
		
		x--; //Post decrement
		System.out.println(x); //89
		
//		Shorthand Operators
		x+=2; // x= x+2
		System.out.println(x); //91
		
		x *=2;
		System.out.println(x); //182
		
		 
		int y= x%10;
		System.out.println(y); //2
		
//		Questions
		int num=78;
		System.out.println(num++); //78 num++ pehle print phir increment
		// 79
		
		System.out.println(++num);  //80 ++num pehle increment phir print
		
		System.out.println(num);
		
		 num=100;
		 System.out.println(--num); //99
		 System.out.println(num--); //99
		 //98
		 System.out.println(num);//98
		 num=25;
		 
		 
		 num= 101;
		 num= ++num - --num - num++ + ++num - num++; // 102 - 101 - 101 + 103 -103  // output = -100
		 System.out.println(num); //-100
		 
		 byte litresOfPetrol =Byte.MAX_VALUE;//127
		 litresOfPetrol +=2;//
		 System.out.println(litresOfPetrol); //-127
		 
		 
	
		 
		 
		 
		 
		 
		 
		 
		  
		 // Comparison Operators == != > <>= <=
		 
		 num=19;
		 y=18;
		 if(num != y)
		 {
			 System.out.println(true);	 
		 }
		 else
		 {
			 System.out.println(false);
		 }
		 
		 // Bitwise Operators
		 // DSA
		 
		 int example =7;
		 example =8 << 3; // *2 // left shift 7*2*2*2 = 56
		 System.out.println("Left Shift " +  example);
		 example = 8 >> 1; // right shift 8 /2
		 System.out.println("RIGHT SHIFT "+ example);
		 
	}
}