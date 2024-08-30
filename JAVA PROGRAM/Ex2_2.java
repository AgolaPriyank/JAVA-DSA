import java.util.*;
public class Ex2_1{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter size of array : ");
		int n = sc.nextInt();
		int A[][] = new int[n][n];

		for(int i = 0 ; i<n ; i++){

			for(int j = 0; j<n ; j++){
				
				A[i][j]= sc.nextInt();
			}

		}
		
		System.out.print("\n minimum element and their index = "+ minElement(A));

	}


	public static int minElement(int A[][]){
		int min = A[0][0];
		int indexi,indexj;
		
		for(int i = 0 ; i<n ; i++){

			for(int j = 0 ; j<n ; j++){

				if(A[i][j] < min){

					min = A[i][j];
					indexi = i;
					indexj = j;
				}
			}
		}

		return min , indexi , indexj;
	} 
}