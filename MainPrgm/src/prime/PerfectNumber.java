package prime;

public class PerfectNumber {

	public static void main(String[] args) {
		int num=6, sum=0;
		
		for(int i=1;i<6;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
			System.out.println("perfect number");
		else
			System.out.println("is not a perfect number");
	}

}
