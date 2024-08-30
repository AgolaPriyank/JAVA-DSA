import java.util.Scanner;
import java.lang.Math;
public class Ex1_10{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("\n Enter side a of triangle : ");
		int a = sc.nextInt();

		System.out.print("\n Enter side b of triangle : ");
		int b = sc.nextInt();

		System.out.print("\n Enter side c of triangle : ");
		int c = sc.nextInt();

		int s = (a+b+c)/2;

		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.print("\n Area of triangle is " + area);
	}
}