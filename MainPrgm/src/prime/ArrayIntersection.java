package prime;

public class ArrayIntersection {

	public static void main(String[] args) {
		//int arr1[] = {23, 36, 96, 78, 55};
	      //int arr2[] = {78, 45, 19, 73, 55};
		String arr1[]= {"one","two","three","four"};
		String arr2[]= {"aaa","two","bbb","four"};
	      System.out.println("Intersection of the two arrays ::");
	     
	      for(int i = 0; i<arr1.length; i++ ) {
	         for(int j = 0; j<arr2.length; j++) {
	            if(arr1[i]==arr2[j]) {
	               System.out.println(arr1[i]);
	            }
	         }
	      }
	   }
	
	}

