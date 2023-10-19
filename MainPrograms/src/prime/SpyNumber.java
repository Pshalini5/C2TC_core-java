package prime;

public class SpyNumber {

	public static void main(String[] args) {
		int product=1,sum=0,rem;
		int n=22;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			product=product*rem;
			n=n/10;
			
		}
if(sum==product)
	System.out.println("spy numbver");
else
	System.out.println("not spy number");
	}

}
