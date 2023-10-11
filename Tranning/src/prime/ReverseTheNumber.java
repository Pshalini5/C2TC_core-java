package prime;
public class ReverseTheNumber {

	public static void main(String[] args) {
		int num=7665,rev=0;
		while(num!=0)
		{
			int remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
			
		}
		System.out.println(rev);
		
	}

}


