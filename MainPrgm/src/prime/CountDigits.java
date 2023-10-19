package prime;

public class CountDigits {

	public static void main(String[] args) {
		int num=87469877,count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}
