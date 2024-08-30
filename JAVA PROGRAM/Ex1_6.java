import java.util.*;
public class Ex1_6 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int temp;

		System.out.print("\n Enter the number first ");
		int a = sc.nextInt();

		System.out.print("\n Enter the number scoend ");
		int b = sc.nextInt();

		if(b > a){
			temp = b;
			b = a;
			a = temp;	
		}

		System.out.print("\n Enter the number therd");
		int c = sc.nextInt();

		if(c > b){
			if(c > a){
				temp = c;
				c = b;
				b = a;
				a = temp;
			}
			
			else{
				temp = b;
				b = c; 
				c = temp;
			}
		}
		
		System.out.print("\n Decreasing Order :" + a + " "+ b + " " + c );	
		
	}
}
 