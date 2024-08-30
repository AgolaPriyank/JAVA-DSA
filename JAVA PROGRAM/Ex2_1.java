import java.util.Random;
public class Ex2_1{

	public static void main(String[] args){

		int A [] [] = generateA();

		displayA(A);

		if(checkOddOnes(A)){

			System.out.println("Every row and column has an odd number of 1s.");

		}
		else{
			System.out.println("Not every row and column has an odd number of 1s.");

		}
		
	}


	private static int[][] generateA(){

		int A[][] = new int[6][6];
		Random r = new Random();

		for(int i = 0 ; i< 6 ; i++){
	
			for(int j = 0 ; j < 6 ; j++){
		
				A[i][j] = r.nextInt(2);
			}
		}

		return A;
	}

	private static void displayA(int A[][]){

		System.out.println("Generated Matrix:");

		for(int i=0 ; i<6 ; i++){

			for(int j=0 ; j<6 ; j++){

				System.out.print(A[i][j]+ " ");
			}
			System.out.println();
		}

	}

	private static boolean checkOddOnes(int A[][]){
		for (int i = 0; i < 6; i++) {

	 		int rowSum = 0;
            		int colSum = 0;

            		for (int j = 0; j < 6; j++) {
                		rowSum += A[i][j];
                		colSum += A[j][i];
            		}

            		if (rowSum % 2 == 0 || colSum % 2 == 0) {
               	 		return false;
            		}
        	
		}

        	return true;
   	}

}

