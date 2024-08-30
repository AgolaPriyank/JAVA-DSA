import java.util.Scanner;
public class Ex1_8{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int h100=0 , f50=0 , t10=0 , f5=0 , t2=0 , o1=0;

		System.out.print("\nEnter the amount to be withdrawn : ");
		int amount = sc.nextInt();

		while(amount >= 100){
			
			h100++;
			amount -= 100;
		}

		while(amount >= 50){

			f50++;
			amount -= 50;
		}
		
		while(amount >= 10){

			t10++;
			amount -= 10;
		}

		while(amount >= 5){

			f5++;
			amount -= 5;
		}

		while(amount >= 2){

			t2++;
			amount -= 2;
		}

		while(amount >= 1){

			o1++;
			amount -= 1;
		}

		System.out.print("\n 100 : " + h100);
		System.out.print("\n 50 : " + f50);
		System.out.print("\n 10 : " + t10);
		System.out.print("\n 5 : " + f5);
		System.out.print("\n 2 : " + t2);
		System.out.print("\n 1 : " + o1);
	}
}