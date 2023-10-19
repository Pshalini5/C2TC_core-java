abstract class Bank{
abstract int RateOfInterest();
}
class SBI extends Bank{ 
	int RateOfInterest() {
return 7;
}
}
class HDFC extends Bank{ 
int RateOfInterest() {

return 8;

} }

class Demo2{

public static void main(String args[]){ SBI s = new SBI();

HDFC h = new HDFC(); h.RateOfInterest();
System.out.println("The rate of interest in SBI "+s.RateOfInterest()); 
System.out.println("The rate of interest in HDFC"+h.RateOfInterest());


	}

}
