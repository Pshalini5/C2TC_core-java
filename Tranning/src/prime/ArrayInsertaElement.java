package prime;

public class ArrayInsertaElement {
public static void main(String[] args) {
	int x,pos,n;
	 int arr[]=new int[n+1];
	 System.out.println("enter the elemnts you want");
	 x=3;
	 pos=2;
	 n=a.length+1;
	 for(int i=(n-1);i>=(pos-1);i--)
	 {
		 a[i+1]=a[i];
		 
	 }
	 a[pos-1]=x;
	 System.out.println("after inserting"); 
	 for(int i=0;i<n;i++)
	 {
		 System.out.println(a[i]+" , "); 
	 }
	 System.out.println(a[n]);
} 

}
 