abstract class Bikes{
	Bikes()
{
System.out.println("bike is created");
} 
abstract void run();
void changeGear() {
System.out.println("gear changed");
}
}
class Hondas extends Bikes{ 
	void run() {
System.out.println("running safely");
} } 
class Demo3{
public static void main(String args[]){
	Hondas h =new Hondas(); 
	h.run();
h.changeGear();

} }
