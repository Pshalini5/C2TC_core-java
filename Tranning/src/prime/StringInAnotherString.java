package prime;
//string is non=primitive datatype,and inbuilt function
public class StringInAnotherString {

	public static void main(String[] args) {
		String str1="sha";
		String str2=new String("lini");//using new keyword
		
		String result1 = str1 + "" + str2;
        System.out.println("Result 1: " + result1); 
		String str3 = "Java";
		String str4 = "PROGRAMMING";
		
		String result2 = str3.concat(" ").concat(str4);
		System.out.println("Result 2: " + result2);
		str4=str4.toLowerCase();//lowercase
		System.out.println(str4);
		str3=str3.toUpperCase();//uppercase
		System.out.println(str3);
		str2=str2.concat("cse-d");//concat
		System.out.println(str2);
		str4=str4.substring(1,5);//substring
		System.out.println(str4);
		//length
		String a="shalini";
		System.out.println(a.length());
		System.out.println(a.isEmpty());//empty or not
		//covert string to char 
		String s1="AndamanandNicobar";
		char[]x=s1.toCharArray();
		System.out.println(x);
		String[] y=s1.split("  ");//split 	
		System.out.println(y);
		}
	}


