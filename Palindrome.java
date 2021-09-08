package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int Number=454,remainder=0,Sum=0;
		    int Temp=Number;
		    while(Number>0)
		    {    
	            remainder=Number%10;    
	            Sum= Sum*10 +remainder;    
	            Number=Number/10;    
		    }    
		    if(Temp==Sum)
		    {
			System.out.println("Palindrome");
		    }
		    else
		    {
		       	System.out.println("Not a Palindrome"); 
		    }
		}

}

