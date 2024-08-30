import java.util.*;
 class Rectangle{

	double height = 1 , width = 1;

	Rectangle(){
	}

	Rectangle(double h , double w){

		this.height = h;
		this.width = w;
	}

	public double getArea()
	{

		double area;
		area = this.height * this.width;
		return area;
	}

	public double getPerimeter()
	{

		double perimeter;
		perimeter = 2*(this.height + this.width);
		return perimeter;
	}
}

public class Ex_3_2{

	public static void main(String[] args){

		Rectangle obj1 = new Rectangle();
		Rectangle obj2 = new Rectangle(40,4);
		Rectangle obj3 = new Rectangle(35.9,3.5);

		System.out.print("\n obj1 , h = " + obj1.height);
		System.out.print("\n obj1 , w = " + obj1.width);
		System.out.println();

		System.out.print("\n obj2 , h = " + obj2.height);
		System.out.print("\n obj2 , w = " + obj2.width);
		System.out.println();

		System.out.print("\n obj3 , h = " + obj3.height);
		System.out.print("\n obj3 , w = " + obj3.width);		
		System.out.println();
		//obj1.getArea();
		//obj1.getPerimeter();

		//obj2.getArea();
		//obj2.getPerimeter();

		//obj3.getArea();
		//obj3.getPerimeter();

		System.out.print("\n ----------------------------------------- \n");

		System.out.print("\nArea of the rectangle for obj1 : " + obj1.getArea());
		System.out.print("\nPerimeter of the rectangle for obj1 : " +obj1.getPerimeter());
		System.out.println();

		System.out.print("\nArea of the rectangle for obj2 : " + obj2.getArea());
		System.out.print("\nPerimeter of the rectangle for obj2 : " +obj2.getPerimeter());
		System.out.println();

		System.out.print("\nArea of the rectangle for obj3 : " +obj3.getArea());
		System.out.print("\nPerimeter of the rectangle for obj3 : " +obj3.getPerimeter());
		System.out.println();
	}
}