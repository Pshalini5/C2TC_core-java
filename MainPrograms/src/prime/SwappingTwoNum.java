package prime;

public class SwappingTwoNum {

	public static void main(String[] args) {
		int x=100,y=200;
		
		System.out.println("before swap");
		System.out.println("x="+x);
		System.out.println("y="+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("after swap");
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
