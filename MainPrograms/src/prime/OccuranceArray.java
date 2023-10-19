package prime;

public class OccuranceArray {

	public static void main(String[] args) {
		int a[] ={1,5,2,1,8,2};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
	System.out.println(a[i]);
		}
		int x=5;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				count++;
				
			}
		}
		System.out.println(count);
	}

}
