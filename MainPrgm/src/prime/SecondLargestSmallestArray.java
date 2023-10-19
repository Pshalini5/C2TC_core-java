package prime;
public class SecondLargestSmallestArray {

	public static void main(String[] args) {
		
	int[] arr= {10,20,30,40,50};
	int temp;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			}
		System.out.println("second largest elementis"+arr[arr.length-2]);
		System.out.println("second smallest elementis"+arr[0]);
	}
	
	}	
	
}

//int arr[]= {89,67,97,45,76};
		//int n=arr.length;
		//Arrays.sort(arr);
		//System.out.println("second smallest elementis"+arr[1]);
		//System.out.println("second largest elementis"+arr[n-2]);
