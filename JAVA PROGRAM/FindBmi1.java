import java.util.*;
public class FindBmi1{
	
	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);

		System.out.print("\n Enter weight in Pounds : ");
		double pound = sc.nextDouble();

		System.out.print("\n Enter Height in inches : ");
		double inches = sc.nextDouble();

		double BMI = (pound * 0.45359237) / ((inches * 0.0254) * (inches * 0.0254));

		System.out.print("\n BMI = " + BMI);
	}

}
