public class Ex3_1{

	public static void main(String[] args){

		int lengthOfArgs = args.length;

		if(lengthOfArgs == 0){
	
			System.out.print("\n not Enter student name ");
			return;
		}

		System.out.print("\n  Number of argument : " + lengthOfArgs);

		String numName[] = { "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth",
                "Tenth","Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth", "Sixteenth", "Seventeenth",
                "Eighteenth", "Nineteenth", "Twentieth" };

		for(int i = 0 ; i < lengthOfArgs ; i++){

			System.out.print("\n"+(i+1) +":"+ numName[i] + " Student name is = " + args[i]);
		}		

	}
}