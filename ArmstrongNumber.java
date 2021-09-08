package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number=153,remainder,sum = 0;
		int Temp=number;
		while(number!=0)
		{
			remainder = number % 10;
            sum = sum +(remainder*remainder*remainder);
            number = number / 10;
		}
		
		if(Temp==sum)
		{
			System.out.println("it as Armstrong number" );
		}
		else
		{
			System.out.println("it as NOT Armstrong number" );
		}
	}

}
