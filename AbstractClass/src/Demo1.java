abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("drawing circle");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		//Shape s=new Rectangle();
		Shape s=new Circle();
s.draw();
	}

}
