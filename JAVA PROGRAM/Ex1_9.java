import java.util.Scanner;
public class Ex1_9{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter five digit number : ");
		int digit = sc.nextInt();

		if(digit > 9999 && digit < 100000){

			digit = digit + 11111;
			System.out.print("\n After adding number is " + digit);
		}

		else{
		
			System.out.print("\n Number has not five digit");
		}
	}
}