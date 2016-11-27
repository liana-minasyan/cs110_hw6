import shapes.shapes.Square;
import shapes.shapes.Rectangle;
import utils.math;

public class Driver{
public static void main(String [] args){
	
	Rectangle sides = new Rectangle(50,80);
	Square side = new Square(100);
	double value = 15.6;
	int i = (int)value;
	
System.out.println(math.factorial(i));
System.out.println(math.factorialloop(i));
System.out.println(sides.getArea());
System.out.println(side.getArea());
}
}