import java.util.*;
public class Ex1_7{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("\n Enter the letter : ");
		char ch = sc.next().charAt(0);

		switch(Character.toLowerCase(ch)){

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.print(ch + "is vowel\n");
			break;
		default:
			System.out.print(ch + "is constant\n");
		}
	}
}