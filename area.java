import java.util.*;
class Rectangle{
	public void getArea(double l,double b)
	{
		System.out.println("area of rectangle:"+l*b);
	}
	public void getperimeter(double l,double b)
	{
		System.out.println("perimeter of rectangle:"+(2*(l+b)));
	}
}
class Circle{
	public void getArea(int ra)
	{
		System.out.println("area of circle:"+(2*3.14*ra));
	}
	public void getperimeter(int ra)
	{
		System.out.println("perimeter of circle:"+(2*3.14*ra));
	}
}
class Square{
	public void getArea(int sa)
	{
		System.out.println("area of square:"+(sa*sa));
	}
	public void getperimeter(int sa)
	{
		System.out.println("perimeter of square:"+(4*sa));
	}
}




public class area{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		double l,b;
		
		System.out.println("Enter the length and breadth:");
		l=sc.nextDouble();
		b=sc.nextDouble();
		r.getArea(l,b);
		r.getperimeter(l,b);
		Circle c=new Circle();
		System.out.println("Enter the radius:");
		int ra=sc.nextInt();
		c.getArea(ra);
		c.getperimeter(ra);
		Square s=new Square();
		System.out.println("Enter the side of the square:");
		int sa=sc.nextInt();
		s.getArea(sa);
		s.getperimeter(sa);
	}
	}
