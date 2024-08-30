import java.util.*;
public class ConvertNumber{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number in metre");
		int metre = input.nextInt();
		float feet;
		feet = metre * (3.28f);
		System.out.println("feet = " + feet);
	}
}
