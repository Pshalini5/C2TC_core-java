package prime;

public class SumOfDigits {
public static void main(String[] args) {
	int num=5675,digit,sum=0;
	while(num>0) {
		digit=num%10;//fetching last digit
		sum=sum+digit;//total sum
		num=num/10;//removing
		
	}
	System.out.println(sum);
	
}
}
 