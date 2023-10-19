package prime;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int sumofcube=0,a,temp;
		int number=153;
		temp=number;
		while(number>0)
		{
			a=number%10; 
			number=number/10;
			sumofcube=sumofcube+(a*a*a);
		}
		if(temp==sumofcube)
			System.out.println("is armstrong number");
			else
				System.out.println("is not armstrong number");
	}

}
